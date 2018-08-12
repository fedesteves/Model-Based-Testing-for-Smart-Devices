// Generated from com\mtdi\ModelBasedTesting\grammarUI.g4 by ANTLR 4.7.1
package com.mtdi.ModelBasedTesting;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammarUI}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammarUIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammarUI#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(grammarUI.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(grammarUI.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#back}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack(grammarUI.BackContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#tap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTap(grammarUI.TapContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#longTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongTap(grammarUI.LongTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#doubleTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleTap(grammarUI.DoubleTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#swipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwipe(grammarUI.SwipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#fill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFill(grammarUI.FillContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#editDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditDate(grammarUI.EditDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#editTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditTime(grammarUI.EditTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#isCompletelyDisplayed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsCompletelyDisplayed(grammarUI.IsCompletelyDisplayedContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#isDisplayed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsDisplayed(grammarUI.IsDisplayedContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#hasFocus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasFocus(grammarUI.HasFocusContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#isEnabled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsEnabled(grammarUI.IsEnabledContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#isClickable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsClickable(grammarUI.IsClickableContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#validate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidate(grammarUI.ValidateContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#listTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTap(grammarUI.ListTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#listScroll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListScroll(grammarUI.ListScrollContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#listInsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInsert(grammarUI.ListInsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#listSave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSave(grammarUI.ListSaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#listCancel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCancel(grammarUI.ListCancelContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#listSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSearch(grammarUI.ListSearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#listDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDelete(grammarUI.ListDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#listUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListUpdate(grammarUI.ListUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#go}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo(grammarUI.GoContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(grammarUI.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(grammarUI.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(grammarUI.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(grammarUI.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(grammarUI.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour(grammarUI.HourContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute(grammarUI.MinuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#control_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_name(grammarUI.Control_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#panel_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPanel_name(grammarUI.Panel_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarUI#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(grammarUI.ValueContext ctx);
}