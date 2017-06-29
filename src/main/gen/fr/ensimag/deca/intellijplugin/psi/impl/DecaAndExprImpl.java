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

public class DecaAndExprImpl extends ASTWrapperPsiElement implements DecaAndExpr {

  public DecaAndExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DecaVisitor visitor) {
    visitor.visitAndExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DecaVisitor) accept((DecaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DecaEqNeqExpr> getEqNeqExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DecaEqNeqExpr.class);
  }

}
