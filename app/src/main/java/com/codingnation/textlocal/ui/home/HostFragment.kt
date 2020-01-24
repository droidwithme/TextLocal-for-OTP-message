package com.codingnation.textlocal.ui.home

import android.content.Context
import android.os.Bundle
import android.view.View
import com.codingnation.textlocal.R
import com.codingnation.textlocal.base.BaseFragment
import com.codingnation.textlocal.base.MainActivity
import com.codingnation.textlocal.ui.contactlist.ContactFragment
import com.codingnation.textlocal.ui.history.HistoryFragment
import com.codingnation.textlocal.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_host.*


internal var TAG = HostFragment::class.java.simpleName

class HostFragment : BaseFragment() {

    private var ctx: Context? = null

    fun getHostFragment(): HostFragment {
        return HostFragment()
    }

    override val layout: Int
        get() {
            Utils.logD(TAG, "getLayout()")
            return R.layout.fragment_host
        }

    override fun onStart() {
        super.onStart()
        setUpToolbar()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        ctx = activity

        val adapter = HostAdapter(childFragmentManager)
        adapter.addFragment(ContactFragment().getContactFragment(), "My Contacts")
        adapter.addFragment(HistoryFragment().getHistoryFragment(), "My History")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

    }

    private fun setUpToolbar() {
        (activity as MainActivity).appbarLayout.visibility = View.VISIBLE
        (activity as MainActivity).toolbar.visibility = View.VISIBLE
        (activity as MainActivity).supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        (activity as MainActivity).supportActionBar!!.setDisplayShowHomeEnabled(false)
        (activity as MainActivity).setTitle(getString(R.string.home_title))
    }
}
