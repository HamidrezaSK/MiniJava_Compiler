grammar MiniJava;

goal    : mainClass ( classDeclaration )* EOF
        ;

mainClass   : 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}'
            #mainclass
            ;

classDeclaration    : 'class' Identifier ('extends' Identifier)? '{' (varDeclaration)* (methodDeclaration)* '}'
                    #dec_class
                    ;

varDeclaration  : mtype Identifier ';'
                #dec_var
                ;

methodDeclaration   : 'public' mtype Identifier '(' (mtype Identifier ( ',' mtype Identifier )* )? ')' '{' (varDeclaration)* (statement)* 'return' expression ';' '}'
                    #dec_method
                    ;

mtype   : 'int' '[' ']'
        | 'boolean'
        | 'int'
        | Identifier
        ;

statement   : '{' (statement)* '}'
                #state_lrparents
            | 'if' '(' expression ')' statement 'else' statement
                #state_if
            | 'while' '(' expression ')' statement
                #state_while
            | 'System.out.println' '(' expression ')' ';'
                #state_print
            | Identifier '=' expression ';'
                #state_def
            | Identifier '[' expression ']' '=' expression ';'
                #state_array_def
            ;

expression  : expression ('&&' | '<' | '+' | '-' | '*') expression
                #expr_op
            | expression '[' expression ']'
                #expr_array
            | expression '.' 'length'
                #expr_length
            | expression '.' Identifier '(' (expression (',' expression)* )? ')'
                #expr_method_calling
            | Integer
                #expr_int
            | Boolean
                #expr_bool
            | Identifier
                #expr_id
            | 'this'
                #expr_this
            | 'new' 'int' '[' expression ']'
                #expr_int_array
            | 'new' Identifier '(' ')'
                #expr_new_array
            | '!' expression
                #expr_not
            | '(' expression ')'
                #expr_lrparents
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

LineComment : '//' .*? ('\r')? '\n' -> skip
            ;

Comment : '/*' .*? '*/' -> skip
        ;