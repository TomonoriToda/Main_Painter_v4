package com.example.tomon.main_painter_v1.map;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.R;

public class Main1Activity extends AppCompatActivity implements View.OnClickListener{

    Button b2,h,bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        setTitle("校内地図");

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        h = (Button)findViewById(R.id.hoikutou);
        h.setOnClickListener(this);
        bb = (Button)findViewById(R.id.buttonm);
        bb.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        if(v == b2) {
            Intent j = new Intent(this, Main2Activity.class);
            startActivity(j);
        }
        if(v == h){
            Intent i = new Intent(this,MainHActivity.class);
            startActivity(i);
        }

        if(v == bb) {
            Intent j = new Intent(this,Map_main.class);
            startActivity(j);
        }
    }

}

