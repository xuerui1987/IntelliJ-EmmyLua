// This is a generated file. Not intended for manual editing.
package com.tang.intellij.lua.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tang.intellij.lua.psi.LuaTypes.*;
import com.tang.intellij.lua.psi.*;
import com.tang.intellij.lua.stubs.LuaTableStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class LuaTableExprImpl extends LuaTableExprMixin implements LuaTableExpr {

  public LuaTableExprImpl(LuaTableStub stub, IStubElementType<?, ?> nodeType) {
    super(stub, nodeType);
  }

  public LuaTableExprImpl(ASTNode node) {
    super(node);
  }

  public LuaTableExprImpl(LuaTableStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitTableExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LuaTableField> getTableFieldList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, LuaTableField.class);
  }

  @Override
  @NotNull
  public List<LuaTableFieldSep> getTableFieldSepList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LuaTableFieldSep.class);
  }

  @Nullable
  public LuaTableField findField(String fieldName) {
    return LuaPsiImplUtilKt.findField(this, fieldName);
  }

  @NotNull
  public String toString() {
    return LuaPsiImplUtilKt.toString(this);
  }

}
