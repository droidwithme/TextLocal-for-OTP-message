package com.codingnation.textlocal.base

/**
 * Created by dr on 25/10/18.
 * On ShoingFest
 */
interface BaseView {
    fun showProgress()
    fun hideProgress()
    fun showError(errMsg: String)
}
