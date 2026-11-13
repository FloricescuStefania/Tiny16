// Generated from D:/Tiny16/src/CTiny.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CTinyParser}.
 */
public interface CTinyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CTinyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CTinyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTinyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CTinyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CTinyParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CTinyParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTinyParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CTinyParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CTinyParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaration(CTinyParser.FunDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTinyParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaration(CTinyParser.FunDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CTinyParser#formalPars}.
	 * @param ctx the parse tree
	 */
	void enterFormalPars(CTinyParser.FormalParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTinyParser#formalPars}.
	 * @param ctx the parse tree
	 */
	void exitFormalPars(CTinyParser.FormalParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CTinyParser#formalPar}.
	 * @param ctx the parse tree
	 */
	void enterFormalPar(CTinyParser.FormalParContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTinyParser#formalPar}.
	 * @param ctx the parse tree
	 */
	void exitFormalPar(CTinyParser.FormalParContext ctx);
	/**
	 * Enter a parse tree produced by {@link CTinyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CTinyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTinyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CTinyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CTinyParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CTinyParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTinyParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CTinyParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link CTinyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(CTinyParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link CTinyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(CTinyParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link CTinyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCharType(CTinyParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link CTinyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCharType(CTinyParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link CTinyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(CTinyParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link CTinyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(CTinyParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CTinyParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CTinyParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTinyParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CTinyParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CTinyParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CTinyParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CTinyParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CTinyParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(CTinyParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(CTinyParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(CTinyParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(CTinyParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(CTinyParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(CTinyParser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(CTinyParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(CTinyParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(CTinyParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(CTinyParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(CTinyParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadStmt}
	 * labeled alternative in {@link CTinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(CTinyParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link CTinyParser#lexp}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(CTinyParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link CTinyParser#lexp}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(CTinyParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link CTinyParser#lexp}.
	 * @param ctx the parse tree
	 */
	void enterVarAccess(CTinyParser.VarAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link CTinyParser#lexp}.
	 * @param ctx the parse tree
	 */
	void exitVarAccess(CTinyParser.VarAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(CTinyParser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(CTinyParser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(CTinyParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(CTinyParser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCharExp(CTinyParser.CharExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCharExp(CTinyParser.CharExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCallExp(CTinyParser.CallExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCallExp(CTinyParser.CallExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(CTinyParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(CTinyParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(CTinyParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(CTinyParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(CTinyParser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(CTinyParser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(CTinyParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(CTinyParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LengthExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLengthExp(CTinyParser.LengthExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LengthExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLengthExp(CTinyParser.LengthExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNumberExp(CTinyParser.NumberExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNumberExp(CTinyParser.NumberExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LexpExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLexpExp(CTinyParser.LexpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LexpExp}
	 * labeled alternative in {@link CTinyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLexpExp(CTinyParser.LexpExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CTinyParser#pars}.
	 * @param ctx the parse tree
	 */
	void enterPars(CTinyParser.ParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTinyParser#pars}.
	 * @param ctx the parse tree
	 */
	void exitPars(CTinyParser.ParsContext ctx);
}