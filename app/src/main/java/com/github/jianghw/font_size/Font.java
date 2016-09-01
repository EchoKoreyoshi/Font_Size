package com.github.jianghw.font_size;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/8/11 0011</br>
 * description:</br>
 */
public class Font extends BaseActivity {

    private Button mBt_1;
    private Button mBt_2;
    private Button mBt_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.font);

        mBt_1 = (Button) findViewById(R.id.bt_1);
        mBt_2 = (Button) findViewById(R.id.bt_2);
        mBt_3 = (Button) findViewById(R.id.bt_3);


        init();
    }

    private void init() {
        mBt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedUtils.setInteger(getApplicationContext(), "Theme_Font", 3);
                finish();
                startActivity(new Intent(Font.this, MainActivity.class));
            }
        });
        mBt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedUtils.setInteger(getApplicationContext(), "Theme_Font", 2);
                finish();
                startActivity(new Intent(Font.this, MainActivity.class));
            }
        });
        mBt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedUtils.setInteger(getApplicationContext(), "Theme_Font", 1);
                finish();
                startActivity(new Intent(Font.this, MainActivity.class));
            }
        });

    }


}
