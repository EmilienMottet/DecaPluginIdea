// This is a generated file. Not intended for manual editing.
package fr.ensimag.deca.intellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DecaUnaryExpr extends PsiElement {

  @NotNull
  List<DecaIdent> getIdentList();

  @NotNull
  List<DecaListExpr> getListExprList();

  @NotNull
  DecaPrimaryExpr getPrimaryExpr();

}
