import java.util.ArrayList;
//此处需要注意的点是不同于c语言，java语言必须有一个类！而且很神奇的是main函数可以放在类里面（当然也没有#include）
public class Visitor extends lab4BaseVisitor<Void> {
    int index = 1;
    //看来int类型放之四海而皆准
    public static ArrayList<Symbol> symbolsstack = new ArrayList<>();
    int nownumber = 0;
    String nowidentName = "";
    String nowIRName = "";
    String nowType="";
    int layer = 0;
    int if_alone=0;
    public static ArrayList<String> ir_code = new ArrayList<>();
    int[] fun_decl = {0, 0, 0, 0, 0, 0, 0, 0};
    public void is_def_in_symbolsstack() {
        for (Symbol symbol : symbolsstack) {
            if (this.nowidentName.equals(symbol.old_name)&&(symbol.layer==this.layer)) {
                ir_code.add("符号栈中已有符号" + nowidentName + "\n");
                System.out.println("符号栈中已有符号" + nowidentName+symbol.layer);//注意已经没有print函数了，现在只有System.out.println，最坑的是S还要大写
                System.exit(1);
            }

        }
    }
//呜呜呜20201207北航学院路图书馆三层我前面的那个小姐姐好白好好看，我好喜欢！可是我又好菜，和北航的老鼠差不多，我不配呜呜呜QwQ
    @Override
    public Void visitConstDecl(lab4Parser.ConstDeclContext ctx) {
        return super.visitConstDecl(ctx);
    }

    @Override
    public Void visitConstDef(lab4Parser.ConstDefContext ctx) {
        if (layer == 0) {
            visit(ctx.ident());
            if (ctx.children.size() == 3) {
                is_def_in_symbolsstack();
                visit(ctx.constInitVal());
                ir_code.add("@" + this.nowidentName + " = dso_local global i32 " + this.nownumber + "\n");
                Symbol symbol = new Symbol(nowidentName, "@"+nowidentName, layer);
                symbol.num = this.nownumber;
                symbol.isconst = true;
                symbolsstack.add(symbol);
            }
        } else {
            String returnindex = index + "";
            ir_code.add("    %x" + (index++) + " = alloca i32\n");
            this.nowIRName="%x"+(index-1);
            visit(ctx.ident());
            is_def_in_symbolsstack();
            Symbol symbol = new Symbol(nowidentName, "%x" + (index - 1), layer);
            symbol.num = this.nownumber;
            symbol.isconst = true;
            symbolsstack.add(symbol);
            visit(ctx.constInitVal());
            ir_code.add("    store i32 %x" + (index - 1) + ", i32* %x" + returnindex + "\n");
        }

        return null;
    }


    @Override
    public Void visitVarDef(lab4Parser.VarDefContext ctx) {
        if (layer == 0) {
            String var="";
            visit(ctx.ident());
            var="@"+this.nowidentName;
            Symbol symbol = new Symbol(nowidentName,"@"+nowidentName, layer);
            if (ctx.children.size() == 3) {
                is_def_in_symbolsstack();
                visit(ctx.initVal());
                ir_code.add(var+ " = dso_local global i32 " + this.nownumber + "\n");
            }else {
                is_def_in_symbolsstack();
                ir_code.add(var+ " = dso_local global i32 " + 0 + "\n");
            }
            symbolsstack.add(symbol);
        } else {
            String returnindex = index + "";
            ir_code.add("    %x" + (index++) + " = alloca i32\n");
            this.nowIRName="%x"+(index-1);
            if (ctx.children.size() == 1) {
                visit(ctx.ident());
                is_def_in_symbolsstack();
                Symbol symbol = new Symbol(nowidentName, "%x" + (index - 1), layer);
                symbolsstack.add(symbol);
            } else if (ctx.children.size() == 3) {
                visit(ctx.ident());
                is_def_in_symbolsstack();
                Symbol symbol = new Symbol(nowidentName, "%x" + (index - 1), layer);
                symbolsstack.add(symbol);
                visit(ctx.initVal());
                ir_code.add("    store i32 %x" + (index - 1) + ", i32* %x" + returnindex + "\n");
            } else {
                System.out.println("vardef error");
                System.exit(1);
            }

        }

        return null;
    }

