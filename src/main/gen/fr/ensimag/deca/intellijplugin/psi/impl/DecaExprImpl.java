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

public class DecaExprImpl extends ASTWrapperPsiElement implements DecaExpr {

  public DecaExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DecaVisitor visitor) {
    visitor.visitExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DecaVisitor) accept((DecaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DecaOrExpr> getOrExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DecaOrExpr.class);
  }

}
