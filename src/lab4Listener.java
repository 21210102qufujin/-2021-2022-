// Generated from lab4.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lab4Parser}.
 */
public interface lab4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lab4Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(lab4Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(lab4Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(lab4Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(lab4Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(lab4Parser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(lab4Parser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#bType}.
	 * @param ctx the parse tree
	 */
	void enterBType(lab4Parser.BTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#bType}.
	 * @param ctx the parse tree
	 */
	void exitBType(lab4Parser.BTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(lab4Parser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(lab4Parser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(lab4Parser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(lab4Parser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(lab4Parser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(lab4Parser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(lab4Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(lab4Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(lab4Parser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(lab4Parser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(lab4Parser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(lab4Parser.InitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(lab4Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(lab4Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(lab4Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(lab4Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(lab4Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(lab4Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(lab4Parser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(lab4Parser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(lab4Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(lab4Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(lab4Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(lab4Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(lab4Parser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(lab4Parser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(lab4Parser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(lab4Parser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(lab4Parser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(lab4Parser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(lab4Parser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(lab4Parser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(lab4Parser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(lab4Parser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(lab4Parser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(lab4Parser.FuncRParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(lab4Parser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(lab4Parser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(lab4Parser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(lab4Parser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(lab4Parser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(lab4Parser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(lab4Parser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(lab4Parser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterLAndExp(lab4Parser.LAndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitLAndExp(lab4Parser.LAndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterLOrExp(lab4Parser.LOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitLOrExp(lab4Parser.LOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(lab4Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(lab4Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab4Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(lab4Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab4Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(lab4Parser.IdentContext ctx);
}
