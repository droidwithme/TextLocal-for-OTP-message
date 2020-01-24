package com.codingnation.textlocal.ui.contactinfo


class ContactInfoImpl internal constructor(view: ContactInfoView) : ContactInfoPresenter {


    internal var TAG = ContactInfoImpl::class.java.simpleName


    init {
        contactInfoView = view
    }

    companion object {
        private lateinit var contactInfoView: ContactInfoView
    }

    override fun sendOTP(contact: String) {
        contactInfoView.gotoMsgScreen()
    }

}
