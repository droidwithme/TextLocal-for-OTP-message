package com.codingnation.textlocal.utils

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import android.widget.Toast

import com.codingnation.textlocal.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder

import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.Random

/**
 * Created by dr on 25/10/18.
 * On ShoingFest
 */
object Utils {

    val currentDate: String
        get() {
            val c = Calendar.getInstance().time
            val df = SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
            return df.format(c)
        }

    val gson: Gson
        get() {
            val gsonBuilder = GsonBuilder()
            return gsonBuilder.create()
        }

    fun logD(tag: String, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, msg)
        }
    }

    fun showProgress(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    fun isNetworkOk(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val netInfo = cm.activeNetworkInfo
        return netInfo != null && netInfo.isConnectedOrConnecting
    }

    fun getColor(): String {
        val colorList = ArrayList<String>()
        colorList.add("#7b1fa2")
        colorList.add("#303f9f")
        colorList.add("#1976d2")
        colorList.add("#0097a7")
        colorList.add("#00796b")
        colorList.add("#388e3c")
        colorList.add("#f57c00")

        val rnd = Random().nextInt(colorList.size)
        return colorList[rnd]


    }


}
