// Generated from com\mtdi\ModelBasedTesting\grammarUI.g4 by ANTLR 4.7.1
package com.mtdi.ModelBasedTesting;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarUI}.
 */
public interface grammarUIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarUI#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grammarUI.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grammarUI.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(grammarUI.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(grammarUI.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#back}.
	 * @param ctx the parse tree
	 */
	void enterBack(grammarUI.BackContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#back}.
	 * @param ctx the parse tree
	 */
	void exitBack(grammarUI.BackContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#tap}.
	 * @param ctx the parse tree
	 */
	void enterTap(grammarUI.TapContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#tap}.
	 * @param ctx the parse tree
	 */
	void exitTap(grammarUI.TapContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#longTap}.
	 * @param ctx the parse tree
	 */
	void enterLongTap(grammarUI.LongTapContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#longTap}.
	 * @param ctx the parse tree
	 */
	void exitLongTap(grammarUI.LongTapContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#doubleTap}.
	 * @param ctx the parse tree
	 */
	void enterDoubleTap(grammarUI.DoubleTapContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#doubleTap}.
	 * @param ctx the parse tree
	 */
	void exitDoubleTap(grammarUI.DoubleTapContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#swipe}.
	 * @param ctx the parse tree
	 */
	void enterSwipe(grammarUI.SwipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#swipe}.
	 * @param ctx the parse tree
	 */
	void exitSwipe(grammarUI.SwipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#fill}.
	 * @param ctx the parse tree
	 */
	void enterFill(grammarUI.FillContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#fill}.
	 * @param ctx the parse tree
	 */
	void exitFill(grammarUI.FillContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#editDate}.
	 * @param ctx the parse tree
	 */
	void enterEditDate(grammarUI.EditDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#editDate}.
	 * @param ctx the parse tree
	 */
	void exitEditDate(grammarUI.EditDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#editTime}.
	 * @param ctx the parse tree
	 */
	void enterEditTime(grammarUI.EditTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#editTime}.
	 * @param ctx the parse tree
	 */
	void exitEditTime(grammarUI.EditTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#isCompletelyDisplayed}.
	 * @param ctx the parse tree
	 */
	void enterIsCompletelyDisplayed(grammarUI.IsCompletelyDisplayedContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#isCompletelyDisplayed}.
	 * @param ctx the parse tree
	 */
	void exitIsCompletelyDisplayed(grammarUI.IsCompletelyDisplayedContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#isDisplayed}.
	 * @param ctx the parse tree
	 */
	void enterIsDisplayed(grammarUI.IsDisplayedContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#isDisplayed}.
	 * @param ctx the parse tree
	 */
	void exitIsDisplayed(grammarUI.IsDisplayedContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#hasFocus}.
	 * @param ctx the parse tree
	 */
	void enterHasFocus(grammarUI.HasFocusContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#hasFocus}.
	 * @param ctx the parse tree
	 */
	void exitHasFocus(grammarUI.HasFocusContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#isEnabled}.
	 * @param ctx the parse tree
	 */
	void enterIsEnabled(grammarUI.IsEnabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#isEnabled}.
	 * @param ctx the parse tree
	 */
	void exitIsEnabled(grammarUI.IsEnabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#isClickable}.
	 * @param ctx the parse tree
	 */
	void enterIsClickable(grammarUI.IsClickableContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#isClickable}.
	 * @param ctx the parse tree
	 */
	void exitIsClickable(grammarUI.IsClickableContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#validate}.
	 * @param ctx the parse tree
	 */
	void enterValidate(grammarUI.ValidateContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#validate}.
	 * @param ctx the parse tree
	 */
	void exitValidate(grammarUI.ValidateContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#listTap}.
	 * @param ctx the parse tree
	 */
	void enterListTap(grammarUI.ListTapContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#listTap}.
	 * @param ctx the parse tree
	 */
	void exitListTap(grammarUI.ListTapContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#listScroll}.
	 * @param ctx the parse tree
	 */
	void enterListScroll(grammarUI.ListScrollContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#listScroll}.
	 * @param ctx the parse tree
	 */
	void exitListScroll(grammarUI.ListScrollContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#listInsert}.
	 * @param ctx the parse tree
	 */
	void enterListInsert(grammarUI.ListInsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#listInsert}.
	 * @param ctx the parse tree
	 */
	void exitListInsert(grammarUI.ListInsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#listSave}.
	 * @param ctx the parse tree
	 */
	void enterListSave(grammarUI.ListSaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#listSave}.
	 * @param ctx the parse tree
	 */
	void exitListSave(grammarUI.ListSaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#listCancel}.
	 * @param ctx the parse tree
	 */
	void enterListCancel(grammarUI.ListCancelContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#listCancel}.
	 * @param ctx the parse tree
	 */
	void exitListCancel(grammarUI.ListCancelContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#listSearch}.
	 * @param ctx the parse tree
	 */
	void enterListSearch(grammarUI.ListSearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#listSearch}.
	 * @param ctx the parse tree
	 */
	void exitListSearch(grammarUI.ListSearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#listDelete}.
	 * @param ctx the parse tree
	 */
	void enterListDelete(grammarUI.ListDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#listDelete}.
	 * @param ctx the parse tree
	 */
	void exitListDelete(grammarUI.ListDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#listUpdate}.
	 * @param ctx the parse tree
	 */
	void enterListUpdate(grammarUI.ListUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#listUpdate}.
	 * @param ctx the parse tree
	 */
	void exitListUpdate(grammarUI.ListUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#go}.
	 * @param ctx the parse tree
	 */
	void enterGo(grammarUI.GoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#go}.
	 * @param ctx the parse tree
	 */
	void exitGo(grammarUI.GoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(grammarUI.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(grammarUI.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(grammarUI.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(grammarUI.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(grammarUI.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(grammarUI.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(grammarUI.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(grammarUI.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(grammarUI.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(grammarUI.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(grammarUI.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(grammarUI.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#minute}.
	 * @param ctx the parse tree
	 */
	void enterMinute(grammarUI.MinuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#minute}.
	 * @param ctx the parse tree
	 */
	void exitMinute(grammarUI.MinuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#control_name}.
	 * @param ctx the parse tree
	 */
	void enterControl_name(grammarUI.Control_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#control_name}.
	 * @param ctx the parse tree
	 */
	void exitControl_name(grammarUI.Control_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#panel_name}.
	 * @param ctx the parse tree
	 */
	void enterPanel_name(grammarUI.Panel_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#panel_name}.
	 * @param ctx the parse tree
	 */
	void exitPanel_name(grammarUI.Panel_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarUI#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(grammarUI.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarUI#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(grammarUI.ValueContext ctx);
}