parser grammar grammarUI;

options {
	tokenVocab=lexerUI;
}


program: 
	command* 
	EOF
;

command: 
	back 
	| tap 
	| longTap 
	| doubleTap 
	| swipe 
	| fill 
	| editDate 
	| editTime 
	| isDisplayed 
	| isCompletelyDisplayed 
	| hasFocus 
	| isEnabled 
	| isClickable 
	| validate 
	| listTap 
	| listScroll
	| listInsert
	| listSave
	| listCancel
	| listSearch
	| listDelete
	| listUpdate
	| go
;

back :
	Back
;

tap :
	Tap IP control_name FP
;

longTap:
	LongTap IP control_name FP
;
doubleTap:
	DoubleTap IP control_name FP
;

swipe:
	Swipe
;

fill:
	Fill IP control_name COMA AnyText FP
;

editDate:
	EditDate IP control_name COMA date FP
;

editTime:
	EditTime IP control_name COMA time FP
;

isCompletelyDisplayed:
	IsCompletelyDisplayed IP control_name FP
;

isDisplayed:
	IsDisplayed IP control_name FP
;

hasFocus:
	HasFocus IP control_name FP
;

isEnabled:
	IsEnabled IP control_name FP
;

isClickable:
	IsClickable IP control_name FP
;

validate:
	Validate IP control_name COMA AnyText FP
;

listTap:
	ListTap IP value FP
;

listScroll:
	ListScroll IP value FP
;

listInsert:
	ListInsert
;

listSave:
	ListSave
;

listCancel:
	ListCancel
;

listSearch:
	ListSearch IP AnyText FP
;

listDelete:
	ListDelete IP AnyText FP
;

listUpdate:
	ListUpdate IP AnyText FP
;

go:
	Go IP panel_name FP
;

date: 
	 day COMA month COMA year
;

day:
	AnyText
;

month:
	AnyText
;

year:
	AnyText
;

time: 
	hour COMA minute
;

hour:
	AnyText
;

minute:
	AnyText
;


control_name:
	AnyText
;

panel_name: 
	AnyText
;

value :
	AnyText
;

