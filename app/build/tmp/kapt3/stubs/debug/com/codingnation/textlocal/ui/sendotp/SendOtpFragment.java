package com.codingnation.textlocal.ui.sendotp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001c\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001f"}, d2 = {"Lcom/codingnation/textlocal/ui/sendotp/SendOtpFragment;", "Lcom/codingnation/textlocal/base/BaseFragment;", "Lcom/codingnation/textlocal/ui/sendotp/SendOtpView;", "()V", "ctx", "Landroid/content/Context;", "layout", "", "getLayout", "()I", "getOtpFragment", "contact", "", "namel", "hideProgress", "", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "renderData", "response", "setClickListener", "setToPhoneNumber", "setUpToolbar", "showError", "errMsg", "showProgress", "Companion", "app_debug"})
public final class SendOtpFragment extends com.codingnation.textlocal.base.BaseFragment implements com.codingnation.textlocal.ui.sendotp.SendOtpView {
    private android.content.Context ctx;
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    public static com.codingnation.textlocal.ui.sendotp.SendOtpImpl presenter;
    @org.jetbrains.annotations.NotNull()
    public static java.lang.String selectedContact;
    @org.jetbrains.annotations.NotNull()
    public static java.lang.String name;
    public static final com.codingnation.textlocal.ui.sendotp.SendOtpFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.codingnation.textlocal.ui.sendotp.SendOtpFragment getOtpFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String contact, @org.jetbrains.annotations.NotNull()
    java.lang.String namel) {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpToolbar() {
    }
    
    private final void setToPhoneNumber() {
    }
    
    private final void setClickListener() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void renderData(@org.jetbrains.annotations.NotNull()
    java.lang.String response) {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String errMsg) {
    }
    
    public SendOtpFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/codingnation/textlocal/ui/sendotp/SendOtpFragment$Companion;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "presenter", "Lcom/codingnation/textlocal/ui/sendotp/SendOtpImpl;", "getPresenter", "()Lcom/codingnation/textlocal/ui/sendotp/SendOtpImpl;", "setPresenter", "(Lcom/codingnation/textlocal/ui/sendotp/SendOtpImpl;)V", "selectedContact", "getSelectedContact", "setSelectedContact", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.codingnation.textlocal.ui.sendotp.SendOtpImpl getPresenter() {
            return null;
        }
        
        public final void setPresenter(@org.jetbrains.annotations.NotNull()
        com.codingnation.textlocal.ui.sendotp.SendOtpImpl p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSelectedContact() {
            return null;
        }
        
        public final void setSelectedContact(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}