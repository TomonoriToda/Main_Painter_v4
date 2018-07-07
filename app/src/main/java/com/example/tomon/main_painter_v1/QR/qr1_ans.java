package com.example.tomon.main_painter_v1.QR;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.R;

public class qr1_ans extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr1_ans);

        Intent intent = getIntent();
        final String question_number = intent.getStringExtra("question");


        Button button = findViewById(R.id.button_home);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent quiz = new Intent(qr1_ans.this,stamp.class);
               quiz.putExtra("question",question_number);
               startActivity(quiz);
           }
       });

    }
}
