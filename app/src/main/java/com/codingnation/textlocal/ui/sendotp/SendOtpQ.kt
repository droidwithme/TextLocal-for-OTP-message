package com.codingnation.textlocal.ui.sendotp

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class SendOtpQ(
        @PrimaryKey
        var id: Int = 0,
        var numbers: String = "",
        var message: String = "",
        var sender: String = "",
        var apikey: String = "",
        var time: String = "",
        var name: String = ""
) : RealmObject() {

}