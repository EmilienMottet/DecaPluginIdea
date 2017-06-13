// This is a generated file. Not intended for manual editing.
package fr.ensimag.deca.intellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DecaDeclMethod extends PsiElement {

  @Nullable
  DecaBlock getBlock();

  @NotNull
  DecaIdent getIdent();

  @NotNull
  DecaListParams getListParams();

  @Nullable
  DecaMultiLineString getMultiLineString();

  @NotNull
  DecaType getType();

}
