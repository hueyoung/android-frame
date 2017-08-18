package com.ytl.frame.splashbundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ytl.frame.splashbundle.R;

public class SplashAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);
    }

    public void skip(View v) {
        Intent intent = new Intent();
        intent.setClassName(getBaseContext(),"com.ytl.frame.MainActivity");
        startActivity(intent);
        finish();
        overridePendingTransition(-1,android.R.anim.slide_out_right);
    }
}
