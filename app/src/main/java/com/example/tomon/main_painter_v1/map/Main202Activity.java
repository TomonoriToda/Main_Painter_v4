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

public class Main202Activity extends AppCompatActivity implements View.OnClickListener {

    Button b2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("202教室");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main202);
        b2 = (Button)findViewById(R.id.buttonf2);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == b2) {
            Intent i = new Intent(this, Main2Activity.class);
            startActivity(i);
        }


    }


}
