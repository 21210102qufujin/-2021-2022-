// Generated from lab8.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lab8Parser}.
 */
public interface lab8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lab8Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(lab8Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(lab8Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(lab8Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(lab8Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(lab8Parser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(lab8Parser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(lab8Parser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(lab8Parser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(lab8Parser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(lab8Parser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(lab8Parser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(lab8Parser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(lab8Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(lab8Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(lab8Parser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(lab8Parser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(lab8Parser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(lab8Parser.InitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(lab8Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(lab8Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#funcFParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncFParams(lab8Parser.FuncFParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#funcFParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncFParams(lab8Parser.FuncFParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#funcFParam}.
	 * @param ctx the parse tree
	 */
	void enterFuncFParam(lab8Parser.FuncFParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#funcFParam}.
	 * @param ctx the parse tree
	 */
	void exitFuncFParam(lab8Parser.FuncFParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(lab8Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(lab8Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(lab8Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(lab8Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(lab8Parser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(lab8Parser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(lab8Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(lab8Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(lab8Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(lab8Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(lab8Parser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(lab8Parser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(lab8Parser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(lab8Parser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(lab8Parser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(lab8Parser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(lab8Parser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(lab8Parser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(lab8Parser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(lab8Parser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(lab8Parser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(lab8Parser.FuncRParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(lab8Parser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(lab8Parser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(lab8Parser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(lab8Parser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(lab8Parser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(lab8Parser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(lab8Parser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(lab8Parser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterLAndExp(lab8Parser.LAndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitLAndExp(lab8Parser.LAndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab8Parser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterLOrExp(lab8Parser.LOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab8Parser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitLOrExp(lab8Parser.LOrExpContext ctx);
}
