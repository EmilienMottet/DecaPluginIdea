// This is a generated file. Not intended for manual editing.
package fr.ensimag.deca.intellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DecaInequalityExpr extends PsiElement {

  @NotNull
  List<DecaReturnType> getReturnTypeList();

  @NotNull
  List<DecaSumExpr> getSumExprList();

}