    @Override
    public Void visitFuncDef(lab4Parser.FuncDefContext ctx) {
        if (ctx.children.size() == 5) {
            ir_code.add("define dso_local i32 @main()\n");
            ir_code.add("{\n");
            visit(ctx.block());
            ir_code.add("}\n");
            return null;
        } else {
            ir_code.add("funcdef error\n");
            System.out.println("funcdef error");
            System.exit(1);
        }

        return null;
    }

    @Override
    public Void visitBlock(lab4Parser.BlockContext ctx) {
        layer++;
        if (ctx.children.size() >= 2) {
            for (int i = 0; i < ctx.children.size() - 2; i++) {
                visit(ctx.blockItem(i));
            }
        } else {

            System.out.println("block error");
            ir_code.add("block error");
            System.exit(1);
        }
        for (int i = symbolsstack.size()-1; i>=0; i--) {
            if (symbolsstack.get(i).layer==layer){
                symbolsstack.remove(i);
            }
        }
        layer--;
        return null;
    }

    @Override
    public Void visitBlockItem(lab4Parser.BlockItemContext ctx) {
        return super.visitBlockItem(ctx);
    }

    @Override
    public Void visitStmt(lab4Parser.StmtContext ctx) {
        if (ctx.children.size() == 4) {
            String lval, exp;
            visit(ctx.lVal());
            lval = this.nowIRName;
            for (Symbol symbol : symbolsstack) {
                if (symbol.new_name.equals(lval)) {
                    if (symbol.isconst) {
                        ir_code.add("不可改变常量值，该常量为" + symbol.old_name + "\n");
                        System.out.println("stmt error");
                        System.exit(1);
                    }
                }
            }
            visit(ctx.exp());
            exp = this.nowIRName;
            ir_code.add("    store i32 " + exp + ", i32* " + lval + "\n");
        }else if (ctx.children.size()==1&&!ctx.getChild(0).toString().equals(";")){
            visit(ctx.block());
            System.out.println("use block");
        }else if (ctx.getChild(0).getText().equals("continue")) {
            ir_code.add("continue");
            System.out.println("use continue");
        } else if (ctx.getChild(0).getText().equals("break")) {
            ir_code.add("break");
            System.out.println("use break");
        } else if (ctx.children.size()==2&&ctx.getChild(1).toString().equals(";")) {
            visit(ctx.exp());
            System.out.println("use exp");
        } else if (ctx.children.size() == 3) {
            visit(ctx.exp());
            ir_code.add("    ret i32 " + this.nowIRName + "\n");
        } else if (ctx.children.size() >= 5) {
            if (ctx.children.get(0).getText().equals("if")){
                if_alone=0;
                int cond=0,label1=0,label2=0,label3=0;
                this.nowType="";
                visit(ctx.cond());
                cond=index-1;
                label1=index;
                label2=index+1;
                index+=2;
                ir_code.add("    br i1 %x"+cond+",label %x"+label1+", label %x"+label2);
                if (ctx.children.size()==5){
                    ir_code.add("\nx"+label1+":\n");
                    visit(ctx.stmt(0));
                    ir_code.add("    br label %x"+label2+"\n");
                    ir_code.add("\nx"+label2+":\n");
                }else {
                    label3=index++;
                    ir_code.add("\nx"+label1+":\n");
                    visit(ctx.stmt(0));
                    ir_code.add("    br label %x"+label3+"\n");
                    ir_code.add("\nx"+label2+":\n");
                    visit(ctx.stmt(1));
                    ir_code.add("    br label %x"+(label3)+"\n");
                    ir_code.add("\nx"+label3+":\n");
                }
                this.nowIRName="%x"+(index-1);
            }else if (ctx.children.get(0).getText().equals("while")){
                System.out.println("use while");
                int cond=0,label1=0,label2=0,start=0,whilestart=0,whileend=0;
                whilestart=ir_code.size()-1;
                ir_code.add("    br label %x"+(index)+"\n");
                ir_code.add("\nx"+index+":\n");
                start=index;
                index++;
                visit(ctx.cond());
                cond=index-1;
                label1=index;
                label2=index+1;
                index+=2;
                ir_code.add("    br i1 %x"+cond+",label %x"+label1+", label %x"+label2+"\n");
                ir_code.add("\nx"+label1+":\n");
                visit(ctx.stmt(0));
                ir_code.add("    br label %x"+start+"\n");
                ir_code.add("\nx"+label2+":\n");
                whileend=ir_code.size()-1;
                for (int i = whilestart; i <= whileend; i++) {
                    if (ir_code.get(i).equals("break")){
                        ir_code.set(i,"    br label %x"+label2+"\n");
                    }else if (ir_code.get(i).equals("continue")){
                        ir_code.set(i,"    br label %x"+start+"\n");
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Void visitRelExp(lab4Parser.RelExpContext ctx) {
        if (ctx.children.size()==1){
            visit(ctx.addExp());
            if (if_alone==0){
                ir_code.add("    %x"+index+" = icmp ne i32 %x"+(index-1)+", 0\n");
                this.nowIRName="%x"+index;
                index++;
            }
        }else if (ctx.children.size()==3){
            if_alone=1;
            String left="",right="";
            visit(ctx.relExp());
            left=this.nowIRName;
            visit(ctx.addExp());
            right=this.nowIRName;
            if (ctx.getChild(1).getText().equals(">")){
                ir_code.add("    %x"+(index++)+" = icmp sgt i32 "+left+", "+right+"\n");
            }else if (ctx.getChild(1).getText().equals(">=")){
                ir_code.add("    %x"+(index++)+" = icmp sge i32 "+left+", "+right+"\n");
            }else if (ctx.getChild(1).getText().equals("<")){
                ir_code.add("    %x"+(index++)+" = icmp slt i32 "+left+", "+right+"\n");
            }else if (ctx.getChild(1).getText().equals("<=")){
                ir_code.add("    %x"+(index++)+" = icmp sle i32 "+left+", "+right+"\n");
            }
            this.nowIRName="%x"+(index-1);
            this.nowType="i1";
        }else {
            System.out.println("relexp");
            System.exit(1);
        }
        return null;
    }

    @Override
    public Void visitEqExp(lab4Parser.EqExpContext ctx) {
        if (ctx.children.size()==1){
            visit(ctx.relExp());
        }else if (ctx.children.size()==3){
            if_alone=1;
            String left="",right="";
            visit(ctx.eqExp());
            left=this.nowIRName;
            visit(ctx.relExp());
            right=this.nowIRName;
            if (ctx.getChild(1).getText().equals("==")){
                ir_code.add("    %x"+(index++)+" = icmp eq i32 "+left+", "+right+"\n");
            }else if (ctx.getChild(1).getText().equals("!=")){
                ir_code.add("    %x"+(index++)+" = icmp ne i32 "+left+", "+right+"\n");
            }
            this.nowIRName="%x"+(index-1);
            this.nowType="i1";
        }else {
            System.out.println("eqexp error");
            System.exit(1);
        }
        return null;
    }

    @Override
    public Void visitLAndExp(lab4Parser.LAndExpContext ctx) {
        if (ctx.children.size()==1){
            visit(ctx.eqExp());
        }else if (ctx.children.size()==3){
            if_alone=1;
            String left="",right="";
            visit(ctx.lAndExp());
            left=this.nowIRName;
            visit(ctx.eqExp());
            right=this.nowIRName;
            ir_code.add("    %x" +(index)+"= and i1 "+left+","+right+";\n");
            index++;
            this.nowIRName="%x"+(index-1);
            this.nowType="i1";
        }else {
            System.out.println("landexp error");
            System.exit(1);
        }
        return null;
    }

    @Override
    public Void visitLOrExp(lab4Parser.LOrExpContext ctx) {
        if_alone=0;
        if (ctx.children.size()==1){
            visit(ctx.lAndExp());
        }else if (ctx.children.size()==3){
            if_alone=1;
            String left="",right="";
            visit(ctx.lOrExp());
            left=this.nowIRName;
            visit(ctx.lAndExp());
            right=this.nowIRName;
            ir_code.add("    %x" +(index)+"= or i1 "+left+","+right+";\n");
            index++;
            this.nowIRName="%x"+(index-1);
            this.nowType="i1";
        }else {
            System.out.println("lorexp error");
            System.exit(1);
        }
        return null;
    }

    @Override
    public Void visitLVal(lab4Parser.LValContext ctx) {
        visit(ctx.ident());
        if (layer==0){
            for (int i=0;i<symbolsstack.size();i++){
                if (!symbolsstack.get(i).isconst){
                    System.out.println("宏观变量赋值时存在变量");
                    System.exit(1);
                }
            }
        }else {
            int flag1 = 0;
            for (Symbol symbol : symbolsstack) {
                if (symbol.old_name.equals(this.nowidentName)) {
                    this.nowIRName = symbol.new_name;
                    flag1 = 1;
                }
            }
            if (flag1 == 0) {
                System.out.println("字符表中不存在字符" + this.nowidentName);
                ir_code.add("字符表中不存在字符" + this.nowidentName + "\n");
                System.exit(1);
            }
        }

        return null;
    }

    @Override
    public Void visitAddExp(lab4Parser.AddExpContext ctx) {
        if (ctx.children.size() == 1) {// addexp->mulexp
            visit(ctx.mulExp());
        } else if (ctx.children.size() == 3)// addExp ('+' | '-') mulExp
        {
            if (layer == 0) {
                int lhs = 0, rhs = 0, result = 0;
                visit(ctx.addExp());
                lhs = this.nownumber;
                visit(ctx.mulExp());
                rhs = this.nownumber;
                if (ctx.getChild(1).toString().equals("+")) {
                    result = lhs + rhs;
                } else {
                    result = lhs - rhs;
                }
                this.nownumber = result;
            } else {
                String lhs = "", rhs = "";

                visit(ctx.addExp());
                lhs = nowIRName;

                visit(ctx.mulExp());
                rhs = nowIRName;

                if (ctx.getChild(1).toString().equals("+")) {
                    ir_code.add("    %x" + (index++) + " = add i32 " + lhs + ", " + rhs + "\n");
                } else {
                    ir_code.add("    %x" + (index++) + " = sub i32 " + lhs + ", " + rhs + "\n");
                }
                nowIRName = "%x" + (index - 1);
                this.nowType="i32";
            }

        } else {
            System.out.println("add exp wrong");
            ir_code.add("add exp wrong\n");
            System.exit(1);
        }
        return null;
    }

    @Override
    public Void visitUnaryExp(lab4Parser.UnaryExpContext ctx) {
        if (ctx.children.size() == 1) {
            visit(ctx.primaryExp());
        } else if (ctx.children.size() == 2) {
            visit(ctx.unaryExp());
            if (ctx.unaryOp().getText().equals("-")) {
                ir_code.add("    %x" + (index) + " = sub i32 " + 0 + ", %x" + (index - 1) + "\n");
                index++;
            }else if (ctx.unaryOp().getText().equals("!")){
                ir_code.add("    %x"+(index)+" = icmp eq i32 %x"+(index-1)+", 0\n");
                index++;
                ir_code.add("    %x"+index+" = zext i1 %x"+(index-1)+" to i32\n");
                index++;
            }
            this.nowIRName = "%x" + (index - 1);
            this.nowType="i32";

        } else if (ctx.children.size() >= 3) {
            visit(ctx.ident());
            String fun_name = this.nowidentName;
            if (fun_name.equals("getint")) {
                if (fun_decl[0] == 0) {
                    ir_code.add(0, "declare i32 @getint()\n");
                    fun_decl[0] = 1;
                }
                ir_code.add("    %x" + index + " = call i32 @getint()\n");
                index++;
                this.nowIRName="%x"+(index-1);
            } else if (fun_name.equals("putint")) {
                visit(ctx.funcRParams());
                if (fun_decl[1] == 0) {
                    ir_code.add(0, "declare void @putint(i32)\n");
                    fun_decl[1] = 1;
                }
                ir_code.add("    call void @putint(i32 " + this.nowIRName + ")\n");
            }else if (fun_name.equals("getch")){
                if (fun_decl[2]==0){
                    ir_code.add(0,"declare i32 @getch()\n");
                    fun_decl[2]=1;
                }
                ir_code.add("    %x" + index + " = call i32 @getch()\n");
                index++;
                this.nowIRName="%x"+(index-1);
            }else if (fun_name.equals("putch")){
                visit(ctx.funcRParams());
                if (fun_decl[3] == 0) {
                    ir_code.add(0, "declare void @putch(i32)\n");
                    fun_decl[3] = 1;
                }
                ir_code.add("    call void @putch(i32 " + this.nowIRName + ")\n");
            }else if (fun_name.equals("getarray")){
                visit(ctx.funcRParams());
                if (fun_decl[4]==0){
                    ir_code.add(0,"declare i32 @getarray(i32*)");
                    fun_decl[4]=1;
                }

            }else if (fun_name.equals("putarray")){
                visit(ctx.funcRParams());
                if (fun_decl[4]==0){
                    ir_code.add("declare void @putarray(i32,i32*)");
                    fun_decl[4]=1;
                }

            }
        } else {
            System.out.println("unaryexp error");
            System.exit(1);
        }
        return null;
    }


    @Override
    public Void visitPrimaryExp(lab4Parser.PrimaryExpContext ctx) {
        if (ctx.children.size() == 1) {
            if (ctx.number() != null) {
                this.nownumber = 0;
                String strnum = ctx.number().getText();
                if (strnum.startsWith("0x") || strnum.startsWith("0X")) {
                    for (int i = 2; i < strnum.length(); i++) {
                        if (Character.isDigit(strnum.charAt(i))) {
                            this.nownumber = this.nownumber * 16 + strnum.charAt(i) - '0';
                        } else if (Character.isAlphabetic(strnum.charAt(i))) {
                            this.nownumber = this.nownumber * 16 + strnum.toUpperCase().charAt(i) - 'A' + 10;
                        }
                    }
                } else if (strnum.startsWith("0")) {
                    for (int i = 1; i < strnum.length(); i++) {
                        this.nownumber = this.nownumber * 8 + strnum.charAt(i) - '0';
                    }
                } else {
                    for (int i = 0; i < strnum.length(); i++) {
                        this.nownumber = this.nownumber * 10 + strnum.charAt(i) - '0';
                    }
                }
                if (layer != 0) {
                    ir_code.add("    %x" + (index++) + "= add i32 0," + this.nownumber + "\n");
                    this.nowIRName = "%x" + (index - 1);
                    this.nowType="i32";
                }

            } else {
                visit(ctx.lVal());
                if (layer!=0){
                    ir_code.add("    %x" + (index++) + " = load i32, i32* " + this.nowIRName + "\n");
                    this.nowIRName = "%x" + (index - 1);
                    this.nowType="i32";
                }

            }
        } else if (ctx.children.size() == 3) {
            visit(ctx.exp());
        } else {
            System.out.println("primaryexp error");
            ir_code.add("primaryexp error\n");
            System.exit(1);
        }
        return null;
    }

    @Override
    public Void visitNumber(lab4Parser.NumberContext ctx) {

        return null;
    }

    @Override
    public Void visitMulExp(lab4Parser.MulExpContext ctx) {
        if (ctx.children.size() == 1) {
            visit(ctx.unaryExp());
        } else if (ctx.children.size() == 3) {
            if (layer == 0) {
                int lhs = 0, rhs = 0, result = 0;
                visit(ctx.mulExp());
                lhs = this.nownumber;
                visit(ctx.unaryExp());
                rhs = this.nownumber;
                if (ctx.getChild(1).toString().equals("*")) {
                    result = lhs * rhs;
                } else if (ctx.getChild(1).toString().equals("/")) {
                    result = lhs / rhs;
                } else {
                    result = lhs % rhs;
                }
                this.nownumber = result;
            } else {
                String lhs = "";
                String rhs = "";

                visit(ctx.mulExp());
                lhs = nowIRName;

                visit(ctx.unaryExp());
                rhs = nowIRName;

                if (ctx.getChild(1).toString().equals("*")) {
                    ir_code.add("    %x" + (index++) + " = mul i32 " + lhs + ", " + rhs + "\n");
                } else if (ctx.getChild(1).toString().equals("/")) {
                    ir_code.add("    %x" + (index++) + " = sdiv i32 " + lhs + ", " + rhs + "\n");
                } else {
                    ir_code.add("    %x" + (index++) + " = srem i32 " + lhs + ", " + rhs + "\n");
                }
                nowIRName = "%x" + (index - 1);
                this.nowType="i32";
            }

        } else {
            System.out.println("MulExp wrong");
            ir_code.add("MulExp wrong\n");
            System.exit(1);
        }
        return null;
    }

    @Override
    public Void visitIdent(lab4Parser.IdentContext ctx) {
        this.nowidentName = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            this.nowidentName = this.nowidentName + ctx.getChild(i).getText();
        }

        return super.visitIdent(ctx);
    }
}
