// Generated from lexerUI.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, Back=2, Menu=3, Tap=4, LongTap=5, DoubleTap=6, Swipe=7, Fill=8, 
		EditDate=9, EditTime=10, IsDisplayed=11, IsCompletelyDisplayed=12, HasFocus=13, 
		IsEnabled=14, IsClickable=15, Validate=16, ListTap=17, ListScroll=18, 
		Go=19, COMA=20, TP=21, IP=22, FP=23, DC=24, Control_name=25, AnyText=26, 
		LetterOrDigitWithWS=27, LetterOrDigit=28, SLD=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"WS", "Back", "Menu", "Tap", "LongTap", "DoubleTap", "Swipe", "Fill", 
		"EditDate", "EditTime", "IsDisplayed", "IsCompletelyDisplayed", "HasFocus", 
		"IsEnabled", "IsClickable", "Validate", "ListTap", "ListScroll", "Go", 
		"COMA", "TP", "IP", "FP", "DC", "Control_name", "AnyText", "DIGIT", "Letter", 
		"Symbol", "LetterOrDigitWithWS", "LetterOrDigit", "SLD"
	};


	public lexerUI(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lexerUI.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u0137\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\6\2E\n\2\r\2\16\2F\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\6\32\u0112\n\32\r\32\16\32\u0113\3\33\3\33\7\33\u0118\n\33"+
		"\f\33\16\33\u011b\13\33\3\33\5\33\u011e\n\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\5\35\u0126\n\35\3\36\3\36\3\37\3\37\3\37\5\37\u012d\n\37\3 \3 \5"+
		" \u0131\n \3!\3!\3!\5!\u0136\n!\3\u0119\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\29\2;\2=\35?\36A\37\3\2\13\5\2\13\f\17"+
		"\17\"\"\3\3$$\3\2\62;\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01"+
		"\3\2\udc02\ue001\b\2%(,-//ABaa\u00c1\u00c1\3\2\"\"\u0140\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3D\3\2\2\2"+
		"\5J\3\2\2\2\7O\3\2\2\2\tT\3\2\2\2\13X\3\2\2\2\r`\3\2\2\2\17\u008d\3\2"+
		"\2\2\21\u008f\3\2\2\2\23\u0094\3\2\2\2\25\u009d\3\2\2\2\27\u00a6\3\2\2"+
		"\2\31\u00b2\3\2\2\2\33\u00c8\3\2\2\2\35\u00d1\3\2\2\2\37\u00db\3\2\2\2"+
		"!\u00e7\3\2\2\2#\u00f0\3\2\2\2%\u00f8\3\2\2\2\'\u0103\3\2\2\2)\u0106\3"+
		"\2\2\2+\u0108\3\2\2\2-\u010a\3\2\2\2/\u010c\3\2\2\2\61\u010e\3\2\2\2\63"+
		"\u0111\3\2\2\2\65\u0115\3\2\2\2\67\u011f\3\2\2\29\u0125\3\2\2\2;\u0127"+
		"\3\2\2\2=\u012c\3\2\2\2?\u0130\3\2\2\2A\u0135\3\2\2\2CE\t\2\2\2DC\3\2"+
		"\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\2\2\2I\4\3\2\2\2JK\7"+
		"d\2\2KL\7c\2\2LM\7e\2\2MN\7m\2\2N\6\3\2\2\2OP\7o\2\2PQ\7g\2\2QR\7p\2\2"+
		"RS\7w\2\2S\b\3\2\2\2TU\7v\2\2UV\7c\2\2VW\7r\2\2W\n\3\2\2\2XY\7n\2\2YZ"+
		"\7q\2\2Z[\7p\2\2[\\\7i\2\2\\]\7V\2\2]^\7c\2\2^_\7r\2\2_\f\3\2\2\2`a\7"+
		"f\2\2ab\7q\2\2bc\7w\2\2cd\7d\2\2de\7n\2\2ef\7g\2\2fg\7V\2\2gh\7c\2\2h"+
		"i\7r\2\2i\16\3\2\2\2jk\7u\2\2kl\7y\2\2lm\7k\2\2mn\7r\2\2no\7g\2\2op\7"+
		"W\2\2p\u008e\7r\2\2qr\7u\2\2rs\7y\2\2st\7k\2\2tu\7r\2\2uv\7g\2\2vw\7F"+
		"\2\2wx\7q\2\2xy\7y\2\2y\u008e\7p\2\2z{\7u\2\2{|\7y\2\2|}\7k\2\2}~\7r\2"+
		"\2~\177\7g\2\2\177\u0080\7N\2\2\u0080\u0081\7g\2\2\u0081\u0082\7h\2\2"+
		"\u0082\u008e\7v\2\2\u0083\u0084\7u\2\2\u0084\u0085\7y\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7r\2\2\u0087\u0088\7g\2\2\u0088\u0089\7T\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7i\2\2\u008b\u008c\7j\2\2\u008c\u008e\7v\2\2"+
		"\u008dj\3\2\2\2\u008dq\3\2\2\2\u008dz\3\2\2\2\u008d\u0083\3\2\2\2\u008e"+
		"\20\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7k\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7n\2\2\u0093\22\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7f\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7v\2\2\u0098\u0099\7F\2\2\u0099\u009a\7c\2\2"+
		"\u009a\u009b\7v\2\2\u009b\u009c\7g\2\2\u009c\24\3\2\2\2\u009d\u009e\7"+
		"g\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2"+
		"\7V\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\26\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7F\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7n\2\2"+
		"\u00ad\u00ae\7c\2\2\u00ae\u00af\7{\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1"+
		"\7f\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5"+
		"\7E\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7r\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7g\2\2"+
		"\u00bc\u00bd\7n\2\2\u00bd\u00be\7{\2\2\u00be\u00bf\7F\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7{\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7f\2\2"+
		"\u00c7\32\3\2\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7"+
		"u\2\2\u00cb\u00cc\7H\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7w\2\2\u00cf\u00d0\7u\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3\u00d4\7G\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7d\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7f\2\2"+
		"\u00da\36\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7"+
		"E\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2"+
		"\7m\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7d\2\2\u00e4\u00e5\7n\2\2\u00e5"+
		"\u00e6\7g\2\2\u00e6 \3\2\2\2\u00e7\u00e8\7x\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7n\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7c\2\2"+
		"\u00ed\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef\"\3\2\2\2\u00f0\u00f1\7n"+
		"\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5"+
		"\7V\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7r\2\2\u00f7$\3\2\2\2\u00f8\u00f9"+
		"\7n\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		"\u00fd\7U\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7q\2\2"+
		"\u0100\u0101\7n\2\2\u0101\u0102\7n\2\2\u0102&\3\2\2\2\u0103\u0104\7i\2"+
		"\2\u0104\u0105\7q\2\2\u0105(\3\2\2\2\u0106\u0107\7.\2\2\u0107*\3\2\2\2"+
		"\u0108\u0109\7<\2\2\u0109,\3\2\2\2\u010a\u010b\7*\2\2\u010b.\3\2\2\2\u010c"+
		"\u010d\7+\2\2\u010d\60\3\2\2\2\u010e\u010f\7$\2\2\u010f\62\3\2\2\2\u0110"+
		"\u0112\5=\37\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\64\3\2\2\2\u0115\u0119\7$\2\2\u0116\u0118"+
		"\13\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011a\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e"+
		"\t\3\2\2\u011d\u011c\3\2\2\2\u011e\66\3\2\2\2\u011f\u0120\t\4\2\2\u0120"+
		"8\3\2\2\2\u0121\u0126\t\5\2\2\u0122\u0126\n\6\2\2\u0123\u0124\t\7\2\2"+
		"\u0124\u0126\t\b\2\2\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0126:\3\2\2\2\u0127\u0128\t\t\2\2\u0128<\3\2\2\2\u0129\u012d"+
		"\59\35\2\u012a\u012d\5\67\34\2\u012b\u012d\t\n\2\2\u012c\u0129\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d>\3\2\2\2\u012e\u0131\5"+
		"9\35\2\u012f\u0131\5\67\34\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"@\3\2\2\2\u0132\u0136\5\67\34\2\u0133\u0136\5;\36\2\u0134\u0136\59\35"+
		"\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136B"+
		"\3\2\2\2\f\2F\u008d\u0113\u0119\u011d\u0125\u012c\u0130\u0135\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}