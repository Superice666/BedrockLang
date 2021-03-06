// Generated from D:/ideaProject/BedrockLang/BDLCompiler/src/main/antlr\BedrockLang.g4 by ANTLR 4.9.1
package com.blocklynukkit.bedrockLang.compiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BedrockLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, MUTICOMMENT=3, COMMA=4, SEMICOLON=5, COLON=6, LB=7, RB=8, 
		LA=9, RA=10, START=11, END=12, DOT=13, EQ=14, NEQ=15, SET=16, PLUS=17, 
		MINUS=18, MULTIPLY=19, DIVIDE=20, REMAIN=21, NOT=22, AND=23, OR=24, GTREQ=25, 
		GTR=26, LWREQ=27, LWR=28, DOLLAR=29, LEN=30, DEF=31, VAR=32, WHEN=33, 
		RETURN=34, IMPORT=35, FROM=36, AS=37, IF=38, ELSE=39, ELIF=40, WHILE=41, 
		BREAK=42, CONTINUE=43, STRING=44, INT=45, DEC=46, BOOL=47, NULL=48, ID=49;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_expr = 2, RULE_importStat = 3, RULE_whenStat = 4, 
		RULE_ifElseStat = 5, RULE_whileStat = 6, RULE_defineCmdStat = 7, RULE_defineSignature = 8, 
		RULE_defineSignatureWordSingle = 9, RULE_defineSignatureVariable = 10, 
		RULE_declareVarStat = 11, RULE_returnStat = 12, RULE_breakStat = 13, RULE_continueStat = 14, 
		RULE_command = 15, RULE_block = 16, RULE_typeid = 17, RULE_id = 18, RULE_varid = 19, 
		RULE_commandId = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "expr", "importStat", "whenStat", "ifElseStat", "whileStat", 
			"defineCmdStat", "defineSignature", "defineSignatureWordSingle", "defineSignatureVariable", 
			"declareVarStat", "returnStat", "breakStat", "continueStat", "command", 
			"block", "typeid", "id", "varid", "commandId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "','", null, "':'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'.'", "'=='", "'!='", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'!'", "'&'", "'|'", "'>='", "'>'", "'<='", "'<'", "'$'", "'#'", 
			"'def'", "'var'", "'when'", "'return'", "'import'", "'from'", "'as'", 
			"'if'", "'else'", "'elif'", "'while'", "'break'", "'continue'", null, 
			null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "MUTICOMMENT", "COMMA", "SEMICOLON", "COLON", 
			"LB", "RB", "LA", "RA", "START", "END", "DOT", "EQ", "NEQ", "SET", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "REMAIN", "NOT", "AND", "OR", "GTREQ", 
			"GTR", "LWREQ", "LWR", "DOLLAR", "LEN", "DEF", "VAR", "WHEN", "RETURN", 
			"IMPORT", "FROM", "AS", "IF", "ELSE", "ELIF", "WHILE", "BREAK", "CONTINUE", 
			"STRING", "INT", "DEC", "BOOL", "NULL", "ID"
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
	public String getGrammarFileName() { return "BedrockLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BedrockLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ImportStatContext> importStat() {
			return getRuleContexts(ImportStatContext.class);
		}
		public ImportStatContext importStat(int i) {
			return getRuleContext(ImportStatContext.class,i);
		}
		public List<DeclareVarStatContext> declareVarStat() {
			return getRuleContexts(DeclareVarStatContext.class);
		}
		public DeclareVarStatContext declareVarStat(int i) {
			return getRuleContext(DeclareVarStatContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(BedrockLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BedrockLangParser.SEMICOLON, i);
		}
		public List<DefineCmdStatContext> defineCmdStat() {
			return getRuleContexts(DefineCmdStatContext.class);
		}
		public DefineCmdStatContext defineCmdStat(int i) {
			return getRuleContext(DefineCmdStatContext.class,i);
		}
		public List<WhenStatContext> whenStat() {
			return getRuleContexts(WhenStatContext.class);
		}
		public WhenStatContext whenStat(int i) {
			return getRuleContext(WhenStatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(42);
				importStat();
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(43);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << VAR) | (1L << WHEN))) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(51);
					declareVarStat();
					setState(52);
					match(SEMICOLON);
					}
					break;
				case DEF:
					{
					setState(54);
					defineCmdStat();
					}
					break;
				case WHEN:
					{
					setState(55);
					whenStat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
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

	public static class StatContext extends ParserRuleContext {
		public IfElseStatContext ifElseStat() {
			return getRuleContext(IfElseStatContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public DeclareVarStatContext declareVarStat() {
			return getRuleContext(DeclareVarStatContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BedrockLangParser.SEMICOLON, 0); }
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public BreakStatContext breakStat() {
			return getRuleContext(BreakStatContext.class,0);
		}
		public ContinueStatContext continueStat() {
			return getRuleContext(ContinueStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				ifElseStat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				whileStat();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				declareVarStat();
				setState(64);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				returnStat();
				setState(67);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				breakStat();
				setState(70);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				continueStat();
				setState(73);
				match(SEMICOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandExprContext extends ExprContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(BedrockLangParser.DIVIDE, 0); }
		public DivideExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterDivideExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitDivideExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitDivideExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LowerEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LWREQ() { return getToken(BedrockLangParser.LWREQ, 0); }
		public LowerEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterLowerEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitLowerEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitLowerEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketExprContext extends ExprContext {
		public TerminalNode LB() { return getToken(BedrockLangParser.LB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RB() { return getToken(BedrockLangParser.RB, 0); }
		public BracketExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterBracketExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitBracketExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitBracketExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(BedrockLangParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegativeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterNegativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitNegativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitNegativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(BedrockLangParser.MULTIPLY, 0); }
		public MultiplyExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitMultiplyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitMultiplyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(BedrockLangParser.MINUS, 0); }
		public MinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GTREQ() { return getToken(BedrockLangParser.GTREQ, 0); }
		public GreaterEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterGreaterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitGreaterEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitGreaterEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemainExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode REMAIN() { return getToken(BedrockLangParser.REMAIN, 0); }
		public RemainExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterRemainExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitRemainExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitRemainExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(BedrockLangParser.PLUS, 0); }
		public PlusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetArrayElementExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LA() { return getToken(BedrockLangParser.LA, 0); }
		public TerminalNode RA() { return getToken(BedrockLangParser.RA, 0); }
		public GetArrayElementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterGetArrayElementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitGetArrayElementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitGetArrayElementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExprContext extends ExprContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetVarExprContext extends ExprContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TerminalNode SET() { return getToken(BedrockLangParser.SET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LA() { return getTokens(BedrockLangParser.LA); }
		public TerminalNode LA(int i) {
			return getToken(BedrockLangParser.LA, i);
		}
		public List<TerminalNode> RA() { return getTokens(BedrockLangParser.RA); }
		public TerminalNode RA(int i) {
			return getToken(BedrockLangParser.RA, i);
		}
		public SetVarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterSetVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitSetVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitSetVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GTR() { return getToken(BedrockLangParser.GTR, 0); }
		public GreaterExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterGreaterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitGreaterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitGreaterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LowerExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LWR() { return getToken(BedrockLangParser.LWR, 0); }
		public LowerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterLowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitLowerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitLowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(BedrockLangParser.INT, 0); }
		public TerminalNode DEC() { return getToken(BedrockLangParser.DEC, 0); }
		public TerminalNode BOOL() { return getToken(BedrockLangParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(BedrockLangParser.NULL, 0); }
		public TerminalNode STRING() { return getToken(BedrockLangParser.STRING, 0); }
		public LiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChainVirtualFieldExprContext extends ExprContext {
		public List<VaridContext> varid() {
			return getRuleContexts(VaridContext.class);
		}
		public VaridContext varid(int i) {
			return getRuleContext(VaridContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(BedrockLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BedrockLangParser.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(BedrockLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BedrockLangParser.ID, i);
		}
		public ChainVirtualFieldExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterChainVirtualFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitChainVirtualFieldExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitChainVirtualFieldExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(BedrockLangParser.NEQ, 0); }
		public NotEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterNotEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitNotEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitNotEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositiveExprContext extends ExprContext {
		public TerminalNode PLUS() { return getToken(BedrockLangParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PositiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterPositiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitPositiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitPositiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChainStaticFieldExprContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(BedrockLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BedrockLangParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(BedrockLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BedrockLangParser.DOT, i);
		}
		public List<VaridContext> varid() {
			return getRuleContexts(VaridContext.class);
		}
		public VaridContext varid(int i) {
			return getRuleContext(VaridContext.class,i);
		}
		public ChainStaticFieldExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterChainStaticFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitChainStaticFieldExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitChainStaticFieldExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetLengthExprContext extends ExprContext {
		public TerminalNode LEN() { return getToken(BedrockLangParser.LEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GetLengthExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterGetLengthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitGetLengthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitGetLengthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(BedrockLangParser.EQ, 0); }
		public EqualExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new CommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78);
				command();
				}
				break;
			case 2:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << NULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				varid();
				}
				break;
			case 4:
				{
				_localctx = new BracketExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(LB);
				setState(82);
				expr(0);
				setState(83);
				match(RB);
				}
				break;
			case 5:
				{
				_localctx = new PositiveExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(PLUS);
				setState(86);
				expr(18);
				}
				break;
			case 6:
				{
				_localctx = new NegativeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(MINUS);
				setState(88);
				expr(17);
				}
				break;
			case 7:
				{
				_localctx = new SetVarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				varid();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LA) {
					{
					{
					setState(90);
					match(LA);
					setState(91);
					expr(0);
					setState(92);
					match(RA);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(SET);
				setState(100);
				expr(5);
				}
				break;
			case 8:
				{
				_localctx = new ChainStaticFieldExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(ID);
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(107);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(103);
							match(DOT);
							setState(104);
							match(ID);
							}
							break;
						case 2:
							{
							setState(105);
							match(DOT);
							setState(106);
							varid();
							}
							break;
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(112);
				match(DOT);
				setState(113);
				varid();
				}
				break;
			case 9:
				{
				_localctx = new ChainVirtualFieldExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				varid();
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(119);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(115);
							match(DOT);
							setState(116);
							match(ID);
							}
							break;
						case 2:
							{
							setState(117);
							match(DOT);
							setState(118);
							varid();
							}
							break;
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(124);
				match(DOT);
				setState(125);
				varid();
				}
				break;
			case 10:
				{
				_localctx = new GetLengthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(LEN);
				setState(128);
				expr(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PlusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(132);
						match(PLUS);
						setState(133);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new MinusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(135);
						match(MINUS);
						setState(136);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new MultiplyExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(138);
						match(MULTIPLY);
						setState(139);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new DivideExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(141);
						match(DIVIDE);
						setState(142);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(144);
						match(EQ);
						setState(145);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new NotEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(147);
						match(NEQ);
						setState(148);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new GreaterExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(150);
						match(GTR);
						setState(151);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new GreaterEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(153);
						match(GTREQ);
						setState(154);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new LowerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(156);
						match(LWR);
						setState(157);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new LowerEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						match(LWREQ);
						setState(160);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new RemainExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(162);
						match(REMAIN);
						setState(163);
						expr(7);
						}
						break;
					case 12:
						{
						_localctx = new GetArrayElementExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(165);
						match(LA);
						setState(166);
						expr(0);
						setState(167);
						match(RA);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ImportStatContext extends ParserRuleContext {
		public ImportStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStat; }
	 
		public ImportStatContext() { }
		public void copyFrom(ImportStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportAllStaticContext extends ImportStatContext {
		public TerminalNode IMPORT() { return getToken(BedrockLangParser.IMPORT, 0); }
		public TerminalNode MULTIPLY() { return getToken(BedrockLangParser.MULTIPLY, 0); }
		public TerminalNode FROM() { return getToken(BedrockLangParser.FROM, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ImportAllStaticContext(ImportStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterImportAllStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitImportAllStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitImportAllStatic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportClassContext extends ImportStatContext {
		public TerminalNode IMPORT() { return getToken(BedrockLangParser.IMPORT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ImportClassContext(ImportStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterImportClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitImportClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitImportClass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportSingleStaticContext extends ImportStatContext {
		public TerminalNode IMPORT() { return getToken(BedrockLangParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(BedrockLangParser.FROM, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(BedrockLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BedrockLangParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BedrockLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BedrockLangParser.COMMA, i);
		}
		public ImportSingleStaticContext(ImportStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterImportSingleStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitImportSingleStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitImportSingleStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatContext importStat() throws RecognitionException {
		ImportStatContext _localctx = new ImportStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStat);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ImportSingleStaticContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(IMPORT);
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					match(ID);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(176);
						match(COMMA);
						}
					}

					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(183);
				match(FROM);
				setState(184);
				id();
				}
				break;
			case 2:
				_localctx = new ImportAllStaticContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(IMPORT);
				setState(186);
				match(MULTIPLY);
				setState(187);
				match(FROM);
				setState(188);
				id();
				}
				break;
			case 3:
				_localctx = new ImportClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(IMPORT);
				setState(190);
				id();
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

	public static class WhenStatContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(BedrockLangParser.WHEN, 0); }
		public TerminalNode ID() { return getToken(BedrockLangParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhenStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterWhenStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitWhenStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitWhenStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStatContext whenStat() throws RecognitionException {
		WhenStatContext _localctx = new WhenStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whenStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(WHEN);
			setState(194);
			match(ID);
			setState(195);
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

	public static class IfElseStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BedrockLangParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(BedrockLangParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(BedrockLangParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(BedrockLangParser.ELSE, 0); }
		public IfElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterIfElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitIfElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitIfElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatContext ifElseStat() throws RecognitionException {
		IfElseStatContext _localctx = new IfElseStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifElseStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IF);
			setState(198);
			expr(0);
			setState(199);
			block();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(200);
				match(ELIF);
				setState(201);
				expr(0);
				setState(202);
				block();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(209);
				match(ELSE);
				setState(210);
				block();
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

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BedrockLangParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LA() { return getToken(BedrockLangParser.LA, 0); }
		public TerminalNode ID() { return getToken(BedrockLangParser.ID, 0); }
		public TerminalNode RA() { return getToken(BedrockLangParser.RA, 0); }
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(WHILE);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LA) {
				{
				setState(214);
				match(LA);
				setState(215);
				match(ID);
				setState(216);
				match(RA);
				}
			}

			setState(219);
			expr(0);
			setState(220);
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

	public static class DefineCmdStatContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(BedrockLangParser.DEF, 0); }
		public DefineSignatureContext defineSignature() {
			return getRuleContext(DefineSignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefineCmdStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineCmdStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterDefineCmdStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitDefineCmdStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitDefineCmdStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineCmdStatContext defineCmdStat() throws RecognitionException {
		DefineCmdStatContext _localctx = new DefineCmdStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defineCmdStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(DEF);
			setState(223);
			defineSignature();
			setState(224);
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

	public static class DefineSignatureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BedrockLangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(BedrockLangParser.COLON, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public List<DefineSignatureWordSingleContext> defineSignatureWordSingle() {
			return getRuleContexts(DefineSignatureWordSingleContext.class);
		}
		public DefineSignatureWordSingleContext defineSignatureWordSingle(int i) {
			return getRuleContext(DefineSignatureWordSingleContext.class,i);
		}
		public List<DefineSignatureVariableContext> defineSignatureVariable() {
			return getRuleContexts(DefineSignatureVariableContext.class);
		}
		public DefineSignatureVariableContext defineSignatureVariable(int i) {
			return getRuleContext(DefineSignatureVariableContext.class,i);
		}
		public DefineSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterDefineSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitDefineSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitDefineSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineSignatureContext defineSignature() throws RecognitionException {
		DefineSignatureContext _localctx = new DefineSignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defineSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(227);
				match(COLON);
				setState(228);
				typeid();
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOLLAR || _la==ID) {
				{
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(231);
					defineSignatureWordSingle();
					}
					break;
				case DOLLAR:
					{
					setState(232);
					defineSignatureVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(237);
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

	public static class DefineSignatureWordSingleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BedrockLangParser.ID, 0); }
		public DefineSignatureWordSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineSignatureWordSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterDefineSignatureWordSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitDefineSignatureWordSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitDefineSignatureWordSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineSignatureWordSingleContext defineSignatureWordSingle() throws RecognitionException {
		DefineSignatureWordSingleContext _localctx = new DefineSignatureWordSingleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defineSignatureWordSingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ID);
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

	public static class DefineSignatureVariableContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BedrockLangParser.COLON, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public DefineSignatureVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineSignatureVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterDefineSignatureVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitDefineSignatureVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitDefineSignatureVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineSignatureVariableContext defineSignatureVariable() throws RecognitionException {
		DefineSignatureVariableContext _localctx = new DefineSignatureVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defineSignatureVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			varid();
			setState(241);
			match(COLON);
			setState(242);
			typeid();
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

	public static class DeclareVarStatContext extends ParserRuleContext {
		public DeclareVarStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVarStat; }
	 
		public DeclareVarStatContext() { }
		public void copyFrom(DeclareVarStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HasTypeVarDeclareContext extends DeclareVarStatContext {
		public TerminalNode VAR() { return getToken(BedrockLangParser.VAR, 0); }
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BedrockLangParser.COLON, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode SET() { return getToken(BedrockLangParser.SET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HasTypeVarDeclareContext(DeclareVarStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterHasTypeVarDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitHasTypeVarDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitHasTypeVarDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InferTypeVarDeclareContext extends DeclareVarStatContext {
		public TerminalNode VAR() { return getToken(BedrockLangParser.VAR, 0); }
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TerminalNode SET() { return getToken(BedrockLangParser.SET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InferTypeVarDeclareContext(DeclareVarStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterInferTypeVarDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitInferTypeVarDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitInferTypeVarDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareVarStatContext declareVarStat() throws RecognitionException {
		DeclareVarStatContext _localctx = new DeclareVarStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declareVarStat);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new HasTypeVarDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(VAR);
				setState(245);
				varid();
				setState(246);
				match(COLON);
				setState(247);
				typeid();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(248);
					match(SET);
					setState(249);
					expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new InferTypeVarDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(VAR);
				setState(253);
				varid();
				setState(254);
				match(SET);
				setState(255);
				expr(0);
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

	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BedrockLangParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(RETURN);
			setState(260);
			expr(0);
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

	public static class BreakStatContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(BedrockLangParser.BREAK, 0); }
		public TerminalNode ID() { return getToken(BedrockLangParser.ID, 0); }
		public BreakStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterBreakStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitBreakStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitBreakStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatContext breakStat() throws RecognitionException {
		BreakStatContext _localctx = new BreakStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_breakStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(BREAK);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(263);
				match(ID);
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

	public static class ContinueStatContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(BedrockLangParser.CONTINUE, 0); }
		public TerminalNode ID() { return getToken(BedrockLangParser.ID, 0); }
		public ContinueStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterContinueStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitContinueStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitContinueStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatContext continueStat() throws RecognitionException {
		ContinueStatContext _localctx = new ContinueStatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_continueStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(CONTINUE);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(267);
				match(ID);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandIdContext commandId() {
			return getRuleContext(CommandIdContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(BedrockLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BedrockLangParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_command);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			commandId();
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(271);
						match(ID);
						}
						break;
					case 2:
						{
						setState(272);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TerminalNode START() { return getToken(BedrockLangParser.START, 0); }
		public TerminalNode END() { return getToken(BedrockLangParser.END, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(BedrockLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BedrockLangParser.SEMICOLON, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(START);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LB) | (1L << PLUS) | (1L << MINUS) | (1L << DOLLAR) | (1L << LEN) | (1L << VAR) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << STRING) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << NULL) | (1L << ID))) != 0)) {
				{
				setState(283);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LB:
				case PLUS:
				case MINUS:
				case DOLLAR:
				case LEN:
				case STRING:
				case INT:
				case DEC:
				case BOOL:
				case NULL:
				case ID:
					{
					setState(279);
					expr(0);
					setState(280);
					match(SEMICOLON);
					}
					break;
				case VAR:
				case RETURN:
				case IF:
				case WHILE:
				case BREAK:
				case CONTINUE:
					{
					setState(282);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(END);
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

	public static class TypeidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BedrockLangParser.ID, 0); }
		public List<TerminalNode> LA() { return getTokens(BedrockLangParser.LA); }
		public TerminalNode LA(int i) {
			return getToken(BedrockLangParser.LA, i);
		}
		public List<TerminalNode> RA() { return getTokens(BedrockLangParser.RA); }
		public TerminalNode RA(int i) {
			return getToken(BedrockLangParser.RA, i);
		}
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterTypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitTypeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitTypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ID);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LA) {
				{
				{
				setState(291);
				match(LA);
				setState(292);
				match(RA);
				}
				}
				setState(297);
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

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BedrockLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BedrockLangParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(BedrockLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BedrockLangParser.DOT, i);
		}
		public List<VaridContext> varid() {
			return getRuleContexts(VaridContext.class);
		}
		public VaridContext varid(int i) {
			return getRuleContext(VaridContext.class,i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ID);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(299);
						match(DOT);
						setState(300);
						match(ID);
						}
						break;
					case 2:
						{
						setState(301);
						match(DOT);
						setState(302);
						varid();
						}
						break;
					}
					} 
				}
				setState(307);
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
			exitRule();
		}
		return _localctx;
	}

	public static class VaridContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(BedrockLangParser.DOLLAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VaridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterVarid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitVarid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitVarid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaridContext varid() throws RecognitionException {
		VaridContext _localctx = new VaridContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(DOLLAR);
			setState(309);
			id();
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

	public static class CommandIdContext extends ParserRuleContext {
		public CommandIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandId; }
	 
		public CommandIdContext() { }
		public void copyFrom(CommandIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VirtualCommandContext extends CommandIdContext {
		public List<VaridContext> varid() {
			return getRuleContexts(VaridContext.class);
		}
		public VaridContext varid(int i) {
			return getRuleContext(VaridContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(BedrockLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BedrockLangParser.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(BedrockLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BedrockLangParser.ID, i);
		}
		public VirtualCommandContext(CommandIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterVirtualCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitVirtualCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitVirtualCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvokeCommandContext extends CommandIdContext {
		public List<TerminalNode> ID() { return getTokens(BedrockLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BedrockLangParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(BedrockLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BedrockLangParser.DOT, i);
		}
		public List<VaridContext> varid() {
			return getRuleContexts(VaridContext.class);
		}
		public VaridContext varid(int i) {
			return getRuleContext(VaridContext.class,i);
		}
		public InvokeCommandContext(CommandIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterInvokeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitInvokeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitInvokeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallCommandContext extends CommandIdContext {
		public TerminalNode ID() { return getToken(BedrockLangParser.ID, 0); }
		public CallCommandContext(CommandIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).enterCallCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BedrockLangListener ) ((BedrockLangListener)listener).exitCallCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BedrockLangVisitor ) return ((BedrockLangVisitor<? extends T>)visitor).visitCallCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandIdContext commandId() throws RecognitionException {
		CommandIdContext _localctx = new CommandIdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_commandId);
		try {
			int _alt;
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new InvokeCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(ID);
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(316);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(312);
							match(DOT);
							setState(313);
							match(ID);
							}
							break;
						case 2:
							{
							setState(314);
							match(DOT);
							setState(315);
							varid();
							}
							break;
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(321);
				match(DOT);
				setState(322);
				match(ID);
				}
				break;
			case 2:
				_localctx = new CallCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(ID);
				}
				break;
			case 3:
				_localctx = new VirtualCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				varid();
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(329);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(325);
							match(DOT);
							setState(326);
							match(ID);
							}
							break;
						case 2:
							{
							setState(327);
							match(DOT);
							setState(328);
							varid();
							}
							break;
						}
						} 
					}
					setState(333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(334);
				match(DOT);
				setState(335);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0156\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\3\2\3\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4a\n\4\f\4\16"+
		"\4d\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u0084\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ac\n\4\f\4\16\4\u00af\13\4\3\5\3\5\3\5\5"+
		"\5\u00b4\n\5\6\5\u00b6\n\5\r\5\16\5\u00b7\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00c2\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cf"+
		"\n\7\f\7\16\7\u00d2\13\7\3\7\3\7\5\7\u00d6\n\7\3\b\3\b\3\b\3\b\5\b\u00dc"+
		"\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00e8\n\n\3\n\3\n\7\n"+
		"\u00ec\n\n\f\n\16\n\u00ef\13\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00fd\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0104\n\r\3\16\3\16\3"+
		"\16\3\17\3\17\5\17\u010b\n\17\3\20\3\20\5\20\u010f\n\20\3\21\3\21\3\21"+
		"\7\21\u0114\n\21\f\21\16\21\u0117\13\21\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u011e\n\22\f\22\16\22\u0121\13\22\3\22\3\22\3\23\3\23\3\23\7\23\u0128"+
		"\n\23\f\23\16\23\u012b\13\23\3\24\3\24\3\24\3\24\3\24\7\24\u0132\n\24"+
		"\f\24\16\24\u0135\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u013f"+
		"\n\26\f\26\16\26\u0142\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7"+
		"\26\u014c\n\26\f\26\16\26\u014f\13\26\3\26\3\26\3\26\5\26\u0154\n\26\3"+
		"\26\2\3\6\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2.\62"+
		"\2\u017f\2\62\3\2\2\2\4M\3\2\2\2\6\u0083\3\2\2\2\b\u00c1\3\2\2\2\n\u00c3"+
		"\3\2\2\2\f\u00c7\3\2\2\2\16\u00d7\3\2\2\2\20\u00e0\3\2\2\2\22\u00e4\3"+
		"\2\2\2\24\u00f0\3\2\2\2\26\u00f2\3\2\2\2\30\u0103\3\2\2\2\32\u0105\3\2"+
		"\2\2\34\u0108\3\2\2\2\36\u010c\3\2\2\2 \u0110\3\2\2\2\"\u0118\3\2\2\2"+
		"$\u0124\3\2\2\2&\u012c\3\2\2\2(\u0136\3\2\2\2*\u0153\3\2\2\2,.\5\b\5\2"+
		"-/\7\7\2\2.-\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60,\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63<\3\2\2\2\64\62\3\2\2\2\65\66\5\30\r\2\66"+
		"\67\7\7\2\2\67;\3\2\2\28;\5\20\t\29;\5\n\6\2:\65\3\2\2\2:8\3\2\2\2:9\3"+
		"\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\3\3\2\2\2><\3\2\2\2?N\5\f\7\2@N"+
		"\5\16\b\2AB\5\30\r\2BC\7\7\2\2CN\3\2\2\2DE\5\32\16\2EF\7\7\2\2FN\3\2\2"+
		"\2GH\5\34\17\2HI\7\7\2\2IN\3\2\2\2JK\5\36\20\2KL\7\7\2\2LN\3\2\2\2M?\3"+
		"\2\2\2M@\3\2\2\2MA\3\2\2\2MD\3\2\2\2MG\3\2\2\2MJ\3\2\2\2N\5\3\2\2\2OP"+
		"\b\4\1\2P\u0084\5 \21\2Q\u0084\t\2\2\2R\u0084\5(\25\2ST\7\t\2\2TU\5\6"+
		"\4\2UV\7\n\2\2V\u0084\3\2\2\2WX\7\23\2\2X\u0084\5\6\4\24YZ\7\24\2\2Z\u0084"+
		"\5\6\4\23[b\5(\25\2\\]\7\13\2\2]^\5\6\4\2^_\7\f\2\2_a\3\2\2\2`\\\3\2\2"+
		"\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\22\2\2fg\5\6"+
		"\4\7g\u0084\3\2\2\2ho\7\63\2\2ij\7\17\2\2jn\7\63\2\2kl\7\17\2\2ln\5(\25"+
		"\2mi\3\2\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2"+
		"\2rs\7\17\2\2s\u0084\5(\25\2t{\5(\25\2uv\7\17\2\2vz\7\63\2\2wx\7\17\2"+
		"\2xz\5(\25\2yu\3\2\2\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2"+
		"\2}{\3\2\2\2~\177\7\17\2\2\177\u0080\5(\25\2\u0080\u0084\3\2\2\2\u0081"+
		"\u0082\7 \2\2\u0082\u0084\5\6\4\4\u0083O\3\2\2\2\u0083Q\3\2\2\2\u0083"+
		"R\3\2\2\2\u0083S\3\2\2\2\u0083W\3\2\2\2\u0083Y\3\2\2\2\u0083[\3\2\2\2"+
		"\u0083h\3\2\2\2\u0083t\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u00ad\3\2\2\2"+
		"\u0085\u0086\f\22\2\2\u0086\u0087\7\23\2\2\u0087\u00ac\5\6\4\23\u0088"+
		"\u0089\f\21\2\2\u0089\u008a\7\24\2\2\u008a\u00ac\5\6\4\22\u008b\u008c"+
		"\f\20\2\2\u008c\u008d\7\25\2\2\u008d\u00ac\5\6\4\21\u008e\u008f\f\17\2"+
		"\2\u008f\u0090\7\26\2\2\u0090\u00ac\5\6\4\20\u0091\u0092\f\16\2\2\u0092"+
		"\u0093\7\20\2\2\u0093\u00ac\5\6\4\17\u0094\u0095\f\r\2\2\u0095\u0096\7"+
		"\21\2\2\u0096\u00ac\5\6\4\16\u0097\u0098\f\f\2\2\u0098\u0099\7\34\2\2"+
		"\u0099\u00ac\5\6\4\r\u009a\u009b\f\13\2\2\u009b\u009c\7\33\2\2\u009c\u00ac"+
		"\5\6\4\f\u009d\u009e\f\n\2\2\u009e\u009f\7\36\2\2\u009f\u00ac\5\6\4\13"+
		"\u00a0\u00a1\f\t\2\2\u00a1\u00a2\7\35\2\2\u00a2\u00ac\5\6\4\n\u00a3\u00a4"+
		"\f\b\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00ac\5\6\4\t\u00a6\u00a7\f\3\2\2"+
		"\u00a7\u00a8\7\13\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\7\f\2\2\u00aa\u00ac"+
		"\3\2\2\2\u00ab\u0085\3\2\2\2\u00ab\u0088\3\2\2\2\u00ab\u008b\3\2\2\2\u00ab"+
		"\u008e\3\2\2\2\u00ab\u0091\3\2\2\2\u00ab\u0094\3\2\2\2\u00ab\u0097\3\2"+
		"\2\2\u00ab\u009a\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\7\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5"+
		"\7%\2\2\u00b1\u00b3\7\63\2\2\u00b2\u00b4\7\6\2\2\u00b3\u00b2\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\7&\2\2\u00ba\u00c2\5&\24\2\u00bb\u00bc\7%\2\2\u00bc\u00bd\7\25"+
		"\2\2\u00bd\u00be\7&\2\2\u00be\u00c2\5&\24\2\u00bf\u00c0\7%\2\2\u00c0\u00c2"+
		"\5&\24\2\u00c1\u00b0\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\t\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4\u00c5\7\63\2\2\u00c5\u00c6\5\"\22"+
		"\2\u00c6\13\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00d0"+
		"\5\"\22\2\u00ca\u00cb\7*\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\5\"\22\2"+
		"\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\7)\2\2\u00d4\u00d6\5\"\22\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\r\3\2\2\2\u00d7\u00db\7+\2\2\u00d8\u00d9\7\13\2\2\u00d9\u00da"+
		"\7\63\2\2\u00da\u00dc\7\f\2\2\u00db\u00d8\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00de\5\6\4\2\u00de\u00df\5\"\22\2\u00df\17"+
		"\3\2\2\2\u00e0\u00e1\7!\2\2\u00e1\u00e2\5\22\n\2\u00e2\u00e3\5\"\22\2"+
		"\u00e3\21\3\2\2\2\u00e4\u00e7\7\63\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00e8"+
		"\5$\23\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ed\3\2\2\2\u00e9"+
		"\u00ec\5\24\13\2\u00ea\u00ec\5\26\f\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\23\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\63\2\2\u00f1\25\3\2\2\2"+
		"\u00f2\u00f3\5(\25\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\5$\23\2\u00f5\27"+
		"\3\2\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\5(\25\2\u00f8\u00f9\7\b\2\2\u00f9"+
		"\u00fc\5$\23\2\u00fa\u00fb\7\22\2\2\u00fb\u00fd\5\6\4\2\u00fc\u00fa\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0104\3\2\2\2\u00fe\u00ff\7\"\2\2\u00ff"+
		"\u0100\5(\25\2\u0100\u0101\7\22\2\2\u0101\u0102\5\6\4\2\u0102\u0104\3"+
		"\2\2\2\u0103\u00f6\3\2\2\2\u0103\u00fe\3\2\2\2\u0104\31\3\2\2\2\u0105"+
		"\u0106\7$\2\2\u0106\u0107\5\6\4\2\u0107\33\3\2\2\2\u0108\u010a\7,\2\2"+
		"\u0109\u010b\7\63\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\35"+
		"\3\2\2\2\u010c\u010e\7-\2\2\u010d\u010f\7\63\2\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\37\3\2\2\2\u0110\u0115\5*\26\2\u0111\u0114\7\63\2"+
		"\2\u0112\u0114\5\6\4\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116!\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011f\7\r\2\2\u0119\u011a\5\6\4\2\u011a\u011b\7\7"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011e\5\4\3\2\u011d\u0119\3\2\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\16\2\2\u0123"+
		"#\3\2\2\2\u0124\u0129\7\63\2\2\u0125\u0126\7\13\2\2\u0126\u0128\7\f\2"+
		"\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a%\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0133\7\63\2\2\u012d"+
		"\u012e\7\17\2\2\u012e\u0132\7\63\2\2\u012f\u0130\7\17\2\2\u0130\u0132"+
		"\5(\25\2\u0131\u012d\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\'\3\2\2\2\u0135\u0133\3\2\2\2"+
		"\u0136\u0137\7\37\2\2\u0137\u0138\5&\24\2\u0138)\3\2\2\2\u0139\u0140\7"+
		"\63\2\2\u013a\u013b\7\17\2\2\u013b\u013f\7\63\2\2\u013c\u013d\7\17\2\2"+
		"\u013d\u013f\5(\25\2\u013e\u013a\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0144\7\17\2\2\u0144\u0154\7\63\2\2\u0145\u0154\7"+
		"\63\2\2\u0146\u014d\5(\25\2\u0147\u0148\7\17\2\2\u0148\u014c\7\63\2\2"+
		"\u0149\u014a\7\17\2\2\u014a\u014c\5(\25\2\u014b\u0147\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7\17\2\2\u0151\u0152\7"+
		"\63\2\2\u0152\u0154\3\2\2\2\u0153\u0139\3\2\2\2\u0153\u0145\3\2\2\2\u0153"+
		"\u0146\3\2\2\2\u0154+\3\2\2\2(.\62:<Mbmoy{\u0083\u00ab\u00ad\u00b3\u00b7"+
		"\u00c1\u00d0\u00d5\u00db\u00e7\u00eb\u00ed\u00fc\u0103\u010a\u010e\u0113"+
		"\u0115\u011d\u011f\u0129\u0131\u0133\u013e\u0140\u014b\u014d\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}