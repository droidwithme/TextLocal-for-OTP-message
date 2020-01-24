package com.codingnation.textlocal.ui.spalsh


import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.codingnation.textlocal.base.BaseFragment
import com.codingnation.textlocal.ui.home.HostFragment
import com.codingnation.textlocal.utils.Utils
import kotlinx.android.synthetic.main.splash.*


internal var TAG = SplashFragment::class.java.simpleName

class SplashFragment : BaseFragment() {

    lateinit var ctx: Context

    override val layout: Int
        get() {
            Utils.logD(TAG, "getLayout()")
            return com.codingnation.textlocal.R.layout.splash
        }

    override fun onStart() {
        super.onStart()
        Utils.logD(TAG, "onStart()")

    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        ctx = activity
        Utils.logD(TAG, "onViewCreated()")
        gotoLogin()

    }

    private fun gotoLogin() {
        Handler().postDelayed({
            val animSlide = AnimationUtils.loadAnimation(context,
                    com.codingnation.textlocal.R.anim.slide)
            imageViewLogo.startAnimation(animSlide)
            animSlide.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation) {
                    imageViewLogo.visibility = View.VISIBLE
                }

                override fun onAnimationEnd(animation: Animation) {
                    imageViewLogo.visibility = View.INVISIBLE
                    navigationPresenter!!.setFragment(HostFragment().getHostFragment())
                }

                override fun onAnimationRepeat(animation: Animation) {

                }
            })
        }, 1000)
    }
}
