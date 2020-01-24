package com.codingnation.textlocal.base

import android.app.Dialog
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import com.codingnation.textlocal.R
import com.codingnation.textlocal.utils.Utils
import java.util.*



abstract class BaseFragment : Fragment(), MainNavigationContract.View {

    internal var TAG = BaseFragment::class.java.simpleName
    private var mDialog: Dialog? = null

    protected abstract val layout: Int


    override fun onStart() {
        super.onStart()
        Utils.logD(TAG, "onStart()")
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(layout, container, false)
        Utils.logD(TAG, "onCreateView()")
        createProgressBar()
        return view

    }

    override fun onResume() {
        super.onResume()
        Utils.logD(TAG, "onResume()")
    }

    override fun attachPresenter(presenter: MainNavigationContract.Presenter) {
        Utils.logD(TAG, "onAttachePresenter()")
        navigationPresenter = presenter
    }

    override fun onPause() {
        Utils.logD(TAG, "onPause")
        super.onPause()
    }

    fun showProgressBar() {
        mDialog!!.show()
        Utils.logD(TAG, "showProgressBar()")
    }

    private fun createProgressBar() {
        Utils.logD(TAG, "createProgressBar()")
        mDialog = Dialog(activity)
        mDialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        mDialog!!.setContentView(R.layout.view_progressbar)
        mDialog!!.findViewById<View>(R.id.progress_bar).visibility = View.VISIBLE
        Objects.requireNonNull(mDialog!!.window).setBackgroundDrawable(ColorDrawable(android.graphics.Color.TRANSPARENT))
        mDialog!!.setCancelable(true)
        mDialog!!.setCanceledOnTouchOutside(true)
    }

    fun hideProgressBar() {
        if (mDialog != null) {
            mDialog!!.dismiss()
        }
        Utils.logD(TAG, "hideProgressBar()")
    }

    companion object {
        var navigationPresenter: MainNavigationContract.Presenter? = null
    }


}