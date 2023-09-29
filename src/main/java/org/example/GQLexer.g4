lexer grammar GQLexer;

STRELKA : '->';
DOT : '.';
LPARENTHESIS : '(';
RPARENTHESIS : ')';
ASTRING : [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip ;