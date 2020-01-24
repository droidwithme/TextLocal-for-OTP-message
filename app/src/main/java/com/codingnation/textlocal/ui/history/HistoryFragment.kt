package com.codingnation.textlocal.ui.history

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.codingnation.textlocal.R
import com.codingnation.textlocal.base.BaseFragment
import com.codingnation.textlocal.base.MainActivity
import com.codingnation.textlocal.ui.sendotp.SendOtpQ
import com.codingnation.textlocal.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_contacts.*


internal var TAG = HistoryFragment::class.java.simpleName

class HistoryFragment : BaseFragment(), SentOtpView {

    private var ctx: Context? = null

    companion object {
        lateinit var presenter: SentOtpImpl
    }

    override val layout: Int
        get() {
            Utils.logD(TAG, "getLayout()")
            return R.layout.fragment_contacts
        }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        ctx = activity
        presenter = SentOtpImpl(this)
        setUpToolbar()
        presenter.getHistory()

    }

    private fun setUpToolbar() {
        (activity as MainActivity).toolbar.visibility = View.VISIBLE
        (activity as MainActivity).appbarLayout.visibility = View.VISIBLE
        (activity as MainActivity).setTitle(R.string.home_title)
    }


    override fun showProgress() {
        Utils.logD(TAG, "showProgress()")
        showProgressBar()

    }

    override fun hideProgress() {
        Utils.logD(TAG, "hideProgress()")
        hideProgressBar()
    }

    override fun renderData(history: List<SendOtpQ>) {
        Utils.logD(TAG, "renderData($history)")
        recyclerView!!.layoutManager = LinearLayoutManager(context)
        recyclerView!!.addItemDecoration(DividerItemDecoration(context!!, LinearLayoutManager.VERTICAL))
        recyclerView!!.adapter = AdapterMsg(history)
    }

    override fun showError(errMsg: String) {
        Toast.makeText(context, "Error: $errMsg", Toast.LENGTH_LONG).show()
    }

    fun getHistoryFragment(): HistoryFragment {
        return HistoryFragment()
    }


}
