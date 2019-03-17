package proyecto_lexer_v01;
import static proyecto_lexer_v01.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"=" {return ASSIGN;}
"==" {return EQUALS;}
"+" {return PLUS;}
"*" {return TIMES;}
"-" {return MINUS;}
"/" {return DIV;}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
. {return ERROR;}