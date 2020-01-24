package com.codingnation.textlocal.ui.sendotp

import android.annotation.SuppressLint
import android.content.Context
import com.codingnation.textlocal.data.APIClient
import com.codingnation.textlocal.data.APIInterface
import com.codingnation.textlocal.utils.Utils
import io.realm.Realm
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class SendOtpImpl internal constructor(view: SendOtpView, ctx: Context) : SendOtpPresenter {
    var TAG = SendOtpImpl::class.java.simpleName

    init {
        sendOtpView = view
        context = ctx
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        private lateinit var context: Context
        private lateinit var sendOtpView: SendOtpView
    }

    override fun sendOTP(sendOtpQ: SendOtpQ) {
        Utils.logD(TAG, "sendOTP($sendOtpQ)")
        saveUserEntry(sendOtpQ)
        sendOtpQ.sender = "TXTLCL"
        sendOtpQ.apikey = "YOUR API KEY"
        Utils.logD(TAG, "requestToServer()")
        sendOtpView.showProgress()
        val hashMap: HashMap<String, String> = HashMap(4)
        hashMap["numbers"] = sendOtpQ.numbers
        hashMap["apikey"] = "YOUR API KEY"
        hashMap["sender"] = "TXTLCL"
        hashMap["message"] = sendOtpQ.message
        if (Utils.isNetworkOk(context)) {
            val apiService = APIClient.getRetrofit().create(APIInterface::class.java)

            val call = apiService.getOTP(hashMap)

            call.enqueue(object : Callback<SendOtpR> {
                override fun onResponse(call: Call<SendOtpR>, response: Response<SendOtpR>) {
                    Utils.logD(TAG, "onResponse($response)")
                    sendOtpView.hideProgress()
                    if (response.isSuccessful) {
                        if (response.body()!!.status == "success") {
                            saveUserEntry(sendOtpQ)
                            sendOtpView.renderData("Otp has been sent to your number")
                        } else {
                            sendOtpView.showError(response.body()!!.errors[0].message)
                        }
                    } else {
                        try {
                            val jsonObject = JSONObject(response.errorBody()!!.string())
                            sendOtpView.showError(jsonObject.optString("message"))
                        } catch (e: JSONException) {
                            e.printStackTrace()
                        } catch (e: IOException) {
                            e.printStackTrace()
                        }

                    }

                }

                override fun onFailure(call: Call<SendOtpR>, t: Throwable) {
                    Utils.logD(TAG, "onFailure($t)")
                    sendOtpView.hideProgress()
                    sendOtpView.showError(t.message!!)
                }
            })
        } else {
            sendOtpView.hideProgress()
            sendOtpView.showError("No network, please try again.")
        }


    }

    private fun saveUserEntry(sendOtpQ: SendOtpQ) {
        Utils.logD(TAG, "saveUserEntry($sendOtpQ)")
        sendOtpQ.time = Utils.currentDate
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction { realm ->
            realm.insertOrUpdate(sendOtpQ)
        }
        realm.use { realm ->
            //realm = Realm.getDefaultInstance()
            val realmResults = ArrayList(realm.where(SendOtpQ::class.java).findAll())
            Utils.logD(TAG, realmResults[0].message)
        }
    }

}
