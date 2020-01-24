package com.codingnation.textlocal.ui.history


import com.codingnation.textlocal.base.BaseView
import com.codingnation.textlocal.ui.sendotp.SendOtpQ

interface SentOtpView : BaseView {

    fun renderData(history: List<SendOtpQ>)

}
