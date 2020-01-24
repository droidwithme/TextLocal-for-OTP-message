package com.codingnation.textlocal.ui.contactinfo


import com.codingnation.textlocal.base.BaseView

interface ContactInfoView : BaseView {

    fun renderData(string: String)
    fun gotoMsgScreen()

}
