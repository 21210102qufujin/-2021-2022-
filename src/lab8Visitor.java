// Generated from lab8.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lab8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lab8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lab8Parser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(lab8Parser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(lab8Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(lab8Parser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(lab8Parser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(lab8Parser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(lab8Parser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(lab8Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(lab8Parser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(lab8Parser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(lab8Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#funcFParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncFParams(lab8Parser.FuncFParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#funcFParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncFParam(lab8Parser.FuncFParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(lab8Parser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(lab8Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(lab8Parser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(lab8Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(lab8Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(lab8Parser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(lab8Parser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(lab8Parser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(lab8Parser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(lab8Parser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(lab8Parser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(lab8Parser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(lab8Parser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(lab8Parser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(lab8Parser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#lAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAndExp(lab8Parser.LAndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab8Parser#lOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOrExp(lab8Parser.LOrExpContext ctx);
}
