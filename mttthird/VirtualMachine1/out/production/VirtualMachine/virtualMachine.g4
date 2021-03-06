grammar virtualMachine;

start : class_ ;

class_ : MODIFICATOR* CLASS NAME section ;
section : LCB ENTER (param ENTER)* RCB ;
param : class_ | main | math | while_ | for_ | if_ | assign | inc | dec;
main : MODIFICATOR* RETURN_TYPE MAIN LB ARGS RB section ;
for_ : FOR LB assign logic inc RB section ;
while_ : WHILE LB logic RB whilesection ;
if_ : IF LB logic RB thensection (ELSE elsesection)? ;
thensection : LCB ENTER (param ENTER)* RCB ;
whilesection : LCB ENTER (param ENTER)* RCB ;
elsesection : LCB ENTER (param ENTER)* RCB ;
assign : (TYPE VAR | TYPE VAR ASSIGN math | VAR ASSIGN math) SC? ;
math : math (PLUS | MINUS) math  | term ;
term : num | LB math RB | term ARITHM1 num ;
logic : bool CMP bool ;
num : DIGIT | MINUS? VAR | MINUS? LB math RB ;
bool : DIGIT | (UNOT | MINUS)? VAR /*UNOT? LB or_ RB*/ ;
inc :  num INC SC? ;
dec : num DEC SC? ;


SC: ';' ;
ENTER : '\n'+ ;
CLASS : 'class' ;
MAIN : 'main' ;
ARGS : 'String[] args' ;
NAME : [A-Z][a-zA-Z]* ;
MODIFICATOR : 'public' | 'static' ;
LCB : '{' ;
RCB : '}' ;
LB : '(' ;
RB : ')' ;
TYPE: 'boolean'| 'int' ;
RETURN_TYPE : 'void' | 'int' ;
FOR : 'for' ;
WHILE : 'while' ;
IF : 'if' ;
ELSE : 'else' ;
DIGIT : '-'?[0-9]+ ;
VAR : [a-zA-Z_][a-zA-Z0-9_]* ;
ASSIGN : '=' | '+=' | '-=' | '*=' | '/=' | '%=' ;
PLUS : '+' ;
MINUS : '-' ;
ARITHM1 : '*' | '/' | '%' ;
CMP : '<' | '>' | '<=' | '>=' | '==' | '!=' ;
AND : '&&' ;
OR : '||' ;
UNOT : '!' ;
TRUE : 'true' ;
FALSE : 'false' ;
INC : '++' ;
DEC : '--' ;
WS : [ \t\r\n] -> skip ;