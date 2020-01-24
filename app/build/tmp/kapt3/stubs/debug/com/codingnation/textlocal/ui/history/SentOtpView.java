package com.codingnation.textlocal.ui.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/codingnation/textlocal/ui/history/SentOtpView;", "Lcom/codingnation/textlocal/base/BaseView;", "renderData", "", "history", "", "Lcom/codingnation/textlocal/ui/sendotp/SendOtpQ;", "app_debug"})
public abstract interface SentOtpView extends com.codingnation.textlocal.base.BaseView {
    
    public abstract void renderData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.codingnation.textlocal.ui.sendotp.SendOtpQ> history);
}