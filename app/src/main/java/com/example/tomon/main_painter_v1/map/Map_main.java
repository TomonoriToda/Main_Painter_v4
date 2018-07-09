package com.example.tomon.main_painter_v1.map;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.MainScreen.main;
import com.example.tomon.main_painter_v1.R;

public class Map_main extends AppCompatActivity implements View.OnClickListener{


    Button m1,m2,m3,m4,m5,m6,m7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymap_main);
        setTitle("行き先選択");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        m1 = (Button)findViewById(R.id.button01);
        m1.setOnClickListener(this);
        m2 = (Button)findViewById(R.id.button02);
        m2.setOnClickListener(this);
        m3 = (Button)findViewById(R.id.button03);
        m3.setOnClickListener(this);
        m4 = (Button)findViewById(R.id.button04);
        m4.setOnClickListener(this);
        m5 = (Button)findViewById(R.id.button05);
        m5.setOnClickListener(this);
        m6 = (Button)findViewById(R.id.button06);
        m6.setOnClickListener(this);
        m7 = (Button)findViewById(R.id.buttonhelp);
        m7.setOnClickListener(this);

        Button main_ = findViewById(R.id.button_ホームへ);
        main_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Map_main.this,main.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v){

        if(v == m1){
            Intent i = new Intent(this,Main1Activity.class);
            startActivity(i);
        }
        if(v == m2){
            Intent i = new Intent(this,Main2Activity.class);
            startActivity(i);
        }

        if(v == m3){
            Intent i = new Intent(this,Main3Activity.class);
            startActivity(i);
        }
        if(v == m4){
            Intent i = new Intent(this,Main4Activity.class);
            startActivity(i);
        }
        if(v == m5) {
            Intent i = new Intent(this, Main5Activity.class);
            startActivity(i);
        }
        if(v == m6) {
            Intent i = new Intent(this, MainHActivity.class);
            startActivity(i);
        }
        if(v == m7) {
            Intent i = new Intent(this, MainHelpActivity.class);
            startActivity(i);
        }


    }

}
