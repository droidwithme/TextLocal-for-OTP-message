package com.codingnation.textlocal.base;

import java.lang.System;

/**
 * Created by dr on 25/10/18.
 * On ShoingFest
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/codingnation/textlocal/base/BaseView;", "", "hideProgress", "", "showError", "errMsg", "", "showProgress", "app_debug"})
public abstract interface BaseView {
    
    public abstract void showProgress();
    
    public abstract void hideProgress();
    
    public abstract void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String errMsg);
}