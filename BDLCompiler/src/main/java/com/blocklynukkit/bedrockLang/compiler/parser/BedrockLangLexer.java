// Generated from D:/ideaProject/BedrockLang/BDLCompiler/src/main/antlr\BedrockLang.g4 by ANTLR 4.9.1
package com.blocklynukkit.bedrockLang.compiler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BedrockLangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "MUTICOMMENT", "COMMA", "SEMICOLON", "COLON", "LB", 
			"RB", "LA", "RA", "START", "END", "DOT", "EQ", "NEQ", "SET", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "REMAIN", "NOT", "AND", "OR", "GTREQ", 
			"GTR", "LWREQ", "LWR", "DOLLAR", "LEN", "DEF", "VAR", "WHEN", "RETURN", 
			"IMPORT", "FROM", "AS", "IF", "ELSE", "ELIF", "WHILE", "BREAK", "CONTINUE", 
			"STRCHAR", "INTEGER", "ESCAPECHAR", "STRING", "INT", "DEC", "BOOL", "NULL", 
			"IDStart", "IDPart", "ID"
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


	public BedrockLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BedrockLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0150\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3x\n\3\f\3\16\3{\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4"+
		"\u0086\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6\u0090\n\6\r\6\16\6\u0091"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\5-\u0112"+
		"\n-\3.\6.\u0115\n.\r.\16.\u0116\3/\3/\3/\3\60\3\60\3\60\7\60\u011f\n\60"+
		"\f\60\16\60\u0122\13\60\3\60\3\60\3\60\3\60\7\60\u0128\n\60\f\60\16\60"+
		"\u012b\13\60\3\60\5\60\u012e\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u013f\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\7\67\u014c\n\67\f\67\16\67\u014f"+
		"\13\67\3\u0084\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]\2_.a/c\60e\61g"+
		"\62i\2k\2m\63\3\2\n\5\2\13\f\17\17\"\"\3\2\f\f\3\2$$\3\2\62;\4\2$$^^\4"+
		"\2))^^\25\2\13\f\17\17\"B]`bb}\u0080\u00b9\u00b9\u201a\u201b\u201e\u201f"+
		"\u2028\u2028\u3003\u3004\u300c\u300d\u3012\u3013\uff03\uff03\uff0a\uff0b"+
		"\uff0e\uff0e\uff1c\uff1d\uff21\uff21\uffe7\uffe7\26\2\13\f\17\17\"\61"+
		"<B]`bb}\u0080\u00b9\u00b9\u201a\u201b\u201e\u201f\u2028\u2028\u3003\u3004"+
		"\u300c\u300d\u3012\u3013\uff03\uff03\uff0a\uff0b\uff0e\uff0e\uff1c\uff1d"+
		"\uff21\uff21\uffe7\uffe7\2\u0156\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5s\3\2\2\2"+
		"\7~\3\2\2\2\t\u008c\3\2\2\2\13\u008f\3\2\2\2\r\u0093\3\2\2\2\17\u0095"+
		"\3\2\2\2\21\u0097\3\2\2\2\23\u0099\3\2\2\2\25\u009b\3\2\2\2\27\u009d\3"+
		"\2\2\2\31\u009f\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37\u00a6\3\2"+
		"\2\2!\u00a9\3\2\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b1"+
		"\3\2\2\2+\u00b3\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2"+
		"\63\u00bb\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c3\3\2\2\2;\u00c5"+
		"\3\2\2\2=\u00c7\3\2\2\2?\u00c9\3\2\2\2A\u00cd\3\2\2\2C\u00d1\3\2\2\2E"+
		"\u00d6\3\2\2\2G\u00dd\3\2\2\2I\u00e4\3\2\2\2K\u00e9\3\2\2\2M\u00ec\3\2"+
		"\2\2O\u00ef\3\2\2\2Q\u00f4\3\2\2\2S\u00f9\3\2\2\2U\u00ff\3\2\2\2W\u0105"+
		"\3\2\2\2Y\u0111\3\2\2\2[\u0114\3\2\2\2]\u0118\3\2\2\2_\u012d\3\2\2\2a"+
		"\u012f\3\2\2\2c\u0131\3\2\2\2e\u013e\3\2\2\2g\u0140\3\2\2\2i\u0145\3\2"+
		"\2\2k\u0147\3\2\2\2m\u0149\3\2\2\2op\t\2\2\2pq\3\2\2\2qr\b\2\2\2r\4\3"+
		"\2\2\2st\7\61\2\2tu\7\61\2\2uy\3\2\2\2vx\n\3\2\2wv\3\2\2\2x{\3\2\2\2y"+
		"w\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\b\3\2\2}\6\3\2\2\2~\177\7\61"+
		"\2\2\177\u0080\7,\2\2\u0080\u0084\3\2\2\2\u0081\u0083\13\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7,\2\2\u0088\u0089\7\61"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\4\2\2\u008b\b\3\2\2\2\u008c\u008d"+
		"\7.\2\2\u008d\n\3\2\2\2\u008e\u0090\7=\2\2\u008f\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\f\3\2\2\2\u0093"+
		"\u0094\7<\2\2\u0094\16\3\2\2\2\u0095\u0096\7*\2\2\u0096\20\3\2\2\2\u0097"+
		"\u0098\7+\2\2\u0098\22\3\2\2\2\u0099\u009a\7]\2\2\u009a\24\3\2\2\2\u009b"+
		"\u009c\7_\2\2\u009c\26\3\2\2\2\u009d\u009e\7}\2\2\u009e\30\3\2\2\2\u009f"+
		"\u00a0\7\177\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7\60\2\2\u00a2\34\3\2\2"+
		"\2\u00a3\u00a4\7?\2\2\u00a4\u00a5\7?\2\2\u00a5\36\3\2\2\2\u00a6\u00a7"+
		"\7#\2\2\u00a7\u00a8\7?\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\"\3"+
		"\2\2\2\u00ab\u00ac\7-\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae&\3\2"+
		"\2\2\u00af\u00b0\7,\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2*\3\2"+
		"\2\2\u00b3\u00b4\7\'\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6.\3\2"+
		"\2\2\u00b7\u00b8\7(\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7~\2\2\u00ba\62\3"+
		"\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7?\2\2\u00bd\64\3\2\2\2\u00be\u00bf"+
		"\7@\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2\7?\2\2\u00c28"+
		"\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4:\3\2\2\2\u00c5\u00c6\7&\2\2\u00c6<\3"+
		"\2\2\2\u00c7\u00c8\7%\2\2\u00c8>\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb\u00cc\7h\2\2\u00cc@\3\2\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7t\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3"+
		"\7j\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7p\2\2\u00d5D\3\2\2\2\u00d6\u00d7"+
		"\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7w\2\2\u00da"+
		"\u00db\7t\2\2\u00db\u00dc\7p\2\2\u00dcF\3\2\2\2\u00dd\u00de\7k\2\2\u00de"+
		"\u00df\7o\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7t\2\2"+
		"\u00e2\u00e3\7v\2\2\u00e3H\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7t\2"+
		"\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7o\2\2\u00e8J\3\2\2\2\u00e9\u00ea\7"+
		"c\2\2\u00ea\u00eb\7u\2\2\u00ebL\3\2\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee"+
		"\7h\2\2\u00eeN\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2"+
		"\7u\2\2\u00f2\u00f3\7g\2\2\u00f3P\3\2\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6"+
		"\7n\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7h\2\2\u00f8R\3\2\2\2\u00f9\u00fa"+
		"\7y\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7n\2\2\u00fd"+
		"\u00fe\7g\2\2\u00feT\3\2\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7t\2\2\u0101"+
		"\u0102\7g\2\2\u0102\u0103\7c\2\2\u0103\u0104\7m\2\2\u0104V\3\2\2\2\u0105"+
		"\u0106\7e\2\2\u0106\u0107\7q\2\2\u0107\u0108\7p\2\2\u0108\u0109\7v\2\2"+
		"\u0109\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7w\2\2\u010c\u010d"+
		"\7g\2\2\u010dX\3\2\2\2\u010e\u0112\n\4\2\2\u010f\u0110\7^\2\2\u0110\u0112"+
		"\7$\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0112Z\3\2\2\2\u0113\u0115"+
		"\t\5\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\\\3\2\2\2\u0118\u0119\7^\2\2\u0119\u011a\13\2\2\2"+
		"\u011a^\3\2\2\2\u011b\u0120\7$\2\2\u011c\u011f\5]/\2\u011d\u011f\n\6\2"+
		"\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u012e\7$\2\2\u0124\u0129\7)\2\2\u0125\u0128\5]/\2\u0126\u0128\n\7\2\2"+
		"\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012e\7)\2\2\u012d\u011b\3\2\2\2\u012d\u0124\3\2\2\2\u012e`\3\2\2\2\u012f"+
		"\u0130\5[.\2\u0130b\3\2\2\2\u0131\u0132\5[.\2\u0132\u0133\7\60\2\2\u0133"+
		"\u0134\5[.\2\u0134d\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137"+
		"\u0138\7w\2\2\u0138\u013f\7g\2\2\u0139\u013a\7h\2\2\u013a\u013b\7c\2\2"+
		"\u013b\u013c\7n\2\2\u013c\u013d\7u\2\2\u013d\u013f\7g\2\2\u013e\u0135"+
		"\3\2\2\2\u013e\u0139\3\2\2\2\u013ff\3\2\2\2\u0140\u0141\7p\2\2\u0141\u0142"+
		"\7w\2\2\u0142\u0143\7n\2\2\u0143\u0144\7n\2\2\u0144h\3\2\2\2\u0145\u0146"+
		"\n\b\2\2\u0146j\3\2\2\2\u0147\u0148\n\t\2\2\u0148l\3\2\2\2\u0149\u014d"+
		"\5i\65\2\u014a\u014c\5k\66\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014en\3\2\2\2\u014f\u014d\3\2\2\2"+
		"\17\2y\u0084\u0091\u0111\u0116\u011e\u0120\u0127\u0129\u012d\u013e\u014d"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}