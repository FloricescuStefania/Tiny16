// Generated from D:/Tiny16/src/CTiny.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CTinyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CTinyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CTinyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CTinyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CTinyParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CTinyParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CTinyParser#funDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclaration(CTinyParser.FunDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CTinyParser#formalPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalPars(CTinyParser.FormalParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CTinyParser#formalPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalPar(CTinyParser.FormalParContext ctx);
	/**
	 * Visit a parse tree produced by {@link CTinyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CTinyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CTinyParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(CTinyParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link CTinyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(CTinyParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link CTinyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(CTinyParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link CTinyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(CTinyParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CTinyParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(CTinyParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CTinyParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(CTinyParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(CTinyParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(CTinyParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(CTinyParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(CTinyParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(CTinyParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(CTinyParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link CTinyParser#lexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(CTinyParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link CTinyParser#lexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAccess(CTinyParser.VarAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(CTinyParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(CTinyParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExp(CTinyParser.CharExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExp(CTinyParser.CallExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(CTinyParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(CTinyParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(CTinyParser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(CTinyParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthExp(CTinyParser.LengthExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExp(CTinyParser.NumberExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LexpExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpExp(CTinyParser.LexpExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CTinyParser#pars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPars(CTinyParser.ParsContext ctx);
}