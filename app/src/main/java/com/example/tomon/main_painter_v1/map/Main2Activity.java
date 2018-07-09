package com.example.tomon.main_painter_v1.map;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tomon.main_painter_v1.R;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b3,bb;
    Button a201,a202,a203;
    ImageView a_game, a_business,getgame,getbusiness;
    boolean ga = false;

    @Override
    protected void onCreate( Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("校内地図");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
        a201=(Button)findViewById(R.id.kyousitu201);
        a201.setOnClickListener(this);
        a202=(Button)findViewById(R.id.kyousitu202);
        a202.setOnClickListener(this);
        a203=(Button)findViewById(R.id.kyousitu203);
        a203.setOnClickListener(this);
        a_game = (ImageView)findViewById(R.id.silhouette_game);
        a_business = (ImageView)findViewById(R.id.silhouette_business);
        getbusiness = (ImageView)findViewById(R.id.getbusiness);
        getgame = (ImageView)findViewById(R.id.getgame);

        bb = (Button)findViewById(R.id.buttonm);
        bb.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == b1) {
            Intent j = new Intent(this, Main1Activity.class);
            startActivity(j);
        }
        if (v == b3) {
            Intent i = new Intent(this, Main3Activity.class);
            startActivity(i);
        }

        if(v == a202){
            Intent i = new Intent(this,Main202Activity.class);
            startActivity(i);
        }

        if(v == a203){
            Intent i = new Intent(this,Main203Activity.class);
            startActivity(i);
        }

        if(v == bb) {
            Intent j = new Intent(Main2Activity.this,Map_main.class);
            startActivity(j);
        }
    }
}

