package com.codingnation.textlocal.base;

import com.codingnation.textlocal.utils.Utils;

public class MainPresenterImpl implements MainNavigationContract.Presenter, MainPresenter {
    String TAG = MainPresenterImpl.class.getSimpleName();
    private MainView view;

    public MainPresenterImpl(MainView view) {
        Utils.INSTANCE.logD(TAG, "MainPresenterImpl()");
        this.view = view;
    }


    @Override
    public void setFragment(BaseFragment baseFragment) {
        Utils.INSTANCE.logD(TAG, "setFragment("+baseFragment.getTag()+")");
        view.setFragment(baseFragment);
    }
}
