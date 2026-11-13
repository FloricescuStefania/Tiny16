grammar CTiny;


program
    : declaration+ EOF
    ;

declaration
    : funDeclaration
    | varDeclaration
    ;

funDeclaration
    : type NAME LPAR formalPars RPAR block
    ;

formalPars
    : (formalPar (COMMA formalPar)*)?
    ;

formalPar
    : type NAME
    ;

block
    : LBRACE varDeclaration* statements RBRACE
    ;

varDeclaration
    : type NAME SEMICOLON
    ;

type
    : INT                       # IntType
    | CHAR                      # CharType
    | type LBRACK exp RBRACK    # ArrayType
    ;

statements
    : (statement (SEMICOLON statement)*)?
    ;

statement
    : IF LPAR exp RPAR statement (ELSE statement)?   # IfStmt
    | WHILE LPAR exp RPAR statement                  # WhileStmt
    | lexp ASSIGN exp                                # AssignStmt
    | RETURN exp                                     # ReturnStmt
    | NAME LPAR pars RPAR                            # CallStmt
    | block                                          # BlockStmt
    | WRITE exp                                      # WriteStmt
    | READ lexp                                      # ReadStmt
    ;

lexp
    : lexp LBRACK exp RBRACK    # ArrayAccess
    | NAME                      # VarAccess
    ;

exp
    : lexp                              # LexpExp
    | NUMBER                            # NumberExp
    | QCHAR                             # CharExp
    | NAME LPAR pars RPAR               # CallExp
    | LENGTH lexp                       # LengthExp
    | LPAR exp RPAR                     # ParenExp
    | op=(MINUS | NOT) exp              # UnaryExp
    | exp op=(TIMES | DIVIDE) exp       # MulExp
    | exp op=(PLUS | MINUS) exp         # AddExp
    | exp op=(LESS | GREATER) exp       # RelExp
    | exp op=(EQUAL | NEQUAL) exp       # EqExp
    ;

pars
    : (exp (COMMA exp)*)?
    ;

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