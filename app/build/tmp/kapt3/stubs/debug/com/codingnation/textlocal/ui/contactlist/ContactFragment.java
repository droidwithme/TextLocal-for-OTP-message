package com.codingnation.textlocal.ui.contactlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u0000J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/codingnation/textlocal/ui/contactlist/ContactFragment;", "Lcom/codingnation/textlocal/base/BaseFragment;", "Lcom/codingnation/textlocal/ui/contactlist/ContactView;", "Lcom/codingnation/textlocal/ui/contactlist/ContactSelectListner;", "()V", "ctx", "Landroid/content/Context;", "layout", "", "getLayout", "()I", "getContactFragment", "hideProgress", "", "onContactSelected", "contact", "Lcom/codingnation/textlocal/ui/contactlist/Contacts;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "renderData", "contacts", "Lcom/codingnation/textlocal/ui/contactlist/ContactListR;", "setUpToolbar", "showError", "errMsg", "", "showProgress", "Companion", "app_debug"})
public final class ContactFragment extends com.codingnation.textlocal.base.BaseFragment implements com.codingnation.textlocal.ui.contactlist.ContactView, com.codingnation.textlocal.ui.contactlist.ContactSelectListner {
    private android.content.Context ctx;
    @org.jetbrains.annotations.NotNull()
    public static com.codingnation.textlocal.ui.contactlist.ContactImpl presenter;
    public static final com.codingnation.textlocal.ui.contactlist.ContactFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codingnation.textlocal.ui.contactlist.ContactFragment getContactFragment() {
        return null;
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
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String errMsg) {
    }
    
    @java.lang.Override()
    public void renderData(@org.jetbrains.annotations.NotNull()
    com.codingnation.textlocal.ui.contactlist.ContactListR contacts) {
    }
    
    @java.lang.Override()
    public void onContactSelected(@org.jetbrains.annotations.NotNull()
    com.codingnation.textlocal.ui.contactlist.Contacts contact) {
    }
    
    public ContactFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/codingnation/textlocal/ui/contactlist/ContactFragment$Companion;", "", "()V", "presenter", "Lcom/codingnation/textlocal/ui/contactlist/ContactImpl;", "getPresenter", "()Lcom/codingnation/textlocal/ui/contactlist/ContactImpl;", "setPresenter", "(Lcom/codingnation/textlocal/ui/contactlist/ContactImpl;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.codingnation.textlocal.ui.contactlist.ContactImpl getPresenter() {
            return null;
        }
        
        public final void setPresenter(@org.jetbrains.annotations.NotNull()
        com.codingnation.textlocal.ui.contactlist.ContactImpl p0) {
        }
        
        private Companion() {
            super();
        }
    }
}