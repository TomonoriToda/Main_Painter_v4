package com.example.tomon.main_painter_v1.map;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.R;

public class MainHActivity extends AppCompatActivity implements View.OnClickListener {

    Button hk, backh,hoiku;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main99);
        setTitle("保育棟");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        hk = (Button)findViewById(R.id.honkousya);
        hk.setOnClickListener(this);
        backh = (Button)findViewById(R.id.button99);
        backh.setOnClickListener(this);
        hoiku = (Button)findViewById(R.id.hoikutou);
        hoiku.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == hk) {
            Intent j = new Intent(this, Main1Activity.class);
            startActivity(j);
        }
        if (v == backh) {
            Intent j = new Intent(this, Map_main.class);
            startActivity(j);
        }
        if (v == hoiku) {
            Intent j = new Intent(this,Maink101Activity.class);
            startActivity(j);
        }
    }


}