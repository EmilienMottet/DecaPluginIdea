// This is a generated file. Not intended for manual editing.
package fr.ensimag.deca.intellijplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static fr.ensimag.deca.intellijplugin.psi.DecaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DecaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == AND_EXPR) {
      r = and_expr(b, 0);
    }
    else if (t == BLOCK) {
      r = block(b, 0);
    }
    else if (t == CLASS_BODY) {
      r = class_body(b, 0);
    }
    else if (t == CLASS_DECL) {
      r = class_decl(b, 0);
    }
    else if (t == CLASS_EXTENSION) {
      r = class_extension(b, 0);
    }
    else if (t == DECL_FIELD) {
      r = decl_field(b, 0);
    }
    else if (t == DECL_FIELD_SET) {
      r = decl_field_set(b, 0);
    }
    else if (t == DECL_METHOD) {
      r = decl_method(b, 0);
    }
    else if (t == DECL_VAR) {
      r = decl_var(b, 0);
    }
    else if (t == DECL_VAR_SET) {
      r = decl_var_set(b, 0);
    }
    else if (t == EQ_NEQ_EXPR) {
      r = eq_neq_expr(b, 0);
    }
    else if (t == EXPR) {
      r = expr(b, 0);
    }
    else if (t == IDENT) {
      r = ident(b, 0);
    }
    else if (t == IF_THEN_ELSE) {
      r = if_then_else(b, 0);
    }
    else if (t == INEQUALITY_EXPR) {
      r = inequality_expr(b, 0);
    }
    else if (t == INST) {
      r = inst(b, 0);
    }
    else if (t == LIST_CLASSES) {
      r = list_classes(b, 0);
    }
    else if (t == LIST_DECL) {
      r = list_decl(b, 0);
    }
    else if (t == LIST_DECL_FIELD) {
      r = list_decl_field(b, 0);
    }
    else if (t == LIST_DECL_VAR) {
      r = list_decl_var(b, 0);
    }
    else if (t == LIST_EXPR) {
      r = list_expr(b, 0);
    }
    else if (t == LIST_INST) {
      r = list_inst(b, 0);
    }
    else if (t == LIST_PARAMS) {
      r = list_params(b, 0);
    }
    else if (t == LITERAL) {
      r = literal(b, 0);
    }
    else if (t == MAIN) {
      r = main(b, 0);
    }
    else if (t == MULT_EXPR) {
      r = mult_expr(b, 0);
    }
    else if (t == MULTI_LINE_STRING) {
      r = multi_line_string(b, 0);
    }
    else if (t == OR_EXPR) {
      r = or_expr(b, 0);
    }
    else if (t == PARAM) {
      r = param(b, 0);
    }
    else if (t == PRIMARY_EXPR) {
      r = primary_expr(b, 0);
    }
    else if (t == SUM_EXPR) {
      r = sum_expr(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == UNARY_EXPR) {
      r = unary_expr(b, 0);
    }
    else if (t == VISIBILITY) {
      r = visibility(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return prog(b, l + 1);
  }

  /* ********************************************************** */
  // eq_neq_expr ( AND eq_neq_expr )*
  public static boolean and_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPR, "<and expr>");
    r = eq_neq_expr(b, l + 1);
    r = r && and_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( AND eq_neq_expr )*
  private static boolean and_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!and_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // AND eq_neq_expr
  private static boolean and_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && eq_neq_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OBRACE list_decl list_inst CBRACE
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, OBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBRACE);
    r = r && list_decl(b, l + 1);
    r = r && list_inst(b, l + 1);
    r = r && consumeToken(b, CBRACE);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // ( decl_method | decl_field_set )*
  public static boolean class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, CLASS_BODY, "<class body>");
    int c = current_position_(b);
    while (true) {
      if (!class_body_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_body", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // decl_method | decl_field_set
  private static boolean class_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_method(b, l + 1);
    if (!r) r = decl_field_set(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS ident class_extension OBRACE class_body CBRACE
  public static boolean class_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_decl")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    r = r && ident(b, l + 1);
    r = r && class_extension(b, l + 1);
    r = r && consumeToken(b, OBRACE);
    r = r && class_body(b, l + 1);
    r = r && consumeToken(b, CBRACE);
    exit_section_(b, m, CLASS_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // ( EXTENDS ident )?
  public static boolean class_extension(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_extension")) return false;
    Marker m = enter_section_(b, l, _NONE_, CLASS_EXTENSION, "<class extension>");
    class_extension_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // EXTENDS ident
  private static boolean class_extension_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_extension_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident ( EQUALS expr )?
  public static boolean decl_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_field")) return false;
    if (!nextTokenIs(b, TIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && decl_field_1(b, l + 1);
    exit_section_(b, m, DECL_FIELD, r);
    return r;
  }

  // ( EQUALS expr )?
  private static boolean decl_field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_field_1")) return false;
    decl_field_1_0(b, l + 1);
    return true;
  }

  // EQUALS expr
  private static boolean decl_field_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_field_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // visibility type list_decl_field SEMI
  public static boolean decl_field_set(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_field_set")) return false;
    if (!nextTokenIs(b, "<decl field set>", END_OF_LINE_COMMENT, PROTECTED)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_FIELD_SET, "<decl field set>");
    r = visibility(b, l + 1);
    r = r && type(b, l + 1);
    r = r && list_decl_field(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type ident OPARENT list_params CPARENT ( block | ASM OPARENT multi_line_string CPARENT SEMI )
  public static boolean decl_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_method")) return false;
    if (!nextTokenIs(b, "<decl method>", PRIMTYPE, TIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_METHOD, "<decl method>");
    r = type(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && consumeToken(b, OPARENT);
    r = r && list_params(b, l + 1);
    r = r && consumeToken(b, CPARENT);
    r = r && decl_method_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // block | ASM OPARENT multi_line_string CPARENT SEMI
  private static boolean decl_method_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_method_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block(b, l + 1);
    if (!r) r = decl_method_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ASM OPARENT multi_line_string CPARENT SEMI
  private static boolean decl_method_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_method_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASM, OPARENT);
    r = r && multi_line_string(b, l + 1);
    r = r && consumeTokens(b, 0, CPARENT, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident ( EQUALS expr )?
  public static boolean decl_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_var")) return false;
    if (!nextTokenIs(b, TIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && decl_var_1(b, l + 1);
    exit_section_(b, m, DECL_VAR, r);
    return r;
  }

  // ( EQUALS expr )?
  private static boolean decl_var_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_var_1")) return false;
    decl_var_1_0(b, l + 1);
    return true;
  }

  // EQUALS expr
  private static boolean decl_var_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_var_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type list_decl_var SEMI
  public static boolean decl_var_set(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_var_set")) return false;
    if (!nextTokenIs(b, "<decl var set>", PRIMTYPE, TIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_VAR_SET, "<decl var set>");
    r = type(b, l + 1);
    r = r && list_decl_var(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // inequality_expr ( ( EQEQ | NEQ ) inequality_expr )*
  public static boolean eq_neq_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq_neq_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQ_NEQ_EXPR, "<eq neq expr>");
    r = inequality_expr(b, l + 1);
    r = r && eq_neq_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( EQEQ | NEQ ) inequality_expr )*
  private static boolean eq_neq_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq_neq_expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!eq_neq_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "eq_neq_expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( EQEQ | NEQ ) inequality_expr
  private static boolean eq_neq_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq_neq_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = eq_neq_expr_1_0_0(b, l + 1);
    r = r && inequality_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQEQ | NEQ
  private static boolean eq_neq_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq_neq_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQEQ);
    if (!r) r = consumeToken(b, NEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // or_expr ( EQUALS or_expr )*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = or_expr(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( EQUALS or_expr )*
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EQUALS or_expr
  private static boolean expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && or_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TIDENT
  public static boolean ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident")) return false;
    if (!nextTokenIs(b, TIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TIDENT);
    exit_section_(b, m, IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // IF OPARENT expr CPARENT OBRACE list_inst CBRACE ( ELSE IF OPARENT expr CPARENT OBRACE list_inst CBRACE )* ( ELSE OBRACE list_inst CBRACE )?
  public static boolean if_then_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_else")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, OPARENT);
    r = r && expr(b, l + 1);
    r = r && consumeTokens(b, 0, CPARENT, OBRACE);
    r = r && list_inst(b, l + 1);
    r = r && consumeToken(b, CBRACE);
    r = r && if_then_else_7(b, l + 1);
    r = r && if_then_else_8(b, l + 1);
    exit_section_(b, m, IF_THEN_ELSE, r);
    return r;
  }

  // ( ELSE IF OPARENT expr CPARENT OBRACE list_inst CBRACE )*
  private static boolean if_then_else_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_else_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!if_then_else_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_then_else_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ELSE IF OPARENT expr CPARENT OBRACE list_inst CBRACE
  private static boolean if_then_else_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_else_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, IF, OPARENT);
    r = r && expr(b, l + 1);
    r = r && consumeTokens(b, 0, CPARENT, OBRACE);
    r = r && list_inst(b, l + 1);
    r = r && consumeToken(b, CBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ELSE OBRACE list_inst CBRACE )?
  private static boolean if_then_else_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_else_8")) return false;
    if_then_else_8_0(b, l + 1);
    return true;
  }

  // ELSE OBRACE list_inst CBRACE
  private static boolean if_then_else_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_else_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, OBRACE);
    r = r && list_inst(b, l + 1);
    r = r && consumeToken(b, CBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // sum_expr ( ( LEQ | GEQ | GT | LT ) sum_expr | INSTANCEOF type )*
  public static boolean inequality_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inequality_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INEQUALITY_EXPR, "<inequality expr>");
    r = sum_expr(b, l + 1);
    r = r && inequality_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( LEQ | GEQ | GT | LT ) sum_expr | INSTANCEOF type )*
  private static boolean inequality_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inequality_expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!inequality_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inequality_expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( LEQ | GEQ | GT | LT ) sum_expr | INSTANCEOF type
  private static boolean inequality_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inequality_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inequality_expr_1_0_0(b, l + 1);
    if (!r) r = inequality_expr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LEQ | GEQ | GT | LT ) sum_expr
  private static boolean inequality_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inequality_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inequality_expr_1_0_0_0(b, l + 1);
    r = r && sum_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEQ | GEQ | GT | LT
  private static boolean inequality_expr_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inequality_expr_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEQ);
    if (!r) r = consumeToken(b, GEQ);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, LT);
    exit_section_(b, m, null, r);
    return r;
  }

  // INSTANCEOF type
  private static boolean inequality_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inequality_expr_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSTANCEOF);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( RETURN? expr | ( PRINT | PRINTLN | PRINTX | PRINTLNX ) OPARENT list_expr CPARENT )? SEMI
  //            | if_then_else
  //            | WHILE OPARENT expr CPARENT OBRACE list_inst CBRACE
  public static boolean inst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inst")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INST, "<inst>");
    r = inst_0(b, l + 1);
    if (!r) r = if_then_else(b, l + 1);
    if (!r) r = inst_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( RETURN? expr | ( PRINT | PRINTLN | PRINTX | PRINTLNX ) OPARENT list_expr CPARENT )? SEMI
  private static boolean inst_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inst_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inst_0_0(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( RETURN? expr | ( PRINT | PRINTLN | PRINTX | PRINTLNX ) OPARENT list_expr CPARENT )?
  private static boolean inst_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inst_0_0")) return false;
    inst_0_0_0(b, l + 1);
    return true;
  }

  // RETURN? expr | ( PRINT | PRINTLN | PRINTX | PRINTLNX ) OPARENT list_expr CPARENT
  private static boolean inst_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inst_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inst_0_0_0_0(b, l + 1);
    if (!r) r = inst_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RETURN? expr
  private static boolean inst_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inst_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inst_0_0_0_0_0(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RETURN?
  private static boolean inst_0_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inst_0_0_0_0_0")) return false;
    consumeToken(b, RETURN);
    return true;
  }

  // ( PRINT | PRINTLN | PRINTX | PRINTLNX ) OPARENT list_expr CPARENT
  private static boolean inst_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inst_0_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inst_0_0_0_1_0(b, l + 1);
    r = r && consumeToken(b, OPARENT);
    r = r && list_expr(b, l + 1);
    r = r && consumeToken(b, CPARENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // PRINT | PRINTLN | PRINTX | PRINTLNX
  private static boolean inst_0_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inst_0_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRINT);
    if (!r) r = consumeToken(b, PRINTLN);
    if (!r) r = consumeToken(b, PRINTX);
    if (!r) r = consumeToken(b, PRINTLNX);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHILE OPARENT expr CPARENT OBRACE list_inst CBRACE
  private static boolean inst_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inst_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, OPARENT);
    r = r && expr(b, l + 1);
    r = r && consumeTokens(b, 0, CPARENT, OBRACE);
    r = r && list_inst(b, l + 1);
    r = r && consumeToken(b, CBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_decl*
  public static boolean list_classes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_classes")) return false;
    Marker m = enter_section_(b, l, _NONE_, LIST_CLASSES, "<list classes>");
    int c = current_position_(b);
    while (true) {
      if (!class_decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_classes", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // decl_var_set*
  public static boolean list_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_decl")) return false;
    Marker m = enter_section_(b, l, _NONE_, LIST_DECL, "<list decl>");
    int c = current_position_(b);
    while (true) {
      if (!decl_var_set(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_decl", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // decl_field ( COMMA decl_field )*
  public static boolean list_decl_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_decl_field")) return false;
    if (!nextTokenIs(b, TIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_field(b, l + 1);
    r = r && list_decl_field_1(b, l + 1);
    exit_section_(b, m, LIST_DECL_FIELD, r);
    return r;
  }

  // ( COMMA decl_field )*
  private static boolean list_decl_field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_decl_field_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_decl_field_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_decl_field_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA decl_field
  private static boolean list_decl_field_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_decl_field_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && decl_field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decl_var ( COMMA decl_var )*
  public static boolean list_decl_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_decl_var")) return false;
    if (!nextTokenIs(b, TIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_var(b, l + 1);
    r = r && list_decl_var_1(b, l + 1);
    exit_section_(b, m, LIST_DECL_VAR, r);
    return r;
  }

  // ( COMMA decl_var )*
  private static boolean list_decl_var_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_decl_var_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_decl_var_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_decl_var_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA decl_var
  private static boolean list_decl_var_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_decl_var_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && decl_var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( expr ( COMMA expr )* )?
  public static boolean list_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr")) return false;
    Marker m = enter_section_(b, l, _NONE_, LIST_EXPR, "<list expr>");
    list_expr_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // expr ( COMMA expr )*
  private static boolean list_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && list_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA expr )*
  private static boolean list_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_expr_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_expr_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA expr
  private static boolean list_expr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inst*
  public static boolean list_inst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_inst")) return false;
    Marker m = enter_section_(b, l, _NONE_, LIST_INST, "<list inst>");
    int c = current_position_(b);
    while (true) {
      if (!inst(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_inst", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ( param ( COMMA param )* )?
  public static boolean list_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_params")) return false;
    Marker m = enter_section_(b, l, _NONE_, LIST_PARAMS, "<list params>");
    list_params_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // param ( COMMA param )*
  private static boolean list_params_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_params_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param(b, l + 1);
    r = r && list_params_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA param )*
  private static boolean list_params_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_params_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_params_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_params_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA param
  private static boolean list_params_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_params_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INT
  //            | FLOAT
  //            | STRING
  //            | TRUE
  //            | FALSE
  //            | THIS
  //            | NULL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, THIS);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block?
  public static boolean main(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main")) return false;
    Marker m = enter_section_(b, l, _NONE_, MAIN, "<main>");
    block(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // unary_expr ( ( TIMES | SLASH | PERCENT ) unary_expr )*
  public static boolean mult_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULT_EXPR, "<mult expr>");
    r = unary_expr(b, l + 1);
    r = r && mult_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( TIMES | SLASH | PERCENT ) unary_expr )*
  private static boolean mult_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!mult_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mult_expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( TIMES | SLASH | PERCENT ) unary_expr
  private static boolean mult_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mult_expr_1_0_0(b, l + 1);
    r = r && unary_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TIMES | SLASH | PERCENT
  private static boolean mult_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TIMES);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, PERCENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING
  //            | TMULTI_LINE_STRING
  public static boolean multi_line_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_line_string")) return false;
    if (!nextTokenIs(b, "<multi line string>", STRING, TMULTI_LINE_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_LINE_STRING, "<multi line string>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, TMULTI_LINE_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // and_expr ( OR and_expr )*
  public static boolean or_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_EXPR, "<or expr>");
    r = and_expr(b, l + 1);
    r = r && or_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( OR and_expr )*
  private static boolean or_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!or_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "or_expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OR and_expr
  private static boolean or_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && and_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type ident
  public static boolean param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param")) return false;
    if (!nextTokenIs(b, "<param>", PRIMTYPE, TIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM, "<param>");
    r = type(b, l + 1);
    r = r && ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ident ( OPARENT list_expr CPARENT )?
  //            | ( OPARENT ( type CPARENT OPARENT )? expr | ( READINT | READFLOAT | NEW ident ) OPARENT ) CPARENT
  //            | literal
  public static boolean primary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPR, "<primary expr>");
    r = primary_expr_0(b, l + 1);
    if (!r) r = primary_expr_1(b, l + 1);
    if (!r) r = literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ident ( OPARENT list_expr CPARENT )?
  private static boolean primary_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && primary_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( OPARENT list_expr CPARENT )?
  private static boolean primary_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_0_1")) return false;
    primary_expr_0_1_0(b, l + 1);
    return true;
  }

  // OPARENT list_expr CPARENT
  private static boolean primary_expr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPARENT);
    r = r && list_expr(b, l + 1);
    r = r && consumeToken(b, CPARENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( OPARENT ( type CPARENT OPARENT )? expr | ( READINT | READFLOAT | NEW ident ) OPARENT ) CPARENT
  private static boolean primary_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expr_1_0(b, l + 1);
    r = r && consumeToken(b, CPARENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPARENT ( type CPARENT OPARENT )? expr | ( READINT | READFLOAT | NEW ident ) OPARENT
  private static boolean primary_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expr_1_0_0(b, l + 1);
    if (!r) r = primary_expr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPARENT ( type CPARENT OPARENT )? expr
  private static boolean primary_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPARENT);
    r = r && primary_expr_1_0_0_1(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( type CPARENT OPARENT )?
  private static boolean primary_expr_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1_0_0_1")) return false;
    primary_expr_1_0_0_1_0(b, l + 1);
    return true;
  }

  // type CPARENT OPARENT
  private static boolean primary_expr_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeTokens(b, 0, CPARENT, OPARENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( READINT | READFLOAT | NEW ident ) OPARENT
  private static boolean primary_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expr_1_0_1_0(b, l + 1);
    r = r && consumeToken(b, OPARENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // READINT | READFLOAT | NEW ident
  private static boolean primary_expr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, READINT);
    if (!r) r = consumeToken(b, READFLOAT);
    if (!r) r = primary_expr_1_0_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW ident
  private static boolean primary_expr_1_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1_0_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // list_classes main
  static boolean prog(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prog")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_classes(b, l + 1);
    r = r && main(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // mult_expr ( ( PLUS | MINUS ) mult_expr )*
  public static boolean sum_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sum_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUM_EXPR, "<sum expr>");
    r = mult_expr(b, l + 1);
    r = r && sum_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( PLUS | MINUS ) mult_expr )*
  private static boolean sum_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sum_expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!sum_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sum_expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( PLUS | MINUS ) mult_expr
  private static boolean sum_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sum_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sum_expr_1_0_0(b, l + 1);
    r = r && mult_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS
  private static boolean sum_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sum_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident
  //            | PRIMTYPE
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, "<type>", PRIMTYPE, TIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = ident(b, l + 1);
    if (!r) r = consumeToken(b, PRIMTYPE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( MINUS | EXCLAM )* primary_expr ( DOT ident ( OPARENT list_expr CPARENT )? )*
  public static boolean unary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPR, "<unary expr>");
    r = unary_expr_0(b, l + 1);
    r = r && primary_expr(b, l + 1);
    r = r && unary_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( MINUS | EXCLAM )*
  private static boolean unary_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!unary_expr_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unary_expr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // MINUS | EXCLAM
  private static boolean unary_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, EXCLAM);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DOT ident ( OPARENT list_expr CPARENT )? )*
  private static boolean unary_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!unary_expr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unary_expr_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT ident ( OPARENT list_expr CPARENT )?
  private static boolean unary_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && ident(b, l + 1);
    r = r && unary_expr_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( OPARENT list_expr CPARENT )?
  private static boolean unary_expr_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr_2_0_2")) return false;
    unary_expr_2_0_2_0(b, l + 1);
    return true;
  }

  // OPARENT list_expr CPARENT
  private static boolean unary_expr_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPARENT);
    r = r && list_expr(b, l + 1);
    r = r && consumeToken(b, CPARENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PROTECTED?END_OF_LINE_COMMENT
  public static boolean visibility(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility")) return false;
    if (!nextTokenIs(b, "<visibility>", END_OF_LINE_COMMENT, PROTECTED)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VISIBILITY, "<visibility>");
    r = visibility_0(b, l + 1);
    r = r && consumeToken(b, END_OF_LINE_COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PROTECTED?
  private static boolean visibility_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility_0")) return false;
    consumeToken(b, PROTECTED);
    return true;
  }

}
