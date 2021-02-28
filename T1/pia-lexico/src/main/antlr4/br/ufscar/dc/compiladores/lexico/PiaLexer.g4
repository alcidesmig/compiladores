lexer grammar PiaLexer;

RESERVED
    : 'algoritmo'
    | 'fim_algoritmo'
    | 'declare'
    | 'constante'
    | 'tipo'
    | 'literal'
    | 'inteiro'
    | 'real'
    | 'logico'
    | 'verdadeiro'
    | 'falso'
    | 'registro'
    | 'fim_registro'
    | 'procedimento'
    | 'fim_procedimento'
    | 'funcao'
    | 'fim_funcao'
    | 'var'
    | 'leia'
    | 'escreva'
    | 'se'
    | 'entao'
    | 'senao'
    | 'fim_se'
    | 'caso'
    | 'seja'
    | 'fim_caso'
    | 'para'
    | 'ate'
    | 'faca'
    | 'fim_para'
    | 'retorne'
    | 'nao'
    | 'ou'
    | 'e'
    | 'enquanto'
    | 'fim_enquanto'
    ;

OPERATORS
    : ':'
    | '='
    | ','
    | '.'
    | '['
    | ']'
    | '^'
    | '('
    | ')'
    | '<-'
    | '..'
    | '+'
    | '-'
    | '*'
    | '/'
    | '%'
    | '&'
    | '<>'
    | '>='
    | '<='
    | '>'
    | '<'
    ;

WRONG_COMMENT
    : '{' ( ~( '{' | '}' ) )* '\n'
    ;

COMMENT
    : '{' ( ~( '{' | '}' | '\n' ) )* '}'
    ;

NUM_INT
    : ('0'..'9')+
    ;

NUM_REAL
    : ('0'..'9')+ '.' ('0'..'9')+
    ;

WRONG_CADEIA
    : '"' ( '\\"' | ~( '"' ) )* '\n'
    ;

CADEIA
    : '"' ( '\\"' | ~( '"' | '\n' ) )* '"'
    ;

IDENT
    : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

WHITE
    : ' '
    | '\n'
    | '\t'
    ;

WRONG_SYMBOL
    : .
    ;