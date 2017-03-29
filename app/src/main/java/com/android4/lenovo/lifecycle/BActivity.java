package com.android4.lenovo.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2017/3/29.
 */

public class BActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("LYQ","这是B页面的onCreate方法");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bactivity);

        Button bt1= (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button bt2= (Button) findViewById(R.id.button2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.e("LYQ","这是B页面的onStart方法");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("LYQ","这是B页面的onResume方法");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("LYQ","这是B页面的onPause方法");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("LYQ","这是B页面的onStop方法");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("LYQ","这是B页面的onDestroy方法");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.e("LYQ","这是B页面的onRestart方法");
        super.onRestart();
    }
}
