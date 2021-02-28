// Generated from br/ufscar/dc/compiladores/lexico/PiaLexer.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PiaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RESERVED=1, OPERATORS=2, WRONG_COMMENT=3, COMMENT=4, NUM_INT=5, NUM_REAL=6, 
		WRONG_CADEIA=7, CADEIA=8, IDENT=9, WHITE=10, WRONG_SYMBOL=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RESERVED", "OPERATORS", "WRONG_COMMENT", "COMMENT", "NUM_INT", "NUM_REAL", 
			"WRONG_CADEIA", "CADEIA", "IDENT", "WHITE", "WRONG_SYMBOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RESERVED", "OPERATORS", "WRONG_COMMENT", "COMMENT", "NUM_INT", 
			"NUM_REAL", "WRONG_CADEIA", "CADEIA", "IDENT", "WHITE", "WRONG_SYMBOL"
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


	public PiaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PiaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u0162\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2\u010f\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u011e\n\3\3\4\3\4\7\4\u0122\n\4\f\4\16\4\u0125\13\4\3\4"+
		"\3\4\3\5\3\5\7\5\u012b\n\5\f\5\16\5\u012e\13\5\3\5\3\5\3\6\6\6\u0133\n"+
		"\6\r\6\16\6\u0134\3\7\6\7\u0138\n\7\r\7\16\7\u0139\3\7\3\7\6\7\u013e\n"+
		"\7\r\7\16\7\u013f\3\b\3\b\3\b\3\b\7\b\u0146\n\b\f\b\16\b\u0149\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\7\t\u0151\n\t\f\t\16\t\u0154\13\t\3\t\3\t\3\n\3"+
		"\n\7\n\u015a\n\n\f\n\16\n\u015d\13\n\3\13\3\13\3\f\3\f\2\2\r\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\f\t\2*+..\60\60<<??]]_`"+
		"\6\2\'(,-//\61\61\4\2>>@@\4\2}}\177\177\5\2\f\f}}\177\177\3\2$$\4\2\f"+
		"\f$$\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\f\"\"\2\u0196\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\u010e\3\2\2\2\5\u011d"+
		"\3\2\2\2\7\u011f\3\2\2\2\t\u0128\3\2\2\2\13\u0132\3\2\2\2\r\u0137\3\2"+
		"\2\2\17\u0141\3\2\2\2\21\u014c\3\2\2\2\23\u0157\3\2\2\2\25\u015e\3\2\2"+
		"\2\27\u0160\3\2\2\2\31\32\7c\2\2\32\33\7n\2\2\33\34\7i\2\2\34\35\7q\2"+
		"\2\35\36\7t\2\2\36\37\7k\2\2\37 \7v\2\2 !\7o\2\2!\u010f\7q\2\2\"#\7h\2"+
		"\2#$\7k\2\2$%\7o\2\2%&\7a\2\2&\'\7c\2\2\'(\7n\2\2()\7i\2\2)*\7q\2\2*+"+
		"\7t\2\2+,\7k\2\2,-\7v\2\2-.\7o\2\2.\u010f\7q\2\2/\60\7f\2\2\60\61\7g\2"+
		"\2\61\62\7e\2\2\62\63\7n\2\2\63\64\7c\2\2\64\65\7t\2\2\65\u010f\7g\2\2"+
		"\66\67\7e\2\2\678\7q\2\289\7p\2\29:\7u\2\2:;\7v\2\2;<\7c\2\2<=\7p\2\2"+
		"=>\7v\2\2>\u010f\7g\2\2?@\7v\2\2@A\7k\2\2AB\7r\2\2B\u010f\7q\2\2CD\7n"+
		"\2\2DE\7k\2\2EF\7v\2\2FG\7g\2\2GH\7t\2\2HI\7c\2\2I\u010f\7n\2\2JK\7k\2"+
		"\2KL\7p\2\2LM\7v\2\2MN\7g\2\2NO\7k\2\2OP\7t\2\2P\u010f\7q\2\2QR\7t\2\2"+
		"RS\7g\2\2ST\7c\2\2T\u010f\7n\2\2UV\7n\2\2VW\7q\2\2WX\7i\2\2XY\7k\2\2Y"+
		"Z\7e\2\2Z\u010f\7q\2\2[\\\7x\2\2\\]\7g\2\2]^\7t\2\2^_\7f\2\2_`\7c\2\2"+
		"`a\7f\2\2ab\7g\2\2bc\7k\2\2cd\7t\2\2d\u010f\7q\2\2ef\7h\2\2fg\7c\2\2g"+
		"h\7n\2\2hi\7u\2\2i\u010f\7q\2\2jk\7t\2\2kl\7g\2\2lm\7i\2\2mn\7k\2\2no"+
		"\7u\2\2op\7v\2\2pq\7t\2\2q\u010f\7q\2\2rs\7h\2\2st\7k\2\2tu\7o\2\2uv\7"+
		"a\2\2vw\7t\2\2wx\7g\2\2xy\7i\2\2yz\7k\2\2z{\7u\2\2{|\7v\2\2|}\7t\2\2}"+
		"\u010f\7q\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080\u0081\7q\2\2\u0081\u0082"+
		"\7e\2\2\u0082\u0083\7g\2\2\u0083\u0084\7f\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7o\2\2\u0086\u0087\7g\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2"+
		"\u0089\u010f\7q\2\2\u008a\u008b\7h\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7o\2\2\u008d\u008e\7a\2\2\u008e\u008f\7r\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7q\2\2\u0091\u0092\7e\2\2\u0092\u0093\7g\2\2\u0093\u0094\7f\2\2"+
		"\u0094\u0095\7k\2\2\u0095\u0096\7o\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7v\2\2\u0099\u010f\7q\2\2\u009a\u009b\7h\2\2\u009b"+
		"\u009c\7w\2\2\u009c\u009d\7p\2\2\u009d\u009e\7e\2\2\u009e\u009f\7c\2\2"+
		"\u009f\u010f\7q\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3"+
		"\7o\2\2\u00a3\u00a4\7a\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7w\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7c\2\2\u00a9\u010f\7q\2\2"+
		"\u00aa\u00ab\7x\2\2\u00ab\u00ac\7c\2\2\u00ac\u010f\7t\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7k\2\2\u00b0\u010f\7c\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\u00b6\7g\2\2\u00b6\u00b7\7x\2\2\u00b7\u010f\7c\2\2\u00b8\u00b9"+
		"\7u\2\2\u00b9\u010f\7g\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\7c\2\2\u00be\u010f\7q\2\2\u00bf\u00c0\7u\2\2"+
		"\u00c0\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7c\2\2\u00c3\u010f"+
		"\7q\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7o\2\2\u00c7"+
		"\u00c8\7a\2\2\u00c8\u00c9\7u\2\2\u00c9\u010f\7g\2\2\u00ca\u00cb\7e\2\2"+
		"\u00cb\u00cc\7c\2\2\u00cc\u00cd\7u\2\2\u00cd\u010f\7q\2\2\u00ce\u00cf"+
		"\7u\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7l\2\2\u00d1\u010f\7c\2\2\u00d2"+
		"\u00d3\7h\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6\7a\2\2"+
		"\u00d6\u00d7\7e\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7u\2\2\u00d9\u010f"+
		"\7q\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7t\2\2\u00dd"+
		"\u010f\7c\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7v\2\2\u00e0\u010f\7g\2\2"+
		"\u00e1\u00e2\7h\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7e\2\2\u00e4\u010f"+
		"\7c\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7o\2\2\u00e8"+
		"\u00e9\7a\2\2\u00e9\u00ea\7r\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7t\2\2"+
		"\u00ec\u010f\7c\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0"+
		"\7v\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7p\2\2\u00f3"+
		"\u010f\7g\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7c\2\2\u00f6\u010f\7q\2\2"+
		"\u00f7\u00f8\7q\2\2\u00f8\u010f\7w\2\2\u00f9\u010f\7g\2\2\u00fa\u00fb"+
		"\7g\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7s\2\2\u00fd\u00fe\7w\2\2\u00fe"+
		"\u00ff\7c\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7v\2\2\u0101\u010f\7q\2\2"+
		"\u0102\u0103\7h\2\2\u0103\u0104\7k\2\2\u0104\u0105\7o\2\2\u0105\u0106"+
		"\7a\2\2\u0106\u0107\7g\2\2\u0107\u0108\7p\2\2\u0108\u0109\7s\2\2\u0109"+
		"\u010a\7w\2\2\u010a\u010b\7c\2\2\u010b\u010c\7p\2\2\u010c\u010d\7v\2\2"+
		"\u010d\u010f\7q\2\2\u010e\31\3\2\2\2\u010e\"\3\2\2\2\u010e/\3\2\2\2\u010e"+
		"\66\3\2\2\2\u010e?\3\2\2\2\u010eC\3\2\2\2\u010eJ\3\2\2\2\u010eQ\3\2\2"+
		"\2\u010eU\3\2\2\2\u010e[\3\2\2\2\u010ee\3\2\2\2\u010ej\3\2\2\2\u010er"+
		"\3\2\2\2\u010e~\3\2\2\2\u010e\u008a\3\2\2\2\u010e\u009a\3\2\2\2\u010e"+
		"\u00a0\3\2\2\2\u010e\u00aa\3\2\2\2\u010e\u00ad\3\2\2\2\u010e\u00b1\3\2"+
		"\2\2\u010e\u00b8\3\2\2\2\u010e\u00ba\3\2\2\2\u010e\u00bf\3\2\2\2\u010e"+
		"\u00c4\3\2\2\2\u010e\u00ca\3\2\2\2\u010e\u00ce\3\2\2\2\u010e\u00d2\3\2"+
		"\2\2\u010e\u00da\3\2\2\2\u010e\u00de\3\2\2\2\u010e\u00e1\3\2\2\2\u010e"+
		"\u00e5\3\2\2\2\u010e\u00ed\3\2\2\2\u010e\u00f4\3\2\2\2\u010e\u00f7\3\2"+
		"\2\2\u010e\u00f9\3\2\2\2\u010e\u00fa\3\2\2\2\u010e\u0102\3\2\2\2\u010f"+
		"\4\3\2\2\2\u0110\u011e\t\2\2\2\u0111\u0112\7>\2\2\u0112\u011e\7/\2\2\u0113"+
		"\u0114\7\60\2\2\u0114\u011e\7\60\2\2\u0115\u011e\t\3\2\2\u0116\u0117\7"+
		">\2\2\u0117\u011e\7@\2\2\u0118\u0119\7@\2\2\u0119\u011e\7?\2\2\u011a\u011b"+
		"\7>\2\2\u011b\u011e\7?\2\2\u011c\u011e\t\4\2\2\u011d\u0110\3\2\2\2\u011d"+
		"\u0111\3\2\2\2\u011d\u0113\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0116\3\2"+
		"\2\2\u011d\u0118\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\6\3\2\2\2\u011f\u0123\7}\2\2\u0120\u0122\n\5\2\2\u0121\u0120\3\2\2\2"+
		"\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\f\2\2\u0127\b\3\2\2\2\u0128"+
		"\u012c\7}\2\2\u0129\u012b\n\6\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\7\177\2\2\u0130\n\3\2\2\2\u0131\u0133\4\62"+
		";\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\f\3\2\2\2\u0136\u0138\4\62;\2\u0137\u0136\3\2\2\2"+
		"\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013d\7\60\2\2\u013c\u013e\4\62;\2\u013d\u013c\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\16"+
		"\3\2\2\2\u0141\u0147\7$\2\2\u0142\u0143\7^\2\2\u0143\u0146\7$\2\2\u0144"+
		"\u0146\n\7\2\2\u0145\u0142\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014b\7\f\2\2\u014b\20\3\2\2\2\u014c\u0152\7$\2\2"+
		"\u014d\u014e\7^\2\2\u014e\u0151\7$\2\2\u014f\u0151\n\b\2\2\u0150\u014d"+
		"\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7$"+
		"\2\2\u0156\22\3\2\2\2\u0157\u015b\t\t\2\2\u0158\u015a\t\n\2\2\u0159\u0158"+
		"\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\24\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\t\13\2\2\u015f\26\3\2\2\2"+
		"\u0160\u0161\13\2\2\2\u0161\30\3\2\2\2\17\2\u010e\u011d\u0123\u012c\u0134"+
		"\u0139\u013f\u0145\u0147\u0150\u0152\u015b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}