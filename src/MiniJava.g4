grammar MiniJava;

goal    : mainClass ( classDeclaration )* EOF
        ;

mainClass   : 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}'
            ;

classDeclaration    : 'class' Identifier ('extends' Identifier)? '{' (varDeclaration)* (methodDeclaration)* '}'
                    ;

varDeclaration  : mtype Identifier ';'
                ;

methodDeclaration   : 'public' mtype Identifier '(' (mtype Identifier ( ',' mtype Identifier )* )? ')' '{' (varDeclaration)* (statement)* 'return' expression ';' '}'
                    ;

mtype   : 'int' '[' ']'
        | 'boolean'
        | 'int'
        | Identifier
        ;

statement   : '{' (statement)* '}'
            | 'if' '(' expression ')' statement 'else' statement
            | 'while' '(' expression ')' statement
            | 'System.out.println' '(' expression ')' ';'
            | Identifier '=' expression ';'
            | Identifier '[' expression ']' '=' expression ';'
            ;

expression  : expression ('&&' | '<' | '+' | '-' | '*') expression
            | expression '[' expression ']'
            | expression '.' 'length'
            | expression '.' Identifier '(' (expression (',' expression)* )? ')'
            | Integer
            | Boolean
            | Identifier
            | 'this'
            | 'new' 'int' '[' expression ']'
            | 'new' Identifier '(' ')'
            | '!' expression
            | '(' expression ')'
            ;

Boolean : 'true'
        | 'false'
        ;

Identifier  : [a-zA-Z_][a-zA-Z0-9_]*
            ;

Integer : [0-9]+
        ;

WS  : [ \t\r\n]+ -> skip
    ;

LineComment : '//' .*? '\n' -> skip
            ;

Comment : '/*' .*? '*/' -> skip
        ;