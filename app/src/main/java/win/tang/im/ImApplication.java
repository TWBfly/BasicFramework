package win.tang.im;


import android.content.Context;

import com.facebook.stetho.Stetho;
import com.zhouyou.http.EasyHttp;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import win.tang.im.base.dagger.DaggerAppComponent;

/**
 * Created by Tang on 2018/2/9
 */

public class ImApplication extends DaggerApplication {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        //初始化Stetho
        Stetho.initializeWithDefaults(this);
        //初始化 rxeasyhttp
        EasyHttp.init(this);
    }

    public static Context getContext() {
        return mContext;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
