package com.codingnation.textlocal.ui.contactlist

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.codingnation.textlocal.R
import com.codingnation.textlocal.base.BaseFragment
import com.codingnation.textlocal.base.MainActivity
import com.codingnation.textlocal.ui.contactinfo.ContactInfoFragment
import com.codingnation.textlocal.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_contacts.*


internal var TAG = ContactFragment::class.java.simpleName

class ContactFragment : BaseFragment(), ContactView, ContactSelectListner {

    companion object {
        lateinit var presenter: ContactImpl
    }

    private var ctx: Context? = null

    override val layout: Int
        get() {
            Utils.logD(TAG, "getLayout()")
            return R.layout.fragment_contacts
        }

    fun getContactFragment(): ContactFragment {
        return ContactFragment()
    }

    override fun onStart() {
        super.onStart()
        setUpToolbar()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        ctx = activity
        presenter = ContactImpl(this)
        presenter.getContacts()

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

    override fun showError(errMsg: String) {
        Toast.makeText(context, "Error: $errMsg", Toast.LENGTH_LONG).show()
    }

    override fun renderData(contacts: ContactListR) {
        Utils.logD(TAG, "renderData($contacts)")
        recyclerView!!.layoutManager = LinearLayoutManager(context)
        recyclerView!!.addItemDecoration(DividerItemDecoration(context!!, LinearLayoutManager.VERTICAL))
        recyclerView!!.adapter = AdapterContacts(contacts.contacts!!, this)
    }


    override fun onContactSelected(contact: Contacts) {
        Utils.logD(TAG, "onContactSelected $contact")
        navigationPresenter!!.setFragment(ContactInfoFragment().getContactInfoFragment(contact))
    }
}
