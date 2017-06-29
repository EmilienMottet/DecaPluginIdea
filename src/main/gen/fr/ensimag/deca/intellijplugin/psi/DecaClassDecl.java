// This is a generated file. Not intended for manual editing.
package fr.ensimag.deca.intellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DecaClassDecl extends PsiElement {

  @NotNull
  DecaClassBody getClassBody();

  @NotNull
  DecaClassExtension getClassExtension();

  @NotNull
  DecaIdent getIdent();

}
