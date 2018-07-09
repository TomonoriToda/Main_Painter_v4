package com.example.tomon.main_painter_v1.map;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tomon.main_painter_v1.R;

public class Main301Activity extends AppCompatActivity implements View.OnClickListener {

    Button b3;
    ImageView a_system, a_kokusai,getkokusai;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("301教室");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main301);
        b3 = (Button)findViewById(R.id.buttonf3);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == b3) {
            Intent i = new Intent(this,Main3Activity.class);
            startActivity(i);
        }

    }


}