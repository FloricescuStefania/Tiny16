grammar CTiny;

INT      : 'int' ;
CHAR     : 'char' ;
IF       : 'if' ;
ELSE     : 'else' ;
WHILE    : 'while' ;
RETURN   : 'return' ;
READ     : 'read' ;
WRITE    : 'write' ;
LENGTH   : 'length' ;

PLUS     : '+' ;
MINUS    : '-' ;
TIMES    : '*' ;
DIVIDE   : '/' ;

EQUAL    : '==' ;
NEQUAL   : '!=' ;
ASSIGN   : '=' ;
LESS     : '<' ;
GREATER  : '>' ;
NOT      : '!' ;

LPAR     : '(' ;
RPAR     : ')' ;
LBRACE   : '{' ;
RBRACE   : '}' ;
LBRACK   : '[' ;
RBRACK   : ']' ;
SEMICOLON: ';' ;
COMMA    : ',' ;

NAME     : [a-zA-Z] [a-zA-Z0-9_]* ;
NUMBER   : [0-9]+ ;
QCHAR    : '\'' ( '\\' [ntr'\\"] | ~['\\\r\n] ) '\'' ;
COMMENT  : '//' ~[\r\n]* -> skip ;
WS       : [ \t\r\n]+ -> skip ;
LEX_ERROR : . ;