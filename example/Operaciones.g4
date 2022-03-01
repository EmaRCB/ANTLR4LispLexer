grammar Operaciones;

operacion : '('OPERACION value value')' ;
value     : operacion | number ;
number    : INT | FLOAT ;

OPERACION : ( '+' | '-' | '*' | '/' ) ;
INT       : [0-9]+ ;
FLOAT     : [0-9]+'.'[0-9]+ ;
WS 		  : [ \t\r\n] -> skip ;