package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class OnLayoutChangedLinearLayout
  extends LinearLayout
{
  public a iKS;
  
  public OnLayoutChangedLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  @TargetApi(11)
  public OnLayoutChangedLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (iKS != null) {
      iKS.aKP();
    }
  }
  
  public void setOnChattingLayoutChangedListener(a parama)
  {
    iKS = parama;
  }
  
  public static abstract interface a
  {
    public abstract void aKP();
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.base.OnLayoutChangedLinearLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */