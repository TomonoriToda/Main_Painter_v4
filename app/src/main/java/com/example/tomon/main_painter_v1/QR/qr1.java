package com.example.tomon.main_painter_v1.QR;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tomon.main_painter_v1.R;

public class qr1 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr1);

        Button ans_1 = findViewById(R.id.ans_1);

        btClick lis = new btClick();

        ans_1.setOnClickListener(lis);
        Button ans_2 = findViewById(R.id.ans_2);
        ans_2.setOnClickListener(lis);
        Button ans_3 = findViewById(R.id.ans_3);
        ans_3.setOnClickListener(lis);
        Button ans_4 = findViewById(R.id.ans_4);
        ans_4.setOnClickListener(lis);
    }

    private class btClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            int id = v.getId();
            Intent quiz = new Intent(qr1.this, qr1_ans.class);
            switch (id) {
                case R.id.ans_3:
                    startActivity(quiz);
                    break;
                case R.id.ans_2:
                    Toast.makeText(qr1.this, R.string.ng, Toast.LENGTH_SHORT).show();
                    startActivity(quiz);
                    break;
                case R.id.ans_1:
                    Toast.makeText(qr1.this, R.string.ng, Toast.LENGTH_SHORT).show();
                    startActivity(quiz);
                    break;
                case R.id.ans_4:
                    Toast.makeText(qr1.this, R.string.ng, Toast.LENGTH_SHORT).show();
                    startActivity(quiz);
                    break;
            }
        }
    }
}