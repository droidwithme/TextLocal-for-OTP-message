package com.codingnation.textlocal.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0006\u0010\u0016\u001a\u00020\u0012J(\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J\u0006\u0010\"\u001a\u00020\u0012R\"\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/codingnation/textlocal/base/BaseFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/codingnation/textlocal/base/MainNavigationContract$View;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG$app_debug", "()Ljava/lang/String;", "setTAG$app_debug", "(Ljava/lang/String;)V", "layout", "", "getLayout", "()I", "mDialog", "Landroid/app/Dialog;", "attachPresenter", "", "presenter", "Lcom/codingnation/textlocal/base/MainNavigationContract$Presenter;", "createProgressBar", "hideProgressBar", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "showProgressBar", "Companion", "app_debug"})
public abstract class BaseFragment extends android.support.v4.app.Fragment implements com.codingnation.textlocal.base.MainNavigationContract.View {
    private java.lang.String TAG;
    private android.app.Dialog mDialog;
    @org.jetbrains.annotations.Nullable()
    private static com.codingnation.textlocal.base.MainNavigationContract.Presenter navigationPresenter;
    public static final com.codingnation.textlocal.base.BaseFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final java.lang.String getTAG$app_debug() {
        return null;
    }
    
    public final void setTAG$app_debug(java.lang.String p0) {
    }
    
    protected abstract int getLayout();
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void attachPresenter(@org.jetbrains.annotations.NotNull()
    com.codingnation.textlocal.base.MainNavigationContract.Presenter presenter) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public final void showProgressBar() {
    }
    
    private final void createProgressBar() {
    }
    
    public final void hideProgressBar() {
    }
    
    public BaseFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/codingnation/textlocal/base/BaseFragment$Companion;", "", "()V", "navigationPresenter", "Lcom/codingnation/textlocal/base/MainNavigationContract$Presenter;", "getNavigationPresenter", "()Lcom/codingnation/textlocal/base/MainNavigationContract$Presenter;", "setNavigationPresenter", "(Lcom/codingnation/textlocal/base/MainNavigationContract$Presenter;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.codingnation.textlocal.base.MainNavigationContract.Presenter getNavigationPresenter() {
            return null;
        }
        
        public final void setNavigationPresenter(@org.jetbrains.annotations.Nullable()
        com.codingnation.textlocal.base.MainNavigationContract.Presenter p0) {
        }
        
        private Companion() {
            super();
        }
    }
}