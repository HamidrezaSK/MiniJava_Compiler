grammar minijava;

goal    : mainClass (class Declaration)* EOF
        ;

mainClass   : 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identitier ')' '{' Statement '}' '}'
            ;

classDeclaration    : 'class' Identifier ('extends' Identifier)? '{' (varDeclaration)* (methodDeclaration)* '}'
                    ;

varDeclaration  : type Identifier ';'
                ;

methodDeclaration   : 'public' type Identifier '(' (type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( Statement )* 'return' Expression ';' '}'
                    ;

type    : 'int' '[' ']'
        | 'boolean'
        | 'int'
        | Identifier
        ;

Statement   : '{' (Statement )* '}'
            | 'if' '(' Expression ')' Statement 'else' Statement
            | 'while' '(' Expression ')' Expression ')' ';'
            | 'System.out.println' '(' Expression ')' ';'
            | Identifier '=' Expression ';'
            | Identifier '[' Expression ']' '=' Expression ';'
            ;

Expression  : Expression ('&&' | '<' | '+' | '-' | '*') Expression
            | Expression '[' Expression ']'
            | Expression '.' 'length'
            | Expression '.' Identifier '(' ( Expression ( ',' Expression )* ) ? ')'
            | Interger
            | Boolean
            | Identifier
            | 'this'
            | 'new' 'int' '[' Expression ']'
            | 'new' Identifier '(' ')'
            | '!' Expression
            | '(' Expression ')'
            ;

Boolean : 'true'
        | 'false'
        ;

Identifier  : [a-zA-Z0-9]*
            ;

Interger    : [0-9]+
                    ;

WS  : [\t\r\n ]+ -> skip
    ;

