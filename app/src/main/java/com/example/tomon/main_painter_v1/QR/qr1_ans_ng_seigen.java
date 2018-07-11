package com.example.tomon.main_painter_v1.QR;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.MainScreen.main_top;
import com.example.tomon.main_painter_v1.R;

public class qr1_ans_ng_seigen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seigen);


        Button home = findViewById(R.id.button_home_seigen);
        Button QR = findViewById(R.id.button_back_QR);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(qr1_ans_ng_seigen.this,main_top.class);
                startActivity(intent);
            }
        });

        QR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(qr1_ans_ng_seigen.this,QrCodeReader.class);
                startActivity(intent);
            }
        });


    }
}
