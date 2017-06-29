package fr.ensimag.deca.intellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static fr.ensimag.deca.intellijplugin.psi.DecaTypes.*;

%%

%{
  public DecaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class DecaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT_LINE="//"[^\r\n]*
COMMENT="/"\*(.|\n)*\*"/"
INT=[0-9]+
FLOAT=[0-9]+\.?[0-9]*(F|f)?
STRING=\"(\\.|[^\"])*\"
TIDENT=[a-zA-Z$_][a-zA-Z0-9$_]*
TMULTI_LINE_STRING=\"(\\.|[^\"])*\"

%%
<YYINITIAL> {
  {WHITE_SPACE}             { return WHITE_SPACE; }

  "{"                       { return OBRACE; }
  "}"                       { return CBRACE; }
  ";"                       { return SEMI; }
  ","                       { return COMMA; }
  "="                       { return EQUALS; }
  "return"                  { return RETURN; }
  "print"                   { return PRINT; }
  "println"                 { return PRINTLN; }
  "printx"                  { return PRINTX; }
  "printlnx"                { return PRINTLNX; }
  "("                       { return OPARENT; }
  ")"                       { return CPARENT; }
  "while"                   { return WHILE; }
  "if"                      { return IF; }
  "else"                    { return ELSE; }
  "||"                      { return OR; }
  "&&"                      { return AND; }
  "=="                      { return EQEQ; }
  "!="                      { return NEQ; }
  "<="                      { return LEQ; }
  ">="                      { return GEQ; }
  ">"                       { return GT; }
  "<"                       { return LT; }
  "instanceof"              { return INSTANCEOF; }
  "+"                       { return PLUS; }
  "-"                       { return MINUS; }
  "*"                       { return TIMES; }
  "/"                       { return SLASH; }
  "%"                       { return PERCENT; }
  "!"                       { return EXCLAM; }
  "."                       { return DOT; }
  "readInt"                 { return READINT; }
  "readFloat"               { return READFLOAT; }
  "new"                     { return NEW; }
  "true"                    { return TRUE; }
  "false"                   { return FALSE; }
  "this"                    { return THIS; }
  "null"                    { return NULL; }
  "class"                   { return CLASS; }
  "extends"                 { return EXTENDS; }
  "protected"               { return PROTECTED; }
  ""                        { return END_OF_LINE_COMMENT; }
  "asm"                     { return ASM; }

  {COMMENT_LINE}            { return COMMENT_LINE; }
  {COMMENT}                 { return COMMENT; }
  {INT}                     { return INT; }
  {FLOAT}                   { return FLOAT; }
  {STRING}                  { return STRING; }
  {TIDENT}                  { return TIDENT; }
  {TMULTI_LINE_STRING}      { return TMULTI_LINE_STRING; }

}

[^] { return BAD_CHARACTER; }
