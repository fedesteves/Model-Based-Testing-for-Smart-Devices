// Generated from lexerUI.g4 by ANTLR 4.7.1
package com.mtdi.ModelBasedTesting;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lexerUI extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, Back=2, Menu=3, Tap=4, LongTap=5, DoubleTap=6, Swipe=7, Fill=8, 
		EditDate=9, EditTime=10, IsDisplayed=11, IsCompletelyDisplayed=12, HasFocus=13, 
		IsEnabled=14, IsClickable=15, Validate=16, ListTap=17, ListScroll=18, 
		ListInsert=19, ListSave=20, ListCancel=21, ListSearch=22, ListDelete=23, 
		ListUpdate=24, Go=25, COMA=26, TP=27, IP=28, FP=29, DC=30, Control_name=31, 
		AnyText=32, LetterOrDigitWithWS=33, LetterOrDigit=34, SLD=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "Back", "Menu", "Tap", "LongTap", "DoubleTap", "Swipe", "Fill", 
		"EditDate", "EditTime", "IsDisplayed", "IsCompletelyDisplayed", "HasFocus", 
		"IsEnabled", "IsClickable", "Validate", "ListTap", "ListScroll", "ListInsert", 
		"ListSave", "ListCancel", "ListSearch", "ListDelete", "ListUpdate", "Go", 
		"COMA", "TP", "IP", "FP", "DC", "Control_name", "AnyText", "DIGIT", "Letter", 
		"Symbol", "LetterOrDigitWithWS", "LetterOrDigit", "SLD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'back'", "'menu'", "'tap'", "'longTap'", "'doubleTap'", null, 
		"'fill'", "'editDate'", "'editTime'", "'isDisplayed'", "'isCompletelyDisplayed'", 
		"'hasFocus'", "'isEnabled'", "'isClickable'", "'validate'", "'listTap'", 
		"'listScroll'", "'listInsert'", "'listSave'", "'listCancel'", "'listSearch'", 
		"'listDelete'", "'listUpdate'", "'go'", "','", "':'", "'('", "')'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "Back", "Menu", "Tap", "LongTap", "DoubleTap", "Swipe", "Fill", 
		"EditDate", "EditTime", "IsDisplayed", "IsCompletelyDisplayed", "HasFocus", 
		"IsEnabled", "IsClickable", "Validate", "ListTap", "ListScroll", "ListInsert", 
		"ListSave", "ListCancel", "ListSearch", "ListDelete", "ListUpdate", "Go", 
		"COMA", "TP", "IP", "FP", "DC", "Control_name", "AnyText", "LetterOrDigitWithWS", 
		"LetterOrDigit", "SLD"
	};
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


	public lexerUI(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lexerUI.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0183\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2Q\n\2\r\2\16\2R\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009a"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \6 \u015e\n \r \16 \u015f\3!\3!\7!\u0164\n!\f!\16!\u0167"+
		"\13!\3!\5!\u016a\n!\3\"\3\"\3#\3#\3#\3#\5#\u0172\n#\3$\3$\3%\3%\3%\5%"+
		"\u0179\n%\3&\3&\5&\u017d\n&\3\'\3\'\3\'\5\'\u0182\n\'\3\u0165\2(\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C\2E\2G\2I#K$M%\3\2\13\5\2\13\f\17\17\"\"\3\3$$\3\2\62;\6\2&&C\\aa"+
		"c|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\b\2%(,-//A"+
		"Baa\u00c1\u00c1\3\2\"\"\2\u018c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3P\3\2\2\2\5V\3\2\2\2\7[\3\2\2\2\t`"+
		"\3\2\2\2\13d\3\2\2\2\rl\3\2\2\2\17\u0099\3\2\2\2\21\u009b\3\2\2\2\23\u00a0"+
		"\3\2\2\2\25\u00a9\3\2\2\2\27\u00b2\3\2\2\2\31\u00be\3\2\2\2\33\u00d4\3"+
		"\2\2\2\35\u00dd\3\2\2\2\37\u00e7\3\2\2\2!\u00f3\3\2\2\2#\u00fc\3\2\2\2"+
		"%\u0104\3\2\2\2\'\u010f\3\2\2\2)\u011a\3\2\2\2+\u0123\3\2\2\2-\u012e\3"+
		"\2\2\2/\u0139\3\2\2\2\61\u0144\3\2\2\2\63\u014f\3\2\2\2\65\u0152\3\2\2"+
		"\2\67\u0154\3\2\2\29\u0156\3\2\2\2;\u0158\3\2\2\2=\u015a\3\2\2\2?\u015d"+
		"\3\2\2\2A\u0161\3\2\2\2C\u016b\3\2\2\2E\u0171\3\2\2\2G\u0173\3\2\2\2I"+
		"\u0178\3\2\2\2K\u017c\3\2\2\2M\u0181\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b\2\2\2U\4\3\2\2\2VW\7d\2\2WX\7c"+
		"\2\2XY\7e\2\2YZ\7m\2\2Z\6\3\2\2\2[\\\7o\2\2\\]\7g\2\2]^\7p\2\2^_\7w\2"+
		"\2_\b\3\2\2\2`a\7v\2\2ab\7c\2\2bc\7r\2\2c\n\3\2\2\2de\7n\2\2ef\7q\2\2"+
		"fg\7p\2\2gh\7i\2\2hi\7V\2\2ij\7c\2\2jk\7r\2\2k\f\3\2\2\2lm\7f\2\2mn\7"+
		"q\2\2no\7w\2\2op\7d\2\2pq\7n\2\2qr\7g\2\2rs\7V\2\2st\7c\2\2tu\7r\2\2u"+
		"\16\3\2\2\2vw\7u\2\2wx\7y\2\2xy\7k\2\2yz\7r\2\2z{\7g\2\2{|\7W\2\2|\u009a"+
		"\7r\2\2}~\7u\2\2~\177\7y\2\2\177\u0080\7k\2\2\u0080\u0081\7r\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7F\2\2\u0083\u0084\7q\2\2\u0084\u0085\7y\2\2"+
		"\u0085\u009a\7p\2\2\u0086\u0087\7u\2\2\u0087\u0088\7y\2\2\u0088\u0089"+
		"\7k\2\2\u0089\u008a\7r\2\2\u008a\u008b\7g\2\2\u008b\u008c\7N\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u008e\7h\2\2\u008e\u009a\7v\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7y\2\2\u0091\u0092\7k\2\2\u0092\u0093\7r\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7T\2\2\u0095\u0096\7k\2\2\u0096\u0097\7i\2\2\u0097"+
		"\u0098\7j\2\2\u0098\u009a\7v\2\2\u0099v\3\2\2\2\u0099}\3\2\2\2\u0099\u0086"+
		"\3\2\2\2\u0099\u008f\3\2\2\2\u009a\20\3\2\2\2\u009b\u009c\7h\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7n\2\2\u009f\22\3\2\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7v\2\2"+
		"\u00a4\u00a5\7F\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8"+
		"\7g\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac"+
		"\7k\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7o\2\2\u00b0\u00b1\7g\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\u00b5\7F\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7u\2\2"+
		"\u00b7\u00b8\7r\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7{\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7f\2\2\u00bd\30\3\2\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7E\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7o\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7g\2\2"+
		"\u00c6\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca"+
		"\7{\2\2\u00ca\u00cb\7F\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7u\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7{\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2\u00d3\7f\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7"+
		"j\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7H\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7u\2\2\u00dc"+
		"\34\3\2\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7G\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7n\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\u00e6\7f\2\2\u00e6\36\3\2\2\2\u00e7\u00e8\7"+
		"k\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7E\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec"+
		"\7k\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7m\2\2\u00ee\u00ef\7c\2\2\u00ef"+
		"\u00f0\7d\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7g\2\2\u00f2 \3\2\2\2\u00f3"+
		"\u00f4\7x\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7k\2\2"+
		"\u00f7\u00f8\7f\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb"+
		"\7g\2\2\u00fb\"\3\2\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff"+
		"\7u\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7V\2\2\u0101\u0102\7c\2\2\u0102"+
		"\u0103\7r\2\2\u0103$\3\2\2\2\u0104\u0105\7n\2\2\u0105\u0106\7k\2\2\u0106"+
		"\u0107\7u\2\2\u0107\u0108\7v\2\2\u0108\u0109\7U\2\2\u0109\u010a\7e\2\2"+
		"\u010a\u010b\7t\2\2\u010b\u010c\7q\2\2\u010c\u010d\7n\2\2\u010d\u010e"+
		"\7n\2\2\u010e&\3\2\2\2\u010f\u0110\7n\2\2\u0110\u0111\7k\2\2\u0111\u0112"+
		"\7u\2\2\u0112\u0113\7v\2\2\u0113\u0114\7K\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7u\2\2\u0116\u0117\7g\2\2\u0117\u0118\7t\2\2\u0118\u0119\7v\2\2"+
		"\u0119(\3\2\2\2\u011a\u011b\7n\2\2\u011b\u011c\7k\2\2\u011c\u011d\7u\2"+
		"\2\u011d\u011e\7v\2\2\u011e\u011f\7U\2\2\u011f\u0120\7c\2\2\u0120\u0121"+
		"\7x\2\2\u0121\u0122\7g\2\2\u0122*\3\2\2\2\u0123\u0124\7n\2\2\u0124\u0125"+
		"\7k\2\2\u0125\u0126\7u\2\2\u0126\u0127\7v\2\2\u0127\u0128\7E\2\2\u0128"+
		"\u0129\7c\2\2\u0129\u012a\7p\2\2\u012a\u012b\7e\2\2\u012b\u012c\7g\2\2"+
		"\u012c\u012d\7n\2\2\u012d,\3\2\2\2\u012e\u012f\7n\2\2\u012f\u0130\7k\2"+
		"\2\u0130\u0131\7u\2\2\u0131\u0132\7v\2\2\u0132\u0133\7U\2\2\u0133\u0134"+
		"\7g\2\2\u0134\u0135\7c\2\2\u0135\u0136\7t\2\2\u0136\u0137\7e\2\2\u0137"+
		"\u0138\7j\2\2\u0138.\3\2\2\2\u0139\u013a\7n\2\2\u013a\u013b\7k\2\2\u013b"+
		"\u013c\7u\2\2\u013c\u013d\7v\2\2\u013d\u013e\7F\2\2\u013e\u013f\7g\2\2"+
		"\u013f\u0140\7n\2\2\u0140\u0141\7g\2\2\u0141\u0142\7v\2\2\u0142\u0143"+
		"\7g\2\2\u0143\60\3\2\2\2\u0144\u0145\7n\2\2\u0145\u0146\7k\2\2\u0146\u0147"+
		"\7u\2\2\u0147\u0148\7v\2\2\u0148\u0149\7W\2\2\u0149\u014a\7r\2\2\u014a"+
		"\u014b\7f\2\2\u014b\u014c\7c\2\2\u014c\u014d\7v\2\2\u014d\u014e\7g\2\2"+
		"\u014e\62\3\2\2\2\u014f\u0150\7i\2\2\u0150\u0151\7q\2\2\u0151\64\3\2\2"+
		"\2\u0152\u0153\7.\2\2\u0153\66\3\2\2\2\u0154\u0155\7<\2\2\u01558\3\2\2"+
		"\2\u0156\u0157\7*\2\2\u0157:\3\2\2\2\u0158\u0159\7+\2\2\u0159<\3\2\2\2"+
		"\u015a\u015b\7$\2\2\u015b>\3\2\2\2\u015c\u015e\5I%\2\u015d\u015c\3\2\2"+
		"\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160@"+
		"\3\2\2\2\u0161\u0165\7$\2\2\u0162\u0164\13\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u016a\t\3\2\2\u0169\u0168\3\2\2\2\u016a"+
		"B\3\2\2\2\u016b\u016c\t\4\2\2\u016cD\3\2\2\2\u016d\u0172\t\5\2\2\u016e"+
		"\u0172\n\6\2\2\u016f\u0170\t\7\2\2\u0170\u0172\t\b\2\2\u0171\u016d\3\2"+
		"\2\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0172F\3\2\2\2\u0173\u0174"+
		"\t\t\2\2\u0174H\3\2\2\2\u0175\u0179\5E#\2\u0176\u0179\5C\"\2\u0177\u0179"+
		"\t\n\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179"+
		"J\3\2\2\2\u017a\u017d\5E#\2\u017b\u017d\5C\"\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017b\3\2\2\2\u017dL\3\2\2\2\u017e\u0182\5C\"\2\u017f\u0182\5G$\2\u0180"+
		"\u0182\5E#\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2"+
		"\2\u0182N\3\2\2\2\f\2R\u0099\u015f\u0165\u0169\u0171\u0178\u017c\u0181"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}