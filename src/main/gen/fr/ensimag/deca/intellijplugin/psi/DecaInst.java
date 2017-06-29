// This is a generated file. Not intended for manual editing.
package fr.ensimag.deca.intellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DecaInst extends PsiElement {

  @Nullable
  DecaExpr getExpr();

  @Nullable
  DecaIfThenElse getIfThenElse();

  @Nullable
  DecaListExpr getListExpr();

  @Nullable
  DecaListInst getListInst();

}
