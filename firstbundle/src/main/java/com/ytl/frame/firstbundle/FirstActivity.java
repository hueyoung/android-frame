package com.ytl.frame.firstbundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    // 加载远程bundle
    public void loadRemoteBundle(View v) {
        Intent intent = new Intent();
        intent.setClassName(this, "com.ytl.frame.remotebundle.MainActivity");
        startActivity(intent);
        finish();
        overridePendingTransition(-1,android.R.anim.slide_out_right);
    }
}
