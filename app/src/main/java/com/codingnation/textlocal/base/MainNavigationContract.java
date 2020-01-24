package com.codingnation.textlocal.base;



public interface MainNavigationContract {

    interface Presenter {
        void setFragment(BaseFragment baseFragment);
    }

    interface View {
        void attachPresenter(MainNavigationContract.Presenter presenter);
    }
}
