package com.ytl.frame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goFirstAct(View v) {
        Intent intent = new Intent();
        intent.setClassName(getBaseContext(),"com.ytl.frame.firstbundle.FirstActivity");
        startActivity(intent);
        finish();
        overridePendingTransition(-1,android.R.anim.slide_out_right);
    }
}
