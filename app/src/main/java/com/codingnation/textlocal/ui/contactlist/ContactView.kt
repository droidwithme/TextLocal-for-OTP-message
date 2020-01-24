package com.codingnation.textlocal.ui.contactlist


import com.codingnation.textlocal.base.BaseView

interface ContactView : BaseView {

    fun renderData(contacts: ContactListR)

}
