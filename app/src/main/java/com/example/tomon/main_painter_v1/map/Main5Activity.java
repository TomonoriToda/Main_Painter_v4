package com.example.tomon.main_painter_v1.map;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.R;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {

    Button b4,bb;
    Button a501, a502, a503;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("校内地図");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(this);
        a501 = (Button) findViewById(R.id.kyousitu501);
        a501.setOnClickListener(this);
        a502 = (Button) findViewById(R.id.kyousitu502);
        a502.setOnClickListener(this);

        bb = (Button)findViewById(R.id.buttonm);
        bb.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == b4) {
            Intent i = new Intent(this, Main4Activity.class);
            startActivity(i);
        }
        if (v == a501) {
            Intent i = new Intent(this, Main501Activity.class);
            startActivity(i);
        }
        if (v == a502) {
            Intent i = new Intent(this, Main502Activity.class);
            startActivity(i);
        }

        if(v == bb) {
            Intent j = new Intent(this, Map_main.class);
            startActivity(j);
        }




    }
}