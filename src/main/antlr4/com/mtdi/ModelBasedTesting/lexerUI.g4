lexer grammar lexerUI;

//----Whitespace----//
WS: [ \t\r\n]+ -> skip;
//-----------------//

   
//--------Commands---------------//

Back :
	'back'
;

Menu :
	'menu'
;

Tap: 
	'tap' 
;

LongTap: 
	'longTap' 
;

DoubleTap: 
	'doubleTap' 
;

Swipe:
	'swipeUp' | 'swipeDown' | 'swipeLeft' | 'swipeRight'
;

Fill:
	'fill'
;

EditDate:
	'editDate'
;

EditTime:
	'editTime'
;

IsDisplayed:
	'isDisplayed'
;

IsCompletelyDisplayed:
	'isCompletelyDisplayed'
;
HasFocus:
	'hasFocus'
;

IsEnabled:
	'isEnabled'
;

IsClickable:
	'isClickable'
;

Validate:
	'validate'
;

ListTap:
	'listTap'
;

ListScroll:
	'listScroll'
;

Go: 
	'go'
;	




//-------------------------------/
COMA: ',';
TP: ':';
IP: '(';
FP: ')';
DC: '"';

Control_name: 
	LetterOrDigitWithWS+
;

AnyText: 
	'"' .*? ('"' | EOF)
;




fragment DIGIT: 
	[0-9]
;
     
fragment Letter
    : [a-zA-Z$_]
    | ~[\u0000-\u007F\uD800-\uDBFF]
    | [\uD800-\uDBFF] [\uDC00-\uDFFF]
;
    
fragment Symbol
	: [-+*@_?¿%&$#]
;

LetterOrDigitWithWS
    : Letter
    | DIGIT
    | [ ]
;

LetterOrDigit
    : Letter
    | DIGIT
;
    
SLD
	: DIGIT
	| Symbol
	| Letter
;

