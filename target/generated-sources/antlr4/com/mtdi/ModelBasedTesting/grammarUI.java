// Generated from com\mtdi\ModelBasedTesting\grammarUI.g4 by ANTLR 4.7.1
package com.mtdi.ModelBasedTesting;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarUI extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, Back=2, Menu=3, Tap=4, LongTap=5, DoubleTap=6, Swipe=7, Fill=8, 
		EditDate=9, EditTime=10, IsDisplayed=11, IsCompletelyDisplayed=12, HasFocus=13, 
		IsEnabled=14, IsClickable=15, Validate=16, ListTap=17, ListScroll=18, 
		Go=19, COMA=20, TP=21, IP=22, FP=23, DC=24, Control_name=25, AnyText=26, 
		LetterOrDigitWithWS=27, LetterOrDigit=28, SLD=29;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_back = 2, RULE_tap = 3, RULE_longTap = 4, 
		RULE_doubleTap = 5, RULE_swipe = 6, RULE_fill = 7, RULE_editDate = 8, 
		RULE_editTime = 9, RULE_isCompletelyDisplayed = 10, RULE_isDisplayed = 11, 
		RULE_hasFocus = 12, RULE_isEnabled = 13, RULE_isClickable = 14, RULE_validate = 15, 
		RULE_listTap = 16, RULE_listScroll = 17, RULE_go = 18, RULE_date = 19, 
		RULE_day = 20, RULE_month = 21, RULE_year = 22, RULE_time = 23, RULE_hour = 24, 
		RULE_minute = 25, RULE_control_name = 26, RULE_panel_name = 27, RULE_value = 28;
	public static final String[] ruleNames = {
		"program", "command", "back", "tap", "longTap", "doubleTap", "swipe", 
		"fill", "editDate", "editTime", "isCompletelyDisplayed", "isDisplayed", 
		"hasFocus", "isEnabled", "isClickable", "validate", "listTap", "listScroll", 
		"go", "date", "day", "month", "year", "time", "hour", "minute", "control_name", 
		"panel_name", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'back'", "'menu'", "'tap'", "'longTap'", "'doubleTap'", null, 
		"'fill'", "'editDate'", "'editTime'", "'isDisplayed'", "'isCompletelyDisplayed'", 
		"'hasFocus'", "'isEnabled'", "'isClickable'", "'validate'", "'listTap'", 
		"'listScroll'", "'go'", "','", "':'", "'('", "')'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "Back", "Menu", "Tap", "LongTap", "DoubleTap", "Swipe", "Fill", 
		"EditDate", "EditTime", "IsDisplayed", "IsCompletelyDisplayed", "HasFocus", 
		"IsEnabled", "IsClickable", "Validate", "ListTap", "ListScroll", "Go", 
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

	@Override
	public String getGrammarFileName() { return "grammarUI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarUI(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(grammarUI.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Back) | (1L << Tap) | (1L << LongTap) | (1L << DoubleTap) | (1L << Swipe) | (1L << Fill) | (1L << EditDate) | (1L << EditTime) | (1L << IsDisplayed) | (1L << IsCompletelyDisplayed) | (1L << HasFocus) | (1L << IsEnabled) | (1L << IsClickable) | (1L << Validate) | (1L << ListTap) | (1L << ListScroll) | (1L << Go))) != 0)) {
				{
				{
				setState(58);
				command();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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

	public static class CommandContext extends ParserRuleContext {
		public BackContext back() {
			return getRuleContext(BackContext.class,0);
		}
		public TapContext tap() {
			return getRuleContext(TapContext.class,0);
		}
		public LongTapContext longTap() {
			return getRuleContext(LongTapContext.class,0);
		}
		public DoubleTapContext doubleTap() {
			return getRuleContext(DoubleTapContext.class,0);
		}
		public SwipeContext swipe() {
			return getRuleContext(SwipeContext.class,0);
		}
		public FillContext fill() {
			return getRuleContext(FillContext.class,0);
		}
		public EditDateContext editDate() {
			return getRuleContext(EditDateContext.class,0);
		}
		public EditTimeContext editTime() {
			return getRuleContext(EditTimeContext.class,0);
		}
		public IsDisplayedContext isDisplayed() {
			return getRuleContext(IsDisplayedContext.class,0);
		}
		public IsCompletelyDisplayedContext isCompletelyDisplayed() {
			return getRuleContext(IsCompletelyDisplayedContext.class,0);
		}
		public HasFocusContext hasFocus() {
			return getRuleContext(HasFocusContext.class,0);
		}
		public IsEnabledContext isEnabled() {
			return getRuleContext(IsEnabledContext.class,0);
		}
		public IsClickableContext isClickable() {
			return getRuleContext(IsClickableContext.class,0);
		}
		public ValidateContext validate() {
			return getRuleContext(ValidateContext.class,0);
		}
		public ListTapContext listTap() {
			return getRuleContext(ListTapContext.class,0);
		}
		public ListScrollContext listScroll() {
			return getRuleContext(ListScrollContext.class,0);
		}
		public GoContext go() {
			return getRuleContext(GoContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Back:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				back();
				}
				break;
			case Tap:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				tap();
				}
				break;
			case LongTap:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				longTap();
				}
				break;
			case DoubleTap:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				doubleTap();
				}
				break;
			case Swipe:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				swipe();
				}
				break;
			case Fill:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				fill();
				}
				break;
			case EditDate:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				editDate();
				}
				break;
			case EditTime:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				editTime();
				}
				break;
			case IsDisplayed:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				isDisplayed();
				}
				break;
			case IsCompletelyDisplayed:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				isCompletelyDisplayed();
				}
				break;
			case HasFocus:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				hasFocus();
				}
				break;
			case IsEnabled:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				isEnabled();
				}
				break;
			case IsClickable:
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
				isClickable();
				}
				break;
			case Validate:
				enterOuterAlt(_localctx, 14);
				{
				setState(79);
				validate();
				}
				break;
			case ListTap:
				enterOuterAlt(_localctx, 15);
				{
				setState(80);
				listTap();
				}
				break;
			case ListScroll:
				enterOuterAlt(_localctx, 16);
				{
				setState(81);
				listScroll();
				}
				break;
			case Go:
				enterOuterAlt(_localctx, 17);
				{
				setState(82);
				go();
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

	public static class BackContext extends ParserRuleContext {
		public TerminalNode Back() { return getToken(grammarUI.Back, 0); }
		public BackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterBack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitBack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitBack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackContext back() throws RecognitionException {
		BackContext _localctx = new BackContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Back);
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

	public static class TapContext extends ParserRuleContext {
		public TerminalNode Tap() { return getToken(grammarUI.Tap, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public TapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterTap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitTap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitTap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TapContext tap() throws RecognitionException {
		TapContext _localctx = new TapContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(Tap);
			setState(88);
			match(IP);
			setState(89);
			control_name();
			setState(90);
			match(FP);
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

	public static class LongTapContext extends ParserRuleContext {
		public TerminalNode LongTap() { return getToken(grammarUI.LongTap, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public LongTapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longTap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterLongTap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitLongTap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitLongTap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongTapContext longTap() throws RecognitionException {
		LongTapContext _localctx = new LongTapContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_longTap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LongTap);
			setState(93);
			match(IP);
			setState(94);
			control_name();
			setState(95);
			match(FP);
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

	public static class DoubleTapContext extends ParserRuleContext {
		public TerminalNode DoubleTap() { return getToken(grammarUI.DoubleTap, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public DoubleTapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleTap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterDoubleTap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitDoubleTap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitDoubleTap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleTapContext doubleTap() throws RecognitionException {
		DoubleTapContext _localctx = new DoubleTapContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_doubleTap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(DoubleTap);
			setState(98);
			match(IP);
			setState(99);
			control_name();
			setState(100);
			match(FP);
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

	public static class SwipeContext extends ParserRuleContext {
		public TerminalNode Swipe() { return getToken(grammarUI.Swipe, 0); }
		public SwipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterSwipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitSwipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitSwipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwipeContext swipe() throws RecognitionException {
		SwipeContext _localctx = new SwipeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_swipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(Swipe);
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

	public static class FillContext extends ParserRuleContext {
		public TerminalNode Fill() { return getToken(grammarUI.Fill, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode COMA() { return getToken(grammarUI.COMA, 0); }
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public FillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterFill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitFill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitFill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FillContext fill() throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(Fill);
			setState(105);
			match(IP);
			setState(106);
			control_name();
			setState(107);
			match(COMA);
			setState(108);
			match(AnyText);
			setState(109);
			match(FP);
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

	public static class EditDateContext extends ParserRuleContext {
		public TerminalNode EditDate() { return getToken(grammarUI.EditDate, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode COMA() { return getToken(grammarUI.COMA, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public EditDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterEditDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitEditDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitEditDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EditDateContext editDate() throws RecognitionException {
		EditDateContext _localctx = new EditDateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_editDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(EditDate);
			setState(112);
			match(IP);
			setState(113);
			control_name();
			setState(114);
			match(COMA);
			setState(115);
			date();
			setState(116);
			match(FP);
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

	public static class EditTimeContext extends ParserRuleContext {
		public TerminalNode EditTime() { return getToken(grammarUI.EditTime, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode COMA() { return getToken(grammarUI.COMA, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public EditTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterEditTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitEditTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitEditTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EditTimeContext editTime() throws RecognitionException {
		EditTimeContext _localctx = new EditTimeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_editTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(EditTime);
			setState(119);
			match(IP);
			setState(120);
			control_name();
			setState(121);
			match(COMA);
			setState(122);
			time();
			setState(123);
			match(FP);
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

	public static class IsCompletelyDisplayedContext extends ParserRuleContext {
		public TerminalNode IsCompletelyDisplayed() { return getToken(grammarUI.IsCompletelyDisplayed, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public IsCompletelyDisplayedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isCompletelyDisplayed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterIsCompletelyDisplayed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitIsCompletelyDisplayed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitIsCompletelyDisplayed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsCompletelyDisplayedContext isCompletelyDisplayed() throws RecognitionException {
		IsCompletelyDisplayedContext _localctx = new IsCompletelyDisplayedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_isCompletelyDisplayed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IsCompletelyDisplayed);
			setState(126);
			match(IP);
			setState(127);
			control_name();
			setState(128);
			match(FP);
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

	public static class IsDisplayedContext extends ParserRuleContext {
		public TerminalNode IsDisplayed() { return getToken(grammarUI.IsDisplayed, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public IsDisplayedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isDisplayed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterIsDisplayed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitIsDisplayed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitIsDisplayed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsDisplayedContext isDisplayed() throws RecognitionException {
		IsDisplayedContext _localctx = new IsDisplayedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_isDisplayed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IsDisplayed);
			setState(131);
			match(IP);
			setState(132);
			control_name();
			setState(133);
			match(FP);
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

	public static class HasFocusContext extends ParserRuleContext {
		public TerminalNode HasFocus() { return getToken(grammarUI.HasFocus, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public HasFocusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasFocus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterHasFocus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitHasFocus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitHasFocus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasFocusContext hasFocus() throws RecognitionException {
		HasFocusContext _localctx = new HasFocusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hasFocus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(HasFocus);
			setState(136);
			match(IP);
			setState(137);
			control_name();
			setState(138);
			match(FP);
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

	public static class IsEnabledContext extends ParserRuleContext {
		public TerminalNode IsEnabled() { return getToken(grammarUI.IsEnabled, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public IsEnabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isEnabled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterIsEnabled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitIsEnabled(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitIsEnabled(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsEnabledContext isEnabled() throws RecognitionException {
		IsEnabledContext _localctx = new IsEnabledContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_isEnabled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IsEnabled);
			setState(141);
			match(IP);
			setState(142);
			control_name();
			setState(143);
			match(FP);
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

	public static class IsClickableContext extends ParserRuleContext {
		public TerminalNode IsClickable() { return getToken(grammarUI.IsClickable, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public IsClickableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isClickable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterIsClickable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitIsClickable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitIsClickable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsClickableContext isClickable() throws RecognitionException {
		IsClickableContext _localctx = new IsClickableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_isClickable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IsClickable);
			setState(146);
			match(IP);
			setState(147);
			control_name();
			setState(148);
			match(FP);
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

	public static class ValidateContext extends ParserRuleContext {
		public TerminalNode Validate() { return getToken(grammarUI.Validate, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode COMA() { return getToken(grammarUI.COMA, 0); }
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public ValidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterValidate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitValidate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitValidate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidateContext validate() throws RecognitionException {
		ValidateContext _localctx = new ValidateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_validate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(Validate);
			setState(151);
			match(IP);
			setState(152);
			control_name();
			setState(153);
			match(COMA);
			setState(154);
			match(AnyText);
			setState(155);
			match(FP);
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

	public static class ListTapContext extends ParserRuleContext {
		public TerminalNode ListTap() { return getToken(grammarUI.ListTap, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode COMA() { return getToken(grammarUI.COMA, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public ListTapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterListTap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitListTap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitListTap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTapContext listTap() throws RecognitionException {
		ListTapContext _localctx = new ListTapContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listTap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ListTap);
			setState(158);
			match(IP);
			setState(159);
			control_name();
			setState(160);
			match(COMA);
			setState(161);
			value();
			setState(162);
			match(FP);
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

	public static class ListScrollContext extends ParserRuleContext {
		public TerminalNode ListScroll() { return getToken(grammarUI.ListScroll, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Control_nameContext control_name() {
			return getRuleContext(Control_nameContext.class,0);
		}
		public TerminalNode COMA() { return getToken(grammarUI.COMA, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public ListScrollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listScroll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterListScroll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitListScroll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitListScroll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListScrollContext listScroll() throws RecognitionException {
		ListScrollContext _localctx = new ListScrollContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listScroll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ListScroll);
			setState(165);
			match(IP);
			setState(166);
			control_name();
			setState(167);
			match(COMA);
			setState(168);
			value();
			setState(169);
			match(FP);
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

	public static class GoContext extends ParserRuleContext {
		public TerminalNode Go() { return getToken(grammarUI.Go, 0); }
		public TerminalNode IP() { return getToken(grammarUI.IP, 0); }
		public Panel_nameContext panel_name() {
			return getRuleContext(Panel_nameContext.class,0);
		}
		public TerminalNode FP() { return getToken(grammarUI.FP, 0); }
		public GoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_go; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterGo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitGo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitGo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoContext go() throws RecognitionException {
		GoContext _localctx = new GoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_go);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Go);
			setState(172);
			match(IP);
			setState(173);
			panel_name();
			setState(174);
			match(FP);
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

	public static class DateContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(grammarUI.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(grammarUI.COMA, i);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			day();
			setState(177);
			match(COMA);
			setState(178);
			month();
			setState(179);
			match(COMA);
			setState(180);
			year();
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

	public static class DayContext extends ParserRuleContext {
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(AnyText);
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

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(AnyText);
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

	public static class YearContext extends ParserRuleContext {
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(AnyText);
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

	public static class TimeContext extends ParserRuleContext {
		public HourContext hour() {
			return getRuleContext(HourContext.class,0);
		}
		public TerminalNode COMA() { return getToken(grammarUI.COMA, 0); }
		public MinuteContext minute() {
			return getRuleContext(MinuteContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			hour();
			setState(189);
			match(COMA);
			setState(190);
			minute();
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

	public static class HourContext extends ParserRuleContext {
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public HourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitHour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitHour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(AnyText);
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

	public static class MinuteContext extends ParserRuleContext {
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public MinuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterMinute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitMinute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitMinute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteContext minute() throws RecognitionException {
		MinuteContext _localctx = new MinuteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(AnyText);
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

	public static class Control_nameContext extends ParserRuleContext {
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public Control_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterControl_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitControl_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitControl_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_nameContext control_name() throws RecognitionException {
		Control_nameContext _localctx = new Control_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_control_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(AnyText);
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

	public static class Panel_nameContext extends ParserRuleContext {
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public Panel_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_panel_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterPanel_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitPanel_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitPanel_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Panel_nameContext panel_name() throws RecognitionException {
		Panel_nameContext _localctx = new Panel_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_panel_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(AnyText);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode AnyText() { return getToken(grammarUI.AnyText, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarUIListener ) ((grammarUIListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarUIVisitor ) return ((grammarUIVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(AnyText);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:\2\2\2\u00c0\2?\3\2\2\2\4U\3\2\2\2\6W\3\2\2\2\bY\3\2\2\2\n"+
		"^\3\2\2\2\fc\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22q\3\2\2\2\24x\3\2\2\2\26"+
		"\177\3\2\2\2\30\u0084\3\2\2\2\32\u0089\3\2\2\2\34\u008e\3\2\2\2\36\u0093"+
		"\3\2\2\2 \u0098\3\2\2\2\"\u009f\3\2\2\2$\u00a6\3\2\2\2&\u00ad\3\2\2\2"+
		"(\u00b2\3\2\2\2*\u00b8\3\2\2\2,\u00ba\3\2\2\2.\u00bc\3\2\2\2\60\u00be"+
		"\3\2\2\2\62\u00c2\3\2\2\2\64\u00c4\3\2\2\2\66\u00c6\3\2\2\28\u00c8\3\2"+
		"\2\2:\u00ca\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DV\5\6\4\2EV\5\b\5\2FV\5\n\6"+
		"\2GV\5\f\7\2HV\5\16\b\2IV\5\20\t\2JV\5\22\n\2KV\5\24\13\2LV\5\30\r\2M"+
		"V\5\26\f\2NV\5\32\16\2OV\5\34\17\2PV\5\36\20\2QV\5 \21\2RV\5\"\22\2SV"+
		"\5$\23\2TV\5&\24\2UD\3\2\2\2UE\3\2\2\2UF\3\2\2\2UG\3\2\2\2UH\3\2\2\2U"+
		"I\3\2\2\2UJ\3\2\2\2UK\3\2\2\2UL\3\2\2\2UM\3\2\2\2UN\3\2\2\2UO\3\2\2\2"+
		"UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\5\3\2\2\2WX\7\4\2"+
		"\2X\7\3\2\2\2YZ\7\6\2\2Z[\7\30\2\2[\\\5\66\34\2\\]\7\31\2\2]\t\3\2\2\2"+
		"^_\7\7\2\2_`\7\30\2\2`a\5\66\34\2ab\7\31\2\2b\13\3\2\2\2cd\7\b\2\2de\7"+
		"\30\2\2ef\5\66\34\2fg\7\31\2\2g\r\3\2\2\2hi\7\t\2\2i\17\3\2\2\2jk\7\n"+
		"\2\2kl\7\30\2\2lm\5\66\34\2mn\7\26\2\2no\7\34\2\2op\7\31\2\2p\21\3\2\2"+
		"\2qr\7\13\2\2rs\7\30\2\2st\5\66\34\2tu\7\26\2\2uv\5(\25\2vw\7\31\2\2w"+
		"\23\3\2\2\2xy\7\f\2\2yz\7\30\2\2z{\5\66\34\2{|\7\26\2\2|}\5\60\31\2}~"+
		"\7\31\2\2~\25\3\2\2\2\177\u0080\7\16\2\2\u0080\u0081\7\30\2\2\u0081\u0082"+
		"\5\66\34\2\u0082\u0083\7\31\2\2\u0083\27\3\2\2\2\u0084\u0085\7\r\2\2\u0085"+
		"\u0086\7\30\2\2\u0086\u0087\5\66\34\2\u0087\u0088\7\31\2\2\u0088\31\3"+
		"\2\2\2\u0089\u008a\7\17\2\2\u008a\u008b\7\30\2\2\u008b\u008c\5\66\34\2"+
		"\u008c\u008d\7\31\2\2\u008d\33\3\2\2\2\u008e\u008f\7\20\2\2\u008f\u0090"+
		"\7\30\2\2\u0090\u0091\5\66\34\2\u0091\u0092\7\31\2\2\u0092\35\3\2\2\2"+
		"\u0093\u0094\7\21\2\2\u0094\u0095\7\30\2\2\u0095\u0096\5\66\34\2\u0096"+
		"\u0097\7\31\2\2\u0097\37\3\2\2\2\u0098\u0099\7\22\2\2\u0099\u009a\7\30"+
		"\2\2\u009a\u009b\5\66\34\2\u009b\u009c\7\26\2\2\u009c\u009d\7\34\2\2\u009d"+
		"\u009e\7\31\2\2\u009e!\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a1\7\30\2"+
		"\2\u00a1\u00a2\5\66\34\2\u00a2\u00a3\7\26\2\2\u00a3\u00a4\5:\36\2\u00a4"+
		"\u00a5\7\31\2\2\u00a5#\3\2\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00a8\7\30\2"+
		"\2\u00a8\u00a9\5\66\34\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\5:\36\2\u00ab"+
		"\u00ac\7\31\2\2\u00ac%\3\2\2\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\7\30\2"+
		"\2\u00af\u00b0\58\35\2\u00b0\u00b1\7\31\2\2\u00b1\'\3\2\2\2\u00b2\u00b3"+
		"\5*\26\2\u00b3\u00b4\7\26\2\2\u00b4\u00b5\5,\27\2\u00b5\u00b6\7\26\2\2"+
		"\u00b6\u00b7\5.\30\2\u00b7)\3\2\2\2\u00b8\u00b9\7\34\2\2\u00b9+\3\2\2"+
		"\2\u00ba\u00bb\7\34\2\2\u00bb-\3\2\2\2\u00bc\u00bd\7\34\2\2\u00bd/\3\2"+
		"\2\2\u00be\u00bf\5\62\32\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\5\64\33\2"+
		"\u00c1\61\3\2\2\2\u00c2\u00c3\7\34\2\2\u00c3\63\3\2\2\2\u00c4\u00c5\7"+
		"\34\2\2\u00c5\65\3\2\2\2\u00c6\u00c7\7\34\2\2\u00c7\67\3\2\2\2\u00c8\u00c9"+
		"\7\34\2\2\u00c99\3\2\2\2\u00ca\u00cb\7\34\2\2\u00cb;\3\2\2\2\4?U";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}