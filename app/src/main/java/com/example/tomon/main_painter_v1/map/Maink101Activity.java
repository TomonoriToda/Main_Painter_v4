package com.example.tomon.main_painter_v1.map;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.R;

public class Maink101Activity extends AppCompatActivity implements View.OnClickListener {

    Button bh;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("K101教室");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_maink101);
        bh = (Button)findViewById(R.id.buttonfh);
        bh.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == bh) {
            Intent i = new Intent(this,MainHActivity.class);
            startActivity(i);
        }


    }


}

