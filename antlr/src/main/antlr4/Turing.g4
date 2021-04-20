grammar Turing;


root_rule
    : tape_statement accept_statement (reject_statement)? state_statement* (turing_function)*
    ;

tape_statement
    : TAPE Identifier ASSIGN STRING
    ;

accept_statement
    : ACCEPT Identifier ASSIGN array
    ;

reject_statement
    : REJECT Identifier ASSIGN array
    ;

array
    : OPEN_BRACKET Identifier (COMMA Identifier)*? CLOSE_BRACKET
    ;

state_statement
    :  STATE Identifier ASSIGN state_array
    ;

state_array
    : '{' state ('|' state)* '}';

tape_move
    :R
    |L
    ;

state
    : TapeValue  transition_operator  TapeValue COMMA tape_move COMMA Identifier;

turing_function
    : TURING_FUNCTION '(' Identifier COMMA Identifier COMMA (Identifier COMMA)? array ')';

// Key words
L : 'L';
R : 'R';
TAPE : 'Tape';
ACCEPT : 'Accept';
REJECT : 'Reject';
STATE : 'State';
ASSIGN : '=';
OPEN_BRACKET : '[';
CLOSE_BRACKET : ']';
COMMA : ',';
TURING_FUNCTION : 'Turing';


STRING
	:	'"' TurringLetter* '"'
	;


// Operators
transition_operator
    :   '->'
    ;

TapeValue
    : '\'' TurringLetter '\''
    ;

Identifier
	:	TurringLetter TurringLetter*
	;

fragment
TurringLetter
    : [a-zA-Z0-9$_]
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;

WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;
