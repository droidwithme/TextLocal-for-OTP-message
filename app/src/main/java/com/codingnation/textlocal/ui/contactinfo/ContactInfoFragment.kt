package com.codingnation.textlocal.ui.contactinfo

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.codingnation.textlocal.R
import com.codingnation.textlocal.base.BaseFragment
import com.codingnation.textlocal.base.MainActivity
import com.codingnation.textlocal.ui.contactlist.Contacts
import com.codingnation.textlocal.ui.sendotp.SendOtpFragment
import com.codingnation.textlocal.utils.Utils
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_contact_info.*


internal var TAG = ContactInfoFragment::class.java.simpleName

class ContactInfoFragment : BaseFragment(), ContactInfoView {

    private var ctx: Context? = null

    companion object {
        lateinit var presenter: ContactInfoImpl
        lateinit var selectedContact: Contacts

    }


    fun getContactInfoFragment(contact: Contacts): ContactInfoFragment {
        val contactInfoFragment = ContactInfoFragment()
        selectedContact = contact
        return contactInfoFragment
    }

    override val layout: Int
        get() {
            Utils.logD(TAG, "getLayout()")
            return R.layout.fragment_contact_info
        }


    override fun onStart() {
        super.onStart()
        setUpToolbar()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        ctx = activity
        presenter = ContactInfoImpl(this)
        setData()
        setListener()

    }

    private fun setUpToolbar() {
        (activity as MainActivity).appbarLayout.visibility = View.VISIBLE
        (activity as MainActivity).toolbar.visibility = View.VISIBLE
        (activity as MainActivity).supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        (activity as MainActivity).supportActionBar!!.setDisplayShowHomeEnabled(true)
        (activity as MainActivity).setTitle(getString(R.string.title_contact_info))
    }

    @SuppressLint("SetTextI18n")
    private fun setData() {
        Picasso.with(context)
                .load(selectedContact.imageUrl)
                .resize(120, 120).noFade().into(profile_image)
        tvDescription.text = selectedContact.description
        tvName.text = selectedContact.firstName + " " + selectedContact.lastName
        tvPhoneNumber.text = selectedContact.phoneNumber
    }

    private fun setListener() {
        btnSendMessage.setOnClickListener { presenter.sendOTP(selectedContact.phoneNumber) }
    }


    override fun showProgress() {
        Utils.logD(TAG, "showProgress()")
        showProgressBar()

    }

    override fun hideProgress() {
        Utils.logD(TAG, "hideProgress()")
        hideProgressBar()
    }

    override fun renderData(string: String) {
        Utils.logD(TAG, "renderData($string)")

    }

    override fun showError(errMsg: String) {
        Toast.makeText(context, "Error: $errMsg", Toast.LENGTH_LONG).show()
    }


    override fun gotoMsgScreen() {
        navigationPresenter!!.setFragment(SendOtpFragment().getOtpFragment(selectedContact.phoneNumber, selectedContact.firstName!! + " " + selectedContact.lastName))
    }

}
