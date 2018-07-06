package com.example.tomon.main_painter_v1.QR;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.MainScreen.main;
import com.example.tomon.main_painter_v1.R;

public class qr1_ans extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr1_ans);
        Button button = findViewById(R.id.button);
        btClick lis = new btClick();
        button.setOnClickListener(lis);

    }

    private class btClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent quiz = new Intent(qr1_ans.this,main.class);
            quiz.putExtra("kye",1);
            startActivity(quiz);

        }
    }




}
