package com.codingnation.textlocal.ui.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0000J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/codingnation/textlocal/ui/history/HistoryFragment;", "Lcom/codingnation/textlocal/base/BaseFragment;", "Lcom/codingnation/textlocal/ui/history/SentOtpView;", "()V", "ctx", "Landroid/content/Context;", "layout", "", "getLayout", "()I", "getHistoryFragment", "hideProgress", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "renderData", "history", "", "Lcom/codingnation/textlocal/ui/sendotp/SendOtpQ;", "setUpToolbar", "showError", "errMsg", "", "showProgress", "Companion", "app_debug"})
public final class HistoryFragment extends com.codingnation.textlocal.base.BaseFragment implements com.codingnation.textlocal.ui.history.SentOtpView {
    private android.content.Context ctx;
    @org.jetbrains.annotations.NotNull()
    public static com.codingnation.textlocal.ui.history.SentOtpImpl presenter;
    public static final com.codingnation.textlocal.ui.history.HistoryFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpToolbar() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void renderData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.codingnation.textlocal.ui.sendotp.SendOtpQ> history) {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String errMsg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codingnation.textlocal.ui.history.HistoryFragment getHistoryFragment() {
        return null;
    }
    
    public HistoryFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/codingnation/textlocal/ui/history/HistoryFragment$Companion;", "", "()V", "presenter", "Lcom/codingnation/textlocal/ui/history/SentOtpImpl;", "getPresenter", "()Lcom/codingnation/textlocal/ui/history/SentOtpImpl;", "setPresenter", "(Lcom/codingnation/textlocal/ui/history/SentOtpImpl;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.codingnation.textlocal.ui.history.SentOtpImpl getPresenter() {
            return null;
        }
        
        public final void setPresenter(@org.jetbrains.annotations.NotNull()
        com.codingnation.textlocal.ui.history.SentOtpImpl p0) {
        }
        
        private Companion() {
            super();
        }
    }
}