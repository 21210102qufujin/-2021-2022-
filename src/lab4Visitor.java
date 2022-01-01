// Generated from lab4.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lab4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lab4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lab4Parser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(lab4Parser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(lab4Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(lab4Parser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#bType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBType(lab4Parser.BTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(lab4Parser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(lab4Parser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(lab4Parser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(lab4Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(lab4Parser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(lab4Parser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(lab4Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(lab4Parser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(lab4Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(lab4Parser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(lab4Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(lab4Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(lab4Parser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(lab4Parser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(lab4Parser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(lab4Parser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(lab4Parser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(lab4Parser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(lab4Parser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(lab4Parser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(lab4Parser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(lab4Parser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#lAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAndExp(lab4Parser.LAndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#lOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOrExp(lab4Parser.LOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(lab4Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab4Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(lab4Parser.IdentContext ctx);
}
