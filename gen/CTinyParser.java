// Generated from D:/Tiny16/src/CTiny.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CTinyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, CHAR=2, IF=3, ELSE=4, WHILE=5, RETURN=6, READ=7, WRITE=8, LENGTH=9, 
		PLUS=10, MINUS=11, TIMES=12, DIVIDE=13, EQUAL=14, NEQUAL=15, ASSIGN=16, 
		LESS=17, GREATER=18, NOT=19, LPAR=20, RPAR=21, LBRACE=22, RBRACE=23, LBRACK=24, 
		RBRACK=25, SEMICOLON=26, COMMA=27, NAME=28, NUMBER=29, QCHAR=30, COMMENT=31, 
		WS=32, LEX_ERROR=33;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_funDeclaration = 2, RULE_formalPars = 3, 
		RULE_formalPar = 4, RULE_block = 5, RULE_varDeclaration = 6, RULE_type = 7, 
		RULE_statements = 8, RULE_statement = 9, RULE_lexp = 10, RULE_exp = 11, 
		RULE_pars = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "funDeclaration", "formalPars", "formalPar", 
			"block", "varDeclaration", "type", "statements", "statement", "lexp", 
			"exp", "pars"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'char'", "'if'", "'else'", "'while'", "'return'", "'read'", 
			"'write'", "'length'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'='", 
			"'<'", "'>'", "'!'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "CHAR", "IF", "ELSE", "WHILE", "RETURN", "READ", "WRITE", 
			"LENGTH", "PLUS", "MINUS", "TIMES", "DIVIDE", "EQUAL", "NEQUAL", "ASSIGN", 
			"LESS", "GREATER", "NOT", "LPAR", "RPAR", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "SEMICOLON", "COMMA", "NAME", "NUMBER", "QCHAR", "COMMENT", 
			"WS", "LEX_ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CTiny.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CTinyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CTinyParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				declaration();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT || _la==CHAR );
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public FunDeclarationContext funDeclaration() {
			return getRuleContext(FunDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				funDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				varDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(CTinyParser.NAME, 0); }
		public TerminalNode LPAR() { return getToken(CTinyParser.LPAR, 0); }
		public FormalParsContext formalPars() {
			return getRuleContext(FormalParsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CTinyParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterFunDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitFunDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitFunDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclarationContext funDeclaration() throws RecognitionException {
		FunDeclarationContext _localctx = new FunDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			type(0);
			setState(38);
			match(NAME);
			setState(39);
			match(LPAR);
			setState(40);
			formalPars();
			setState(41);
			match(RPAR);
			setState(42);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParsContext extends ParserRuleContext {
		public List<FormalParContext> formalPar() {
			return getRuleContexts(FormalParContext.class);
		}
		public FormalParContext formalPar(int i) {
			return getRuleContext(FormalParContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CTinyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CTinyParser.COMMA, i);
		}
		public FormalParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterFormalPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitFormalPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitFormalPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParsContext formalPars() throws RecognitionException {
		FormalParsContext _localctx = new FormalParsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==CHAR) {
				{
				setState(44);
				formalPar();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(45);
					match(COMMA);
					setState(46);
					formalPar();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(CTinyParser.NAME, 0); }
		public FormalParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterFormalPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitFormalPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitFormalPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParContext formalPar() throws RecognitionException {
		FormalParContext _localctx = new FormalParContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			type(0);
			setState(55);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CTinyParser.LBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CTinyParser.RBRACE, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LBRACE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==CHAR) {
				{
				{
				setState(58);
				varDeclaration();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			statements();
			setState(65);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(CTinyParser.NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(CTinyParser.SEMICOLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			type(0);
			setState(68);
			match(NAME);
			setState(69);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(CTinyParser.LBRACK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CTinyParser.RBRACK, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharTypeContext extends TypeContext {
		public TerminalNode CHAR() { return getToken(CTinyParser.CHAR, 0); }
		public CharTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(CTinyParser.INT, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				match(INT);
				}
				break;
			case CHAR:
				{
				_localctx = new CharTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(76);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(77);
					match(LBRACK);
					setState(78);
					exp(0);
					setState(79);
					match(RBRACK);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CTinyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CTinyParser.SEMICOLON, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 272630248L) != 0)) {
				{
				setState(86);
				statement();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(87);
					match(SEMICOLON);
					setState(88);
					statement();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(CTinyParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(CTinyParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CTinyParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CTinyParser.ELSE, 0); }
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(CTinyParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(CTinyParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CTinyParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends StatementContext {
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CTinyParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallStmtContext extends StatementContext {
		public TerminalNode NAME() { return getToken(CTinyParser.NAME, 0); }
		public TerminalNode LPAR() { return getToken(CTinyParser.LPAR, 0); }
		public ParsContext pars() {
			return getRuleContext(ParsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CTinyParser.RPAR, 0); }
		public CallStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteStmtContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(CTinyParser.WRITE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public WriteStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadStmtContext extends StatementContext {
		public TerminalNode READ() { return getToken(CTinyParser.READ, 0); }
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public ReadStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(CTinyParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(IF);
				setState(97);
				match(LPAR);
				setState(98);
				exp(0);
				setState(99);
				match(RPAR);
				setState(100);
				statement();
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(101);
					match(ELSE);
					setState(102);
					statement();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(WHILE);
				setState(106);
				match(LPAR);
				setState(107);
				exp(0);
				setState(108);
				match(RPAR);
				setState(109);
				statement();
				}
				break;
			case 3:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				lexp(0);
				setState(112);
				match(ASSIGN);
				setState(113);
				exp(0);
				}
				break;
			case 4:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(RETURN);
				setState(116);
				exp(0);
				}
				break;
			case 5:
				_localctx = new CallStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				match(NAME);
				setState(118);
				match(LPAR);
				setState(119);
				pars();
				setState(120);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				block();
				}
				break;
			case 7:
				_localctx = new WriteStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				match(WRITE);
				setState(124);
				exp(0);
				}
				break;
			case 8:
				_localctx = new ReadStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				match(READ);
				setState(126);
				lexp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LexpContext extends ParserRuleContext {
		public LexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexp; }
	 
		public LexpContext() { }
		public void copyFrom(LexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends LexpContext {
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(CTinyParser.LBRACK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CTinyParser.RBRACK, 0); }
		public ArrayAccessContext(LexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarAccessContext extends LexpContext {
		public TerminalNode NAME() { return getToken(CTinyParser.NAME, 0); }
		public VarAccessContext(LexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterVarAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitVarAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexpContext lexp() throws RecognitionException {
		return lexp(0);
	}

	private LexpContext lexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LexpContext _localctx = new LexpContext(_ctx, _parentState);
		LexpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_lexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VarAccessContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(130);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayAccessContext(new LexpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lexp);
					setState(132);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(133);
					match(LBRACK);
					setState(134);
					exp(0);
					setState(135);
					match(RBRACK);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(CTinyParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(CTinyParser.DIVIDE, 0); }
		public MulExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitMulExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(CTinyParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(CTinyParser.NEQUAL, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharExpContext extends ExpContext {
		public TerminalNode QCHAR() { return getToken(CTinyParser.QCHAR, 0); }
		public CharExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterCharExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitCharExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitCharExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExpContext extends ExpContext {
		public TerminalNode NAME() { return getToken(CTinyParser.NAME, 0); }
		public TerminalNode LPAR() { return getToken(CTinyParser.LPAR, 0); }
		public ParsContext pars() {
			return getRuleContext(ParsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CTinyParser.RPAR, 0); }
		public CallExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitCallExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitCallExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(CTinyParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CTinyParser.RPAR, 0); }
		public ParenExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CTinyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CTinyParser.MINUS, 0); }
		public AddExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LESS() { return getToken(CTinyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CTinyParser.GREATER, 0); }
		public RelExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitRelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitRelExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpContext extends ExpContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CTinyParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(CTinyParser.NOT, 0); }
		public UnaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthExpContext extends ExpContext {
		public TerminalNode LENGTH() { return getToken(CTinyParser.LENGTH, 0); }
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public LengthExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterLengthExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitLengthExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitLengthExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExpContext extends ExpContext {
		public TerminalNode NUMBER() { return getToken(CTinyParser.NUMBER, 0); }
		public NumberExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterNumberExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitNumberExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitNumberExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LexpExpContext extends ExpContext {
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public LexpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterLexpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitLexpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitLexpExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new LexpExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				lexp(0);
				}
				break;
			case 2:
				{
				_localctx = new NumberExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new CharExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(QCHAR);
				}
				break;
			case 4:
				{
				_localctx = new CallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(NAME);
				setState(147);
				match(LPAR);
				setState(148);
				pars();
				setState(149);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new LengthExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(LENGTH);
				setState(152);
				lexp(0);
				}
				break;
			case 6:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(LPAR);
				setState(154);
				exp(0);
				setState(155);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				exp(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(161);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(162);
						((MulExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIVIDE) ) {
							((MulExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						exp(5);
						}
						break;
					case 2:
						{
						_localctx = new AddExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(164);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(165);
						((AddExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						exp(4);
						}
						break;
					case 3:
						{
						_localctx = new RelExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(167);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(168);
						((RelExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LESS || _la==GREATER) ) {
							((RelExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						exp(3);
						}
						break;
					case 4:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(170);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(171);
						((EqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NEQUAL) ) {
							((EqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CTinyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CTinyParser.COMMA, i);
		}
		public ParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).enterPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTinyListener ) ((CTinyListener)listener).exitPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTinyVisitor ) return ((CTinyVisitor<? extends T>)visitor).visitPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParsContext pars() throws RecognitionException {
		ParsContext _localctx = new ParsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1880623616L) != 0)) {
				{
				setState(178);
				exp(0);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					exp(0);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 10:
			return lexp_sempred((LexpContext)_localctx, predIndex);
		case 11:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lexp_sempred(LexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001$\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00030\b\u0003"+
		"\n\u0003\f\u00033\t\u0003\u0003\u00035\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005<\b\u0005\n\u0005\f\u0005"+
		"?\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"K\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007R\b\u0007\n\u0007\f\u0007U\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0005\bZ\b\b\n\b\f\b]\t\b\u0003\b_\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\th\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0080\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u008a\b\n\n\n\f\n\u008d\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a0\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00ae\b\u000b\n\u000b\f\u000b\u00b1\t\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00b6\b\f\n\f\f\f\u00b9\t\f\u0003\f\u00bb\b\f\u0001\f\u0000\u0003\u000e"+
		"\u0014\u0016\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u0000\u0005\u0002\u0000\u000b\u000b\u0013\u0013\u0001\u0000\f\r"+
		"\u0001\u0000\n\u000b\u0001\u0000\u0011\u0012\u0001\u0000\u000e\u000f\u00cd"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004"+
		"%\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b6\u0001\u0000"+
		"\u0000\u0000\n9\u0001\u0000\u0000\u0000\fC\u0001\u0000\u0000\u0000\u000e"+
		"J\u0001\u0000\u0000\u0000\u0010^\u0001\u0000\u0000\u0000\u0012\u007f\u0001"+
		"\u0000\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u009f\u0001"+
		"\u0000\u0000\u0000\u0018\u00ba\u0001\u0000\u0000\u0000\u001a\u001c\u0003"+
		"\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0000"+
		"\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!$\u0003\u0004\u0002\u0000"+
		"\"$\u0003\f\u0006\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0003\u000e\u0007\u0000&\'\u0005"+
		"\u001c\u0000\u0000\'(\u0005\u0014\u0000\u0000()\u0003\u0006\u0003\u0000"+
		")*\u0005\u0015\u0000\u0000*+\u0003\n\u0005\u0000+\u0005\u0001\u0000\u0000"+
		"\u0000,1\u0003\b\u0004\u0000-.\u0005\u001b\u0000\u0000.0\u0003\b\u0004"+
		"\u0000/-\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u00004,\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"5\u0007\u0001\u0000\u0000\u000067\u0003\u000e\u0007\u000078\u0005\u001c"+
		"\u0000\u00008\t\u0001\u0000\u0000\u00009=\u0005\u0016\u0000\u0000:<\u0003"+
		"\f\u0006\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@A\u0003\u0010\b\u0000AB\u0005\u0017\u0000\u0000"+
		"B\u000b\u0001\u0000\u0000\u0000CD\u0003\u000e\u0007\u0000DE\u0005\u001c"+
		"\u0000\u0000EF\u0005\u001a\u0000\u0000F\r\u0001\u0000\u0000\u0000GH\u0006"+
		"\u0007\uffff\uffff\u0000HK\u0005\u0001\u0000\u0000IK\u0005\u0002\u0000"+
		"\u0000JG\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KS\u0001\u0000"+
		"\u0000\u0000LM\n\u0001\u0000\u0000MN\u0005\u0018\u0000\u0000NO\u0003\u0016"+
		"\u000b\u0000OP\u0005\u0019\u0000\u0000PR\u0001\u0000\u0000\u0000QL\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000T\u000f\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000V[\u0003\u0012\t\u0000WX\u0005\u001a\u0000\u0000XZ\u0003\u0012"+
		"\t\u0000YW\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000^V\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_\u0011\u0001\u0000\u0000\u0000`a\u0005\u0003\u0000\u0000ab\u0005\u0014"+
		"\u0000\u0000bc\u0003\u0016\u000b\u0000cd\u0005\u0015\u0000\u0000dg\u0003"+
		"\u0012\t\u0000ef\u0005\u0004\u0000\u0000fh\u0003\u0012\t\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0080\u0001\u0000\u0000"+
		"\u0000ij\u0005\u0005\u0000\u0000jk\u0005\u0014\u0000\u0000kl\u0003\u0016"+
		"\u000b\u0000lm\u0005\u0015\u0000\u0000mn\u0003\u0012\t\u0000n\u0080\u0001"+
		"\u0000\u0000\u0000op\u0003\u0014\n\u0000pq\u0005\u0010\u0000\u0000qr\u0003"+
		"\u0016\u000b\u0000r\u0080\u0001\u0000\u0000\u0000st\u0005\u0006\u0000"+
		"\u0000t\u0080\u0003\u0016\u000b\u0000uv\u0005\u001c\u0000\u0000vw\u0005"+
		"\u0014\u0000\u0000wx\u0003\u0018\f\u0000xy\u0005\u0015\u0000\u0000y\u0080"+
		"\u0001\u0000\u0000\u0000z\u0080\u0003\n\u0005\u0000{|\u0005\b\u0000\u0000"+
		"|\u0080\u0003\u0016\u000b\u0000}~\u0005\u0007\u0000\u0000~\u0080\u0003"+
		"\u0014\n\u0000\u007f`\u0001\u0000\u0000\u0000\u007fi\u0001\u0000\u0000"+
		"\u0000\u007fo\u0001\u0000\u0000\u0000\u007fs\u0001\u0000\u0000\u0000\u007f"+
		"u\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u007f{\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0013\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0006\n\uffff\uffff\u0000\u0082\u0083\u0005\u001c"+
		"\u0000\u0000\u0083\u008b\u0001\u0000\u0000\u0000\u0084\u0085\n\u0002\u0000"+
		"\u0000\u0085\u0086\u0005\u0018\u0000\u0000\u0086\u0087\u0003\u0016\u000b"+
		"\u0000\u0087\u0088\u0005\u0019\u0000\u0000\u0088\u008a\u0001\u0000\u0000"+
		"\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u0015\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0006\u000b\uffff\uffff\u0000\u008f\u00a0\u0003\u0014"+
		"\n\u0000\u0090\u00a0\u0005\u001d\u0000\u0000\u0091\u00a0\u0005\u001e\u0000"+
		"\u0000\u0092\u0093\u0005\u001c\u0000\u0000\u0093\u0094\u0005\u0014\u0000"+
		"\u0000\u0094\u0095\u0003\u0018\f\u0000\u0095\u0096\u0005\u0015\u0000\u0000"+
		"\u0096\u00a0\u0001\u0000\u0000\u0000\u0097\u0098\u0005\t\u0000\u0000\u0098"+
		"\u00a0\u0003\u0014\n\u0000\u0099\u009a\u0005\u0014\u0000\u0000\u009a\u009b"+
		"\u0003\u0016\u000b\u0000\u009b\u009c\u0005\u0015\u0000\u0000\u009c\u00a0"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0000\u0000\u0000\u009e\u00a0"+
		"\u0003\u0016\u000b\u0005\u009f\u008e\u0001\u0000\u0000\u0000\u009f\u0090"+
		"\u0001\u0000\u0000\u0000\u009f\u0091\u0001\u0000\u0000\u0000\u009f\u0092"+
		"\u0001\u0000\u0000\u0000\u009f\u0097\u0001\u0000\u0000\u0000\u009f\u0099"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00af"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\n\u0004\u0000\u0000\u00a2\u00a3\u0007"+
		"\u0001\u0000\u0000\u00a3\u00ae\u0003\u0016\u000b\u0005\u00a4\u00a5\n\u0003"+
		"\u0000\u0000\u00a5\u00a6\u0007\u0002\u0000\u0000\u00a6\u00ae\u0003\u0016"+
		"\u000b\u0004\u00a7\u00a8\n\u0002\u0000\u0000\u00a8\u00a9\u0007\u0003\u0000"+
		"\u0000\u00a9\u00ae\u0003\u0016\u000b\u0003\u00aa\u00ab\n\u0001\u0000\u0000"+
		"\u00ab\u00ac\u0007\u0004\u0000\u0000\u00ac\u00ae\u0003\u0016\u000b\u0002"+
		"\u00ad\u00a1\u0001\u0000\u0000\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u0017\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b7\u0003\u0016\u000b\u0000"+
		"\u00b3\u00b4\u0005\u001b\u0000\u0000\u00b4\u00b6\u0003\u0016\u000b\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b2\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u0019\u0001\u0000\u0000\u0000\u0011\u001d#14=JS[^g\u007f\u008b"+
		"\u009f\u00ad\u00af\u00b7\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}