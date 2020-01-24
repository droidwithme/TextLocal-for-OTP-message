package com.codingnation.textlocal.ui.contactlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0017J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/codingnation/textlocal/ui/contactlist/AdapterContacts;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/codingnation/textlocal/ui/contactlist/AdapterContacts$ReqViewHolder;", "contactListR", "", "Lcom/codingnation/textlocal/ui/contactlist/Contacts;", "contactSelectListner", "Lcom/codingnation/textlocal/ui/contactlist/ContactSelectListner;", "(Ljava/util/List;Lcom/codingnation/textlocal/ui/contactlist/ContactSelectListner;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ReqViewHolder", "app_debug"})
public final class AdapterContacts extends android.support.v7.widget.RecyclerView.Adapter<com.codingnation.textlocal.ui.contactlist.AdapterContacts.ReqViewHolder> {
    private final java.util.List<com.codingnation.textlocal.ui.contactlist.Contacts> contactListR = null;
    private final com.codingnation.textlocal.ui.contactlist.ContactSelectListner contactSelectListner = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codingnation.textlocal.ui.contactlist.AdapterContacts.ReqViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.codingnation.textlocal.ui.contactlist.AdapterContacts.ReqViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public AdapterContacts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.codingnation.textlocal.ui.contactlist.Contacts> contactListR, @org.jetbrains.annotations.NotNull()
    com.codingnation.textlocal.ui.contactlist.ContactSelectListner contactSelectListner) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/codingnation/textlocal/ui/contactlist/AdapterContacts$ReqViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/codingnation/textlocal/ui/contactlist/AdapterContacts;Landroid/view/View;)V", "tvIcon", "Landroid/widget/TextView;", "getTvIcon", "()Landroid/widget/TextView;", "tvInfo", "getTvInfo", "tvName", "getTvName", "tvPhoneNumber", "getTvPhoneNumber", "app_debug"})
    public final class ReqViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvInfo = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvPhoneNumber = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvPhoneNumber() {
            return null;
        }
        
        public ReqViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}