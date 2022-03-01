grammar Operaciones;

start : operacion ;
operacion : '('OPERADOR valor valor')' ;
valor     : operacion | num ;
num    : INT | FLOAT ;

OPERADOR : ( '+' | '-' | '*' | '/' ) ;
INT       : Id+ ;
FLOAT     : Id+ DOT Id+ ;
DOT       : '.';
Id        : [0-9];
NL 		  : [ \t\r\n] -> skip ;