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

public class DecaPrimaryExprImpl extends ASTWrapperPsiElement implements DecaPrimaryExpr {

  public DecaPrimaryExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DecaVisitor visitor) {
    visitor.visitPrimaryExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DecaVisitor) accept((DecaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DecaExpr getExpr() {
    return findChildByClass(DecaExpr.class);
  }

  @Override
  @Nullable
  public DecaIdent getIdent() {
    return findChildByClass(DecaIdent.class);
  }

  @Override
  @Nullable
  public DecaListExpr getListExpr() {
    return findChildByClass(DecaListExpr.class);
  }

  @Override
  @Nullable
  public DecaLiteral getLiteral() {
    return findChildByClass(DecaLiteral.class);
  }

  @Override
  @Nullable
  public DecaReturnType getReturnType() {
    return findChildByClass(DecaReturnType.class);
  }

}
