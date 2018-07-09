package com.example.tomon.main_painter_v1.map;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.R;

public class MainHelpActivity  extends AppCompatActivity implements View.OnClickListener {

    Button mb,sec;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainhelp);
        setTitle("ヘルプ画面");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        mb = (Button)findViewById(R.id.buttonback);
        mb.setOnClickListener(this);
        //sec = (Button)findViewById(R.id.buttonback);
        //sec.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == mb) {
            Intent j = new Intent(this, Map_main.class);
            startActivity(j);
        }
        if (v == sec) {
            //Intent j = new Intent(this, MainSecActivity.class);
            //startActivity(j);
        }

    }


}