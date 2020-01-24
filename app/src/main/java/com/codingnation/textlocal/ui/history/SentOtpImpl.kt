package com.codingnation.textlocal.ui.history

import com.codingnation.textlocal.ui.sendotp.SendOtpQ
import io.realm.Realm
import io.realm.Sort


class SentOtpImpl internal constructor(view: SentOtpView) : SentOtpPresenter {

    internal var TAG = SentOtpImpl::class.java.simpleName

    init {
        sentOtpView = view
    }

    companion object {
        private lateinit var sentOtpView: SentOtpView
    }


    override fun getHistory() {
        var realm: Realm? = null
        try {
            realm = Realm.getDefaultInstance()
            val realmResults = ArrayList(realm.where(SendOtpQ::class.java)
                    .sort("time", Sort.DESCENDING).findAll())
            sentOtpView.renderData(realmResults)

        } finally {
            realm?.close()
        }

    }


}
