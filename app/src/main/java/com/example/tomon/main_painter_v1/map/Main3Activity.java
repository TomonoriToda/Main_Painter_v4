package com.example.tomon.main_painter_v1.map;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.R;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    Button b2,b4,bb,b301,b302,b305;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("校内地図");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main3);
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);
        b301 = (Button)findViewById(R.id.kyousitu301);
        b301.setOnClickListener(this);
        b302 = (Button)findViewById(R.id.kyousitu302);
        b302.setOnClickListener(this);
        b305 = (Button)findViewById(R.id.kyousitu_305);
        b305.setOnClickListener(this);



        bb = (Button)findViewById(R.id.buttonm);
        bb.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == b2) {
            Intent i = new Intent(this,Main2Activity.class);
            startActivity(i);
        }
        if(v == b4){
            Intent i = new Intent(this,Main4Activity.class);
            startActivity(i);
        }

        if(v == bb) {
            Intent j = new Intent(this, Map_main.class);
            startActivity(j);
        }
        if (v == b301){
            Intent j = new Intent(this,Main301Activity.class);
            startActivity(j);
        }
        if (v == b302){
            Intent j = new Intent(this, Main302Activity.class);
            startActivity(j);
        }
        if (v == b305){
            Intent j = new Intent(this, Main305Activity.class);
            startActivity(j);
        }

    }

}

