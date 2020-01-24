package com.codingnation.textlocal.data;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by dr on 22/01/18.
 * on Dagger
 */

public class MyApplication extends Application {
    public static MyApplication mInstance;
    public static Realm realm;

    public MyApplication() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        Realm.deleteRealm(config);
        Realm.setDefaultConfiguration(config);
        realm = Realm.getDefaultInstance();

    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
}
