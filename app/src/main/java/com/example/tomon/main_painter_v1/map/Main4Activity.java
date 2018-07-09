package com.example.tomon.main_painter_v1.map;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.R;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener{

    Button b3,b5,bb;
    Button a402,a403;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("校内地図");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b5 = (Button)findViewById(R.id.button5);
        b5.setOnClickListener(this);

        a402=(Button)findViewById(R.id.kyousitu402);
        a402.setOnClickListener(this);
        a403=(Button)findViewById(R.id.kyousitu403);
        a403.setOnClickListener(this);

        bb = (Button)findViewById(R.id.buttonm);
        bb.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==b3){
            Intent i = new Intent(this,Main3Activity.class);
            startActivity(i);
        }
        if(v==b5){
            Intent i = new Intent(this,Main5Activity.class);
            startActivity(i);

        }
        if(v == a403){
            Intent i = new Intent(this,Main403Activity.class);
            startActivity(i);
        }
        if(v == a402){
            Intent i = new Intent(this,Main402Activity.class);
            startActivity(i);
        }

        if(v == bb) {
            Intent j = new Intent(this,Map_main.class);
            startActivity(j);
        }


    }
}
