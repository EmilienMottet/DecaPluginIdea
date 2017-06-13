// This is a generated file. Not intended for manual editing.
package fr.ensimag.deca.intellijplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static fr.ensimag.deca.intellijplugin.psi.DecaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import fr.ensimag.deca.intellijplugin.psi.*;

public class DecaDeclMethodImpl extends ASTWrapperPsiElement implements DecaDeclMethod {

  public DecaDeclMethodImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DecaVisitor visitor) {
    visitor.visitDeclMethod(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DecaVisitor) accept((DecaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DecaBlock getBlock() {
    return findChildByClass(DecaBlock.class);
  }

  @Override
  @NotNull
  public DecaIdent getIdent() {
    return findNotNullChildByClass(DecaIdent.class);
  }

  @Override
  @NotNull
  public DecaListParams getListParams() {
    return findNotNullChildByClass(DecaListParams.class);
  }

  @Override
  @Nullable
  public DecaMultiLineString getMultiLineString() {
    return findChildByClass(DecaMultiLineString.class);
  }

  @Override
  @NotNull
  public DecaType getType() {
    return findNotNullChildByClass(DecaType.class);
  }

}
