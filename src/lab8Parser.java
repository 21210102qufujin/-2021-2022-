// Generated from lab8.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lab8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		BType=32, Number=33, Ident=34, Nondigit=35, Decimal_const=36, Octal_const=37, 
		Hexadecimal_const=38, Hexadecimal_prefix=39, Digit=40, WHITE_SPACE=41;
	public static final int
		RULE_compUnit = 0, RULE_decl = 1, RULE_constDecl = 2, RULE_constDef = 3, 
		RULE_constInitVal = 4, RULE_constExp = 5, RULE_varDecl = 6, RULE_varDef = 7, 
		RULE_initVal = 8, RULE_funcDef = 9, RULE_funcFParams = 10, RULE_funcFParam = 11, 
		RULE_funcType = 12, RULE_block = 13, RULE_blockItem = 14, RULE_stmt = 15, 
		RULE_exp = 16, RULE_cond = 17, RULE_lVal = 18, RULE_primaryExp = 19, RULE_unaryExp = 20, 
		RULE_unaryOp = 21, RULE_funcRParams = 22, RULE_mulExp = 23, RULE_addExp = 24, 
		RULE_relExp = 25, RULE_eqExp = 26, RULE_lAndExp = 27, RULE_lOrExp = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"compUnit", "decl", "constDecl", "constDef", "constInitVal", "constExp", 
			"varDecl", "varDef", "initVal", "funcDef", "funcFParams", "funcFParam", 
			"funcType", "block", "blockItem", "stmt", "exp", "cond", "lVal", "primaryExp", 
			"unaryExp", "unaryOp", "funcRParams", "mulExp", "addExp", "relExp", "eqExp", 
			"lAndExp", "lOrExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "','", "';'", "'['", "']'", "'='", "'{'", "'}'", "'('", 
			"')'", "'void'", "'break'", "'continue'", "'if'", "'else'", "'while'", 
			"'return'", "'+'", "'-'", "'!'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "BType", "Number", "Ident", 
			"Nondigit", "Decimal_const", "Octal_const", "Hexadecimal_const", "Hexadecimal_prefix", 
			"Digit", "WHITE_SPACE"
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
	public String getGrammarFileName() { return "lab8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lab8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompUnitContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterCompUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitCompUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitCompUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		CompUnitContext _localctx = new CompUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(58);
					decl();
					}
					break;
				case 2:
					{
					setState(59);
					funcDef();
					}
					break;
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << BType))) != 0) );
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

	public static class DeclContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				constDecl();
				}
				break;
			case BType:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode BType() { return getToken(lab8Parser.BType, 0); }
		public List<ConstDefContext> constDef() {
			return getRuleContexts(ConstDefContext.class);
		}
		public ConstDefContext constDef(int i) {
			return getRuleContext(ConstDefContext.class,i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(BType);
			setState(70);
			constDef();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(71);
				match(T__1);
				setState(72);
				constDef();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__2);
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

	public static class ConstDefContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(lab8Parser.Ident, 0); }
		public ConstInitValContext constInitVal() {
			return getRuleContext(ConstInitValContext.class,0);
		}
		public List<ConstExpContext> constExp() {
			return getRuleContexts(ConstExpContext.class);
		}
		public ConstExpContext constExp(int i) {
			return getRuleContext(ConstExpContext.class,i);
		}
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterConstDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitConstDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitConstDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(Ident);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(81);
				match(T__3);
				setState(82);
				constExp();
				setState(83);
				match(T__4);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__5);
			setState(91);
			constInitVal();
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

	public static class ConstInitValContext extends ParserRuleContext {
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public List<ConstInitValContext> constInitVal() {
			return getRuleContexts(ConstInitValContext.class);
		}
		public ConstInitValContext constInitVal(int i) {
			return getRuleContext(ConstInitValContext.class,i);
		}
		public ConstInitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constInitVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterConstInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitConstInitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitConstInitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstInitValContext constInitVal() throws RecognitionException {
		ConstInitValContext _localctx = new ConstInitValContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constInitVal);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__17:
			case T__18:
			case T__19:
			case Number:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				constExp();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__6);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Number) | (1L << Ident))) != 0)) {
					{
					setState(95);
					constInitVal();
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(96);
						match(T__1);
						setState(97);
						constInitVal();
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(105);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public ConstExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterConstExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitConstExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitConstExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExpContext constExp() throws RecognitionException {
		ConstExpContext _localctx = new ConstExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			addExp(0);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode BType() { return getToken(lab8Parser.BType, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(BType);
			setState(111);
			varDef();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(112);
				match(T__1);
				setState(113);
				varDef();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(T__2);
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

	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(lab8Parser.Ident, 0); }
		public List<ConstExpContext> constExp() {
			return getRuleContexts(ConstExpContext.class);
		}
		public ConstExpContext constExp(int i) {
			return getRuleContext(ConstExpContext.class,i);
		}
		public InitValContext initVal() {
			return getRuleContext(InitValContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDef);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(Ident);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(122);
					match(T__3);
					setState(123);
					constExp();
					setState(124);
					match(T__4);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(Ident);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(132);
					match(T__3);
					setState(133);
					constExp();
					setState(134);
					match(T__4);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__5);
				setState(142);
				initVal();
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

	public static class InitValContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<InitValContext> initVal() {
			return getRuleContexts(InitValContext.class);
		}
		public InitValContext initVal(int i) {
			return getRuleContext(InitValContext.class,i);
		}
		public InitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitInitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitInitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitValContext initVal() throws RecognitionException {
		InitValContext _localctx = new InitValContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initVal);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__17:
			case T__18:
			case T__19:
			case Number:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				exp();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__6);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Number) | (1L << Ident))) != 0)) {
					{
					setState(147);
					initVal();
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(148);
						match(T__1);
						setState(149);
						initVal();
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(157);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FuncDefContext extends ParserRuleContext {
		public FuncTypeContext funcType() {
			return getRuleContext(FuncTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(lab8Parser.Ident, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncFParamsContext funcFParams() {
			return getRuleContext(FuncFParamsContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			funcType();
			setState(161);
			match(Ident);
			setState(162);
			match(T__8);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BType) {
				{
				setState(163);
				funcFParams();
				}
			}

			setState(166);
			match(T__9);
			setState(167);
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

	public static class FuncFParamsContext extends ParserRuleContext {
		public List<FuncFParamContext> funcFParam() {
			return getRuleContexts(FuncFParamContext.class);
		}
		public FuncFParamContext funcFParam(int i) {
			return getRuleContext(FuncFParamContext.class,i);
		}
		public FuncFParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcFParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterFuncFParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitFuncFParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitFuncFParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncFParamsContext funcFParams() throws RecognitionException {
		FuncFParamsContext _localctx = new FuncFParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcFParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			funcFParam();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(170);
				match(T__1);
				setState(171);
				funcFParam();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FuncFParamContext extends ParserRuleContext {
		public TerminalNode BType() { return getToken(lab8Parser.BType, 0); }
		public TerminalNode Ident() { return getToken(lab8Parser.Ident, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FuncFParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcFParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterFuncFParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitFuncFParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitFuncFParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncFParamContext funcFParam() throws RecognitionException {
		FuncFParamContext _localctx = new FuncFParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcFParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(BType);
			setState(178);
			match(Ident);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(179);
				match(T__3);
				setState(180);
				match(T__4);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(181);
					match(T__3);
					setState(182);
					exp();
					setState(183);
					match(T__4);
					}
					}
					setState(189);
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

	public static class FuncTypeContext extends ParserRuleContext {
		public TerminalNode BType() { return getToken(lab8Parser.BType, 0); }
		public FuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitFuncType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitFuncType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncTypeContext funcType() throws RecognitionException {
		FuncTypeContext _localctx = new FuncTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==BType) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__6);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << BType) | (1L << Number) | (1L << Ident))) != 0)) {
				{
				{
				setState(195);
				blockItem();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(T__7);
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

	public static class BlockItemContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockItem);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BType:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				decl();
				}
				break;
			case T__2:
			case T__6:
			case T__8:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case Number:
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StmtContext extends ParserRuleContext {
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				lVal();
				setState(208);
				match(T__5);
				setState(209);
				exp();
				setState(210);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__11);
				setState(214);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(T__12);
				setState(216);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Number) | (1L << Ident))) != 0)) {
					{
					setState(217);
					exp();
					}
				}

				setState(220);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				match(T__13);
				setState(222);
				match(T__8);
				setState(223);
				cond();
				setState(224);
				match(T__9);
				setState(225);
				stmt();
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(226);
					match(T__14);
					setState(227);
					stmt();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				match(T__15);
				setState(231);
				match(T__8);
				setState(232);
				cond();
				setState(233);
				match(T__9);
				setState(234);
				stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(236);
				match(T__16);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Number) | (1L << Ident))) != 0)) {
					{
					setState(237);
					exp();
					}
				}

				setState(240);
				match(T__2);
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

	public static class ExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			addExp(0);
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

	public static class CondContext extends ParserRuleContext {
		public LOrExpContext lOrExp() {
			return getRuleContext(LOrExpContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			lOrExp(0);
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

	public static class LValContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(lab8Parser.Ident, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterLVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitLVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitLVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LValContext lVal() throws RecognitionException {
		LValContext _localctx = new LValContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lVal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(Ident);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					match(T__3);
					setState(249);
					exp();
					setState(250);
					match(T__4);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class PrimaryExpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public TerminalNode Number() { return getToken(lab8Parser.Number, 0); }
		public PrimaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterPrimaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitPrimaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitPrimaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primaryExp);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(T__8);
				setState(258);
				exp();
				setState(259);
				match(T__9);
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				lVal();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UnaryExpContext extends ParserRuleContext {
		public PrimaryExpContext primaryExp() {
			return getRuleContext(PrimaryExpContext.class,0);
		}
		public TerminalNode Ident() { return getToken(lab8Parser.Ident, 0); }
		public FuncRParamsContext funcRParams() {
			return getRuleContext(FuncRParamsContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryExp);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				primaryExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(Ident);
				setState(267);
				match(T__8);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Number) | (1L << Ident))) != 0)) {
					{
					setState(268);
					funcRParams();
					}
				}

				setState(271);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				unaryOp();
				setState(273);
				unaryExp();
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

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FuncRParamsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FuncRParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcRParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterFuncRParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitFuncRParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitFuncRParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncRParamsContext funcRParams() throws RecognitionException {
		FuncRParamsContext _localctx = new FuncRParamsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcRParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			exp();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(280);
				match(T__1);
				setState(281);
				exp();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MulExpContext extends ParserRuleContext {
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public MulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitMulExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpContext mulExp() throws RecognitionException {
		return mulExp(0);
	}

	private MulExpContext mulExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExpContext _localctx = new MulExpContext(_ctx, _parentState);
		MulExpContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_mulExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(288);
			unaryExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulExp);
					setState(290);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(291);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(292);
					unaryExp();
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class AddExpContext extends ParserRuleContext {
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public AddExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpContext addExp() throws RecognitionException {
		return addExp(0);
	}

	private AddExpContext addExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExpContext _localctx = new AddExpContext(_ctx, _parentState);
		AddExpContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_addExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(299);
			mulExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addExp);
					setState(301);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(302);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(303);
					mulExp(0);
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class RelExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public RelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitRelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitRelExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpContext relExp() throws RecognitionException {
		return relExp(0);
	}

	private RelExpContext relExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelExpContext _localctx = new RelExpContext(_ctx, _parentState);
		RelExpContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_relExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(310);
			addExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relExp);
					setState(312);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(313);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(314);
					addExp(0);
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class EqExpContext extends ParserRuleContext {
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public EqExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExpContext eqExp() throws RecognitionException {
		return eqExp(0);
	}

	private EqExpContext eqExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExpContext _localctx = new EqExpContext(_ctx, _parentState);
		EqExpContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_eqExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(321);
			relExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eqExp);
					setState(323);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(324);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(325);
					relExp(0);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class LAndExpContext extends ParserRuleContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public LAndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lAndExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterLAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitLAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitLAndExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LAndExpContext lAndExp() throws RecognitionException {
		return lAndExp(0);
	}

	private LAndExpContext lAndExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LAndExpContext _localctx = new LAndExpContext(_ctx, _parentState);
		LAndExpContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_lAndExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(332);
			eqExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LAndExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lAndExp);
					setState(334);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(335);
					match(T__29);
					setState(336);
					eqExp(0);
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class LOrExpContext extends ParserRuleContext {
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public LOrExpContext lOrExp() {
			return getRuleContext(LOrExpContext.class,0);
		}
		public LOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lOrExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).enterLOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab8Listener ) ((lab8Listener)listener).exitLOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab8Visitor ) return ((lab8Visitor<? extends T>)visitor).visitLOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LOrExpContext lOrExp() throws RecognitionException {
		return lOrExp(0);
	}

	private LOrExpContext lOrExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LOrExpContext _localctx = new LOrExpContext(_ctx, _parentState);
		LOrExpContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_lOrExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(343);
			lAndExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LOrExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lOrExp);
					setState(345);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(346);
					match(T__30);
					setState(347);
					lAndExp(0);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return mulExp_sempred((MulExpContext)_localctx, predIndex);
		case 24:
			return addExp_sempred((AddExpContext)_localctx, predIndex);
		case 25:
			return relExp_sempred((RelExpContext)_localctx, predIndex);
		case 26:
			return eqExp_sempred((EqExpContext)_localctx, predIndex);
		case 27:
			return lAndExp_sempred((LAndExpContext)_localctx, predIndex);
		case 28:
			return lOrExp_sempred((LOrExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mulExp_sempred(MulExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExp_sempred(AddExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relExp_sempred(RelExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExp_sempred(EqExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lAndExp_sempred(LAndExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lOrExp_sempred(LOrExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\6\2?\n\2\r"+
		"\2\16\2@\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\7\6e\n\6\f\6\16\6h\13\6\5\6j\n\6\3\6\5\6m\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\7\bu\n\b\f\b\16\bx\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u0081\n\t\f\t\16\t\u0084\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16"+
		"\t\u008e\13\t\3\t\3\t\5\t\u0092\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u0099\n\n"+
		"\f\n\16\n\u009c\13\n\5\n\u009e\n\n\3\n\5\n\u00a1\n\n\3\13\3\13\3\13\3"+
		"\13\5\13\u00a7\n\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00af\n\f\f\f\16\f"+
		"\u00b2\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bc\n\r\f\r\16\r\u00bf"+
		"\13\r\5\r\u00c1\n\r\3\16\3\16\3\17\3\17\7\17\u00c7\n\17\f\17\16\17\u00ca"+
		"\13\17\3\17\3\17\3\20\3\20\5\20\u00d0\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dd\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00e7\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00f1\n\21\3\21\5\21\u00f4\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u00ff\n\24\f\24\16\24\u0102\13\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u010a\n\25\3\26\3\26\3\26\3\26\5\26\u0110\n\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0116\n\26\3\27\3\27\3\30\3\30\3\30\7\30\u011d\n"+
		"\30\f\30\16\30\u0120\13\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0128\n"+
		"\31\f\31\16\31\u012b\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0133\n"+
		"\32\f\32\16\32\u0136\13\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u013e\n"+
		"\33\f\33\16\33\u0141\13\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0149\n"+
		"\34\f\34\16\34\u014c\13\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0154\n"+
		"\35\f\35\16\35\u0157\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u015f\n"+
		"\36\f\36\16\36\u0162\13\36\3\36\2\b\60\62\64\668:\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\b\4\2\r\r\"\"\3\2\24\26"+
		"\3\2\27\31\3\2\24\25\3\2\32\35\3\2\36\37\2\u0172\2>\3\2\2\2\4D\3\2\2\2"+
		"\6F\3\2\2\2\bR\3\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16p\3\2\2\2\20\u0091\3\2"+
		"\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00ab\3\2\2\2\30\u00b3\3\2\2"+
		"\2\32\u00c2\3\2\2\2\34\u00c4\3\2\2\2\36\u00cf\3\2\2\2 \u00f3\3\2\2\2\""+
		"\u00f5\3\2\2\2$\u00f7\3\2\2\2&\u00f9\3\2\2\2(\u0109\3\2\2\2*\u0115\3\2"+
		"\2\2,\u0117\3\2\2\2.\u0119\3\2\2\2\60\u0121\3\2\2\2\62\u012c\3\2\2\2\64"+
		"\u0137\3\2\2\2\66\u0142\3\2\2\28\u014d\3\2\2\2:\u0158\3\2\2\2<?\5\4\3"+
		"\2=?\5\24\13\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3"+
		"\2\2\2BE\5\6\4\2CE\5\16\b\2DB\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\7\3\2\2G"+
		"H\7\"\2\2HM\5\b\5\2IJ\7\4\2\2JL\5\b\5\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\5\2\2Q\7\3\2\2\2RY\7$\2\2ST\7\6\2\2"+
		"TU\5\f\7\2UV\7\7\2\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z\\\3\2\2\2[Y\3\2\2\2\\]\7\b\2\2]^\5\n\6\2^\t\3\2\2\2_m\5\f\7\2`i\7\t"+
		"\2\2af\5\n\6\2bc\7\4\2\2ce\5\n\6\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2ia\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\n\2\2l_\3\2"+
		"\2\2l`\3\2\2\2m\13\3\2\2\2no\5\62\32\2o\r\3\2\2\2pq\7\"\2\2qv\5\20\t\2"+
		"rs\7\4\2\2su\5\20\t\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2"+
		"\2xv\3\2\2\2yz\7\5\2\2z\17\3\2\2\2{\u0082\7$\2\2|}\7\6\2\2}~\5\f\7\2~"+
		"\177\7\7\2\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0092\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u008c\7$\2\2\u0086\u0087\7\6\2\2\u0087\u0088\5\f\7\2\u0088"+
		"\u0089\7\7\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7\b\2\2\u0090\u0092\5\22\n\2\u0091{\3\2\2\2"+
		"\u0091\u0085\3\2\2\2\u0092\21\3\2\2\2\u0093\u00a1\5\"\22\2\u0094\u009d"+
		"\7\t\2\2\u0095\u009a\5\22\n\2\u0096\u0097\7\4\2\2\u0097\u0099\5\22\n\2"+
		"\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u0095\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\7\n\2\2\u00a0\u0093\3\2"+
		"\2\2\u00a0\u0094\3\2\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\5\32\16\2\u00a3"+
		"\u00a4\7$\2\2\u00a4\u00a6\7\13\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a5\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\f\2\2\u00a9"+
		"\u00aa\5\34\17\2\u00aa\25\3\2\2\2\u00ab\u00b0\5\30\r\2\u00ac\u00ad\7\4"+
		"\2\2\u00ad\u00af\5\30\r\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b0\3\2\2"+
		"\2\u00b3\u00b4\7\"\2\2\u00b4\u00c0\7$\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00bd"+
		"\7\7\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\7\7\2\2"+
		"\u00ba\u00bc\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00b5\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\t\2\2"+
		"\2\u00c3\33\3\2\2\2\u00c4\u00c8\7\t\2\2\u00c5\u00c7\5\36\20\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\n\2\2\u00cc\35\3\2\2"+
		"\2\u00cd\u00d0\5\4\3\2\u00ce\u00d0\5 \21\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\37\3\2\2\2\u00d1\u00d2\5&\24\2\u00d2\u00d3\7\b\2\2\u00d3"+
		"\u00d4\5\"\22\2\u00d4\u00d5\7\5\2\2\u00d5\u00f4\3\2\2\2\u00d6\u00f4\5"+
		"\34\17\2\u00d7\u00d8\7\16\2\2\u00d8\u00f4\7\5\2\2\u00d9\u00da\7\17\2\2"+
		"\u00da\u00f4\7\5\2\2\u00db\u00dd\5\"\22\2\u00dc\u00db\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00f4\7\5\2\2\u00df\u00e0\7\20\2\2"+
		"\u00e0\u00e1\7\13\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e3\7\f\2\2\u00e3\u00e6"+
		"\5 \21\2\u00e4\u00e5\7\21\2\2\u00e5\u00e7\5 \21\2\u00e6\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00f4\3\2\2\2\u00e8\u00e9\7\22\2\2\u00e9\u00ea"+
		"\7\13\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\5 \21\2"+
		"\u00ed\u00f4\3\2\2\2\u00ee\u00f0\7\23\2\2\u00ef\u00f1\5\"\22\2\u00f0\u00ef"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\7\5\2\2\u00f3"+
		"\u00d1\3\2\2\2\u00f3\u00d6\3\2\2\2\u00f3\u00d7\3\2\2\2\u00f3\u00d9\3\2"+
		"\2\2\u00f3\u00dc\3\2\2\2\u00f3\u00df\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3"+
		"\u00ee\3\2\2\2\u00f4!\3\2\2\2\u00f5\u00f6\5\62\32\2\u00f6#\3\2\2\2\u00f7"+
		"\u00f8\5:\36\2\u00f8%\3\2\2\2\u00f9\u0100\7$\2\2\u00fa\u00fb\7\6\2\2\u00fb"+
		"\u00fc\5\"\22\2\u00fc\u00fd\7\7\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3"+
		"\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\'\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\13\2\2\u0104\u0105\5\"\22"+
		"\2\u0105\u0106\7\f\2\2\u0106\u010a\3\2\2\2\u0107\u010a\5&\24\2\u0108\u010a"+
		"\7#\2\2\u0109\u0103\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		")\3\2\2\2\u010b\u0116\5(\25\2\u010c\u010d\7$\2\2\u010d\u010f\7\13\2\2"+
		"\u010e\u0110\5.\30\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0116\7\f\2\2\u0112\u0113\5,\27\2\u0113\u0114\5*\26\2\u0114"+
		"\u0116\3\2\2\2\u0115\u010b\3\2\2\2\u0115\u010c\3\2\2\2\u0115\u0112\3\2"+
		"\2\2\u0116+\3\2\2\2\u0117\u0118\t\3\2\2\u0118-\3\2\2\2\u0119\u011e\5\""+
		"\22\2\u011a\u011b\7\4\2\2\u011b\u011d\5\"\22\2\u011c\u011a\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f/\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0121\u0122\b\31\1\2\u0122\u0123\5*\26\2\u0123\u0129"+
		"\3\2\2\2\u0124\u0125\f\3\2\2\u0125\u0126\t\4\2\2\u0126\u0128\5*\26\2\u0127"+
		"\u0124\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\61\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\b\32\1\2\u012d\u012e"+
		"\5\60\31\2\u012e\u0134\3\2\2\2\u012f\u0130\f\3\2\2\u0130\u0131\t\5\2\2"+
		"\u0131\u0133\5\60\31\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\63\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0138\b\33\1\2\u0138\u0139\5\62\32\2\u0139\u013f\3\2\2\2\u013a\u013b"+
		"\f\3\2\2\u013b\u013c\t\6\2\2\u013c\u013e\5\62\32\2\u013d\u013a\3\2\2\2"+
		"\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\65"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\b\34\1\2\u0143\u0144\5\64\33"+
		"\2\u0144\u014a\3\2\2\2\u0145\u0146\f\3\2\2\u0146\u0147\t\7\2\2\u0147\u0149"+
		"\5\64\33\2\u0148\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\u014a\u014b\3\2\2\2\u014b\67\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e"+
		"\b\35\1\2\u014e\u014f\5\66\34\2\u014f\u0155\3\2\2\2\u0150\u0151\f\3\2"+
		"\2\u0151\u0152\7 \2\2\u0152\u0154\5\66\34\2\u0153\u0150\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u01569\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0158\u0159\b\36\1\2\u0159\u015a\58\35\2\u015a\u0160"+
		"\3\2\2\2\u015b\u015c\f\3\2\2\u015c\u015d\7!\2\2\u015d\u015f\58\35\2\u015e"+
		"\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161;\3\2\2\2\u0162\u0160\3\2\2\2&>@DMYfilv\u0082\u008c\u0091\u009a"+
		"\u009d\u00a0\u00a6\u00b0\u00bd\u00c0\u00c8\u00cf\u00dc\u00e6\u00f0\u00f3"+
		"\u0100\u0109\u010f\u0115\u011e\u0129\u0134\u013f\u014a\u0155\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
