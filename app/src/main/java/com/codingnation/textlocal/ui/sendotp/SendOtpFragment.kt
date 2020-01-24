package com.codingnation.textlocal.ui.sendotp

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.codingnation.textlocal.R
import com.codingnation.textlocal.base.BaseFragment
import com.codingnation.textlocal.base.MainActivity
import com.codingnation.textlocal.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_send_msg.*
import java.util.*


internal var TAG = SendOtpFragment::class.java.simpleName

class SendOtpFragment : BaseFragment(), SendOtpView {
    private var ctx: Context? = null


    fun getOtpFragment(contact: String, namel: String): SendOtpFragment {
        Utils.logD(TAG, "getOtpFragment()")
        val contactInfoFragment = SendOtpFragment()
        selectedContact = contact
        name = namel
        return contactInfoFragment
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var presenter: SendOtpImpl
        lateinit var selectedContact: String
        lateinit var name: String

    }

    override val layout: Int
        get() {
            Utils.logD(TAG, "getLayout()")
            return R.layout.fragment_send_msg
        }


    override fun onStart() {
        super.onStart()
        Utils.logD(TAG, "onStart()")
        setUpToolbar()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        ctx = activity
        Utils.logD(TAG, "onViewCreated()")
        presenter = SendOtpImpl(this, activity)
        setToPhoneNumber()
        setClickListener()
    }


    private fun setUpToolbar() {
        Utils.logD(TAG, "setUpToolbar()")
        (activity as MainActivity).appbarLayout.visibility = View.VISIBLE
        (activity as MainActivity).toolbar.visibility = View.VISIBLE
        (activity as MainActivity).supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        (activity as MainActivity).supportActionBar!!.setDisplayShowHomeEnabled(true)
        (activity as MainActivity).setTitle(getString(R.string.title_send_msg))
    }

    private fun setToPhoneNumber() {
        Utils.logD(TAG, "setToPhoneNumber()")
        tvToPhone.text = selectedContact
    }

    private fun setClickListener() {
        Utils.logD(TAG, "setClickListener()")
        btnSendMessage.setOnClickListener {
            val sms = et_msg.text.toString()
            val number = tvToPhone.text.toString()
            val c = Calendar.getInstance()
            val mseconds = c.get(Calendar.MILLISECOND)
            presenter.sendOTP(SendOtpQ(mseconds, number, sms, "", "", Utils.currentDate, name))

        }
    }

    override fun showProgress() {
        Utils.logD(TAG, "showProgress()")
        showProgressBar()

    }

    override fun hideProgress() {
        Utils.logD(TAG, "hideProgress()")
        hideProgressBar()
    }

    override fun renderData(response: String) {
        Toast.makeText(ctx, response, Toast.LENGTH_LONG).show()
        Utils.logD(TAG, "renderData($response)")
    }

    override fun showError(errMsg: String) {
        Toast.makeText(context, "Error: $errMsg", Toast.LENGTH_LONG).show()
    }


}
