// This is a generated file. Not intended for manual editing.
package fr.ensimag.deca.intellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DecaPrimaryExpr extends PsiElement {

  @Nullable
  DecaExpr getExpr();

  @Nullable
  DecaIdent getIdent();

  @Nullable
  DecaListExpr getListExpr();

  @Nullable
  DecaLiteral getLiteral();

  @Nullable
  DecaType getType();

}
