// This is a generated file. Not intended for manual editing.
package com.jetbrains.lang.dart.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.jetbrains.lang.dart.DartTokenTypes.*;
import com.jetbrains.lang.dart.psi.*;
import com.jetbrains.lang.dart.util.DartPsiImplUtil;

public class DartNamedConstructorDeclarationImpl extends AbstractDartComponentImpl implements DartNamedConstructorDeclaration {

  public DartNamedConstructorDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DartVisitor visitor) {
    visitor.visitNamedConstructorDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DartVisitor) accept((DartVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DartComponentName> getComponentNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DartComponentName.class);
  }

  @Override
  @NotNull
  public DartFormalParameterList getFormalParameterList() {
    return findNotNullChildByClass(DartFormalParameterList.class);
  }

  @Override
  @Nullable
  public DartFunctionBody getFunctionBody() {
    return findChildByClass(DartFunctionBody.class);
  }

  @Override
  @Nullable
  public DartInitializers getInitializers() {
    return findChildByClass(DartInitializers.class);
  }

  @Override
  @NotNull
  public List<DartMetadata> getMetadataList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DartMetadata.class);
  }

  @Override
  @Nullable
  public DartRedirection getRedirection() {
    return findChildByClass(DartRedirection.class);
  }

  @Override
  @Nullable
  public DartStringLiteralExpression getStringLiteralExpression() {
    return findChildByClass(DartStringLiteralExpression.class);
  }

  @Nullable
  public DartComponentName getComponentName() {
    return DartPsiImplUtil.getComponentName(this);
  }

}
