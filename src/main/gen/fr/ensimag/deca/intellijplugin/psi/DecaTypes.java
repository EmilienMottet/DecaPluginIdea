// This is a generated file. Not intended for manual editing.
package fr.ensimag.deca.intellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import fr.ensimag.deca.intellijplugin.psi.impl.*;

public interface DecaTypes {

  IElementType AND_EXPR = new DecaElementType("AND_EXPR");
  IElementType BLOCK = new DecaElementType("BLOCK");
  IElementType CLASS_BODY = new DecaElementType("CLASS_BODY");
  IElementType CLASS_DECL = new DecaElementType("CLASS_DECL");
  IElementType CLASS_EXTENSION = new DecaElementType("CLASS_EXTENSION");
  IElementType DECL_FIELD = new DecaElementType("DECL_FIELD");
  IElementType DECL_FIELD_SET = new DecaElementType("DECL_FIELD_SET");
  IElementType DECL_METHOD = new DecaElementType("DECL_METHOD");
  IElementType DECL_VAR = new DecaElementType("DECL_VAR");
  IElementType DECL_VAR_SET = new DecaElementType("DECL_VAR_SET");
  IElementType EQ_NEQ_EXPR = new DecaElementType("EQ_NEQ_EXPR");
  IElementType EXPR = new DecaElementType("EXPR");
  IElementType IDENT = new DecaElementType("IDENT");
  IElementType IF_THEN_ELSE = new DecaElementType("IF_THEN_ELSE");
  IElementType INEQUALITY_EXPR = new DecaElementType("INEQUALITY_EXPR");
  IElementType INST = new DecaElementType("INST");
  IElementType LIST_CLASSES = new DecaElementType("LIST_CLASSES");
  IElementType LIST_DECL = new DecaElementType("LIST_DECL");
  IElementType LIST_DECL_FIELD = new DecaElementType("LIST_DECL_FIELD");
  IElementType LIST_DECL_VAR = new DecaElementType("LIST_DECL_VAR");
  IElementType LIST_EXPR = new DecaElementType("LIST_EXPR");
  IElementType LIST_INST = new DecaElementType("LIST_INST");
  IElementType LIST_PARAMS = new DecaElementType("LIST_PARAMS");
  IElementType LITERAL = new DecaElementType("LITERAL");
  IElementType MAIN = new DecaElementType("MAIN");
  IElementType MULTI_LINE_STRING = new DecaElementType("MULTI_LINE_STRING");
  IElementType MULT_EXPR = new DecaElementType("MULT_EXPR");
  IElementType OR_EXPR = new DecaElementType("OR_EXPR");
  IElementType PARAM = new DecaElementType("PARAM");
  IElementType PRIMARY_EXPR = new DecaElementType("PRIMARY_EXPR");
  IElementType RETURN_TYPE = new DecaElementType("RETURN_TYPE");
  IElementType SUM_EXPR = new DecaElementType("SUM_EXPR");
  IElementType UNARY_EXPR = new DecaElementType("UNARY_EXPR");
  IElementType VISIBILITY = new DecaElementType("VISIBILITY");

