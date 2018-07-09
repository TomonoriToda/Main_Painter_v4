package com.example.tomon.main_painter_v1.map;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.R;

public class Main305Activity extends AppCompatActivity implements View.OnClickListener {

    Button b3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("305教室");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main305);
        b3 = (Button)findViewById(R.id.buttonf3);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == b3) {
            Intent i = new Intent(this, Main3Activity.class);
            startActivity(i);
        }


    }


}


