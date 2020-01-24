package com.codingnation.textlocal.base

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.codingnation.textlocal.R
import com.codingnation.textlocal.ui.home.HostFragment
import com.codingnation.textlocal.ui.spalsh.SplashFragment
import com.codingnation.textlocal.utils.Utils
import kotlinx.android.synthetic.main.view_toolbar.*


class MainActivity : AppCompatActivity(), MainView {


    var TAG: String = MainActivity::class.java.simpleName
    private lateinit var basePresenter: MainPresenterImpl

    private lateinit var fragmentManager: FragmentManager
    private var fragmentTransaction: FragmentTransaction? = null
    private var doubleBackToExitPressedOnce = false


    lateinit var context: Context


    public override fun onResume() {
        super.onResume()
        Utils.logD(TAG, "onResume()")

    }

    public override fun onPause() {
        super.onPause()
        Utils.logD(TAG, "onPause()")
    }

    public override fun onStop() {
        super.onStop()
        Utils.logD(TAG, "onStop()")
    }

    public override fun onDestroy() {
        super.onDestroy()
        Utils.logD(TAG, "onDestroy()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.logD(TAG, "onCreate()")
        context = this
        setContentView(R.layout.activity_main)
        setToolbar()
        basePresenter = MainPresenterImpl(this)
        basePresenter.setFragment(SplashFragment())

    }

    private fun setToolbar() {
        Utils.logD(TAG, "setToolbar()")
        setSupportActionBar(toolbar)
        supportActionBar!!.title = null
        setTitle(getString(R.string.home_title))
    }

     fun setTitle(title: String) {
         Utils.logD(TAG, "setTitle($title)")
        toolbar_title.text = title
    }


    @SuppressLint("CommitTransaction")
    override fun setFragment(fragment: BaseFragment) {
        val handler = Handler()
        handler.postDelayed({
            fragment.attachPresenter(basePresenter)
            fragmentManager = supportFragmentManager
            fragmentTransaction = fragmentManager.run { beginTransaction() }
            fragmentTransaction!!.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left,
                    R.anim.enter_from_left, R.anim.exit_to_right)
            fragmentTransaction!!.replace(R.id.fragment_container, fragment, fragment.javaClass.simpleName)
            fragmentTransaction!!.addToBackStack(null)
            try {
                fragmentTransaction!!.commit()
            } catch (ignored: IllegalStateException) {

            }
        }, 400)
        Utils.logD(TAG, "@setFragment(" + fragment.TAG + ")")

    }


    override fun onBackPressed() {
        Utils.logD(TAG, "onBackPressed")
        val fragment = fragmentManager.findFragmentById(R.id.fragment_container)
        if (fragment is HostFragment) {

            if (doubleBackToExitPressedOnce) {
                Utils.logD(TAG, "doublebackExitPressedOnce = true")
                this.finish()
            } else {
                Utils.logD(TAG, "doublebackExitPressedOnce = false")
                this.doubleBackToExitPressedOnce = true
                Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()
                Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
            }

        } else {
            Utils.logD(TAG, "No above fragment, new fragment")
            fragmentManager.popBackStack()
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