  IElementType AND = new DecaTokenType("&&");
  IElementType ASM = new DecaTokenType("asm");
  IElementType CBRACE = new DecaTokenType("}");
  IElementType CLASS = new DecaTokenType("class");
  IElementType COMMA = new DecaTokenType(",");
  IElementType COMMENT = new DecaTokenType("COMMENT");
  IElementType COMMENT_LINE = new DecaTokenType("COMMENT_LINE");
  IElementType CPARENT = new DecaTokenType(")");
  IElementType DOT = new DecaTokenType(".");
  IElementType ELSE = new DecaTokenType("else");
  IElementType END_OF_LINE_COMMENT = new DecaTokenType("");
  IElementType EQEQ = new DecaTokenType("==");
  IElementType EQUALS = new DecaTokenType("=");
  IElementType EXCLAM = new DecaTokenType("!");
  IElementType EXTENDS = new DecaTokenType("extends");
  IElementType FALSE = new DecaTokenType("false");
  IElementType FLOAT = new DecaTokenType("FLOAT");
  IElementType GEQ = new DecaTokenType(">=");
  IElementType GT = new DecaTokenType(">");
  IElementType IF = new DecaTokenType("if");
  IElementType INSTANCEOF = new DecaTokenType("instanceof");
  IElementType INT = new DecaTokenType("INT");
  IElementType LEQ = new DecaTokenType("<=");
  IElementType LT = new DecaTokenType("<");
  IElementType MINUS = new DecaTokenType("-");
  IElementType NEQ = new DecaTokenType("!=");
  IElementType NEW = new DecaTokenType("new");
  IElementType NULL = new DecaTokenType("null");
  IElementType OBRACE = new DecaTokenType("{");
  IElementType OPARENT = new DecaTokenType("(");
  IElementType OR = new DecaTokenType("||");
  IElementType PERCENT = new DecaTokenType("%");
  IElementType PLUS = new DecaTokenType("+");
  IElementType PRINT = new DecaTokenType("print");
  IElementType PRINTLN = new DecaTokenType("println");
  IElementType PRINTLNX = new DecaTokenType("printlnx");
  IElementType PRINTX = new DecaTokenType("printx");
  IElementType PROTECTED = new DecaTokenType("protected");
  IElementType READFLOAT = new DecaTokenType("readFloat");
  IElementType READINT = new DecaTokenType("readInt");
  IElementType RETURN = new DecaTokenType("return");
  IElementType SEMI = new DecaTokenType(";");
  IElementType SLASH = new DecaTokenType("/");
  IElementType STRING = new DecaTokenType("STRING");
  IElementType THIS = new DecaTokenType("this");
  IElementType TIDENT = new DecaTokenType("TIDENT");
  IElementType TIMES = new DecaTokenType("*");
  IElementType TMULTI_LINE_STRING = new DecaTokenType("TMULTI_LINE_STRING");
  IElementType TRUE = new DecaTokenType("true");
  IElementType WHILE = new DecaTokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AND_EXPR) {
        return new DecaAndExprImpl(node);
      }
      else if (type == BLOCK) {
        return new DecaBlockImpl(node);
      }
      else if (type == CLASS_BODY) {
        return new DecaClassBodyImpl(node);
      }
      else if (type == CLASS_DECL) {
        return new DecaClassDeclImpl(node);
      }
      else if (type == CLASS_EXTENSION) {
        return new DecaClassExtensionImpl(node);
      }
      else if (type == DECL_FIELD) {
        return new DecaDeclFieldImpl(node);
      }
      else if (type == DECL_FIELD_SET) {
        return new DecaDeclFieldSetImpl(node);
      }
      else if (type == DECL_METHOD) {
        return new DecaDeclMethodImpl(node);
      }
      else if (type == DECL_VAR) {
        return new DecaDeclVarImpl(node);
      }
      else if (type == DECL_VAR_SET) {
        return new DecaDeclVarSetImpl(node);
      }
      else if (type == EQ_NEQ_EXPR) {
        return new DecaEqNeqExprImpl(node);
      }
      else if (type == EXPR) {
        return new DecaExprImpl(node);
      }
      else if (type == IDENT) {
        return new DecaIdentImpl(node);
      }
      else if (type == IF_THEN_ELSE) {
        return new DecaIfThenElseImpl(node);
      }
      else if (type == INEQUALITY_EXPR) {
        return new DecaInequalityExprImpl(node);
      }
      else if (type == INST) {
        return new DecaInstImpl(node);
      }
      else if (type == LIST_CLASSES) {
        return new DecaListClassesImpl(node);
      }
      else if (type == LIST_DECL) {
        return new DecaListDeclImpl(node);
      }
      else if (type == LIST_DECL_FIELD) {
        return new DecaListDeclFieldImpl(node);
      }
      else if (type == LIST_DECL_VAR) {
        return new DecaListDeclVarImpl(node);
      }
      else if (type == LIST_EXPR) {
        return new DecaListExprImpl(node);
      }
      else if (type == LIST_INST) {
        return new DecaListInstImpl(node);
      }
      else if (type == LIST_PARAMS) {
        return new DecaListParamsImpl(node);
      }
      else if (type == LITERAL) {
        return new DecaLiteralImpl(node);
      }
      else if (type == MAIN) {
        return new DecaMainImpl(node);
      }
      else if (type == MULTI_LINE_STRING) {
        return new DecaMultiLineStringImpl(node);
      }
      else if (type == MULT_EXPR) {
        return new DecaMultExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new DecaOrExprImpl(node);
      }
      else if (type == PARAM) {
        return new DecaParamImpl(node);
      }
      else if (type == PRIMARY_EXPR) {
        return new DecaPrimaryExprImpl(node);
      }
      else if (type == RETURN_TYPE) {
        return new DecaReturnTypeImpl(node);
      }
      else if (type == SUM_EXPR) {
        return new DecaSumExprImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new DecaUnaryExprImpl(node);
      }
      else if (type == VISIBILITY) {
        return new DecaVisibilityImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
