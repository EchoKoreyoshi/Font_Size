package com.github.jianghw.font_size;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

/**
 * Created by Administrator on 2016/8/11 0011</br>
 * description:</br>
 */
public class BaseActivity extends FragmentActivity {

    @Override
    public void setContentView(int layoutResID) {

        int mode = SharedUtils.getInteger(getApplicationContext(), "Theme_Font", -1);
        Log.i("FontSize", mode + "---------");

        if (mode == 1) {
            this.setTheme(R.style.Theme_Small);
        } else if (mode == -1 || mode == 2) {
            this.setTheme(R.style.Theme_Medium);
        } else if (mode == 3) {
            this.setTheme(R.style.Theme_Large);
        }
        super.setContentView(layoutResID);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


}
