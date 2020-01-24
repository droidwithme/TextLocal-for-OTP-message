package com.codingnation.textlocal.ui.sendotp

import com.google.gson.annotations.SerializedName

data class SendOtpR(val response: String, val errors: List<Errors>, val status: String)

data class Errors(
        @SerializedName("code") val code: Int,
        @SerializedName("message") val message: String
)