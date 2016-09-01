package com.github.jianghw.font_size;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/8/11 0011</br>
 * description:</br>
 */
public class App extends Application {


    private  static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = this;
    }

    public static Context getContext() {

        return mContext;
    }

}
