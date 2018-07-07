package com.example.tomon.main_painter_v1.QR;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tomon.main_painter_v1.R;

public class qr1 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr1);

        Button ans1 = findViewById(R.id.ans_1);
        Button ans2 = findViewById(R.id.ans_2);
        Button ans3 = findViewById(R.id.ans_3);
        Button ans4 = findViewById(R.id.ans_4);



        Intent intent = getIntent();
        String Qestion_number = intent.getStringExtra("Question");
        String title = intent.getStringExtra("Q");
        String A1 = intent.getStringExtra("1");
        String A2 = intent.getStringExtra("2");
        String A3 = intent.getStringExtra("3");
        String A4 = intent.getStringExtra("4");


        //Intentで持ってきた値を比較して、その問題と回答をセットする
        if (Qestion_number.equals("1")){
            setText(title,A1,A2,A3,A4);
            //正解か不正解　判定
            btClick1 b = new btClick1();
            ans1.setOnClickListener(b);
            ans2.setOnClickListener(b);
            ans3.setOnClickListener(b);
            ans4.setOnClickListener(b);



        }else if (Qestion_number.equals("2")){
            setText(title,A1,A2,A3,A4);
        }else if (Qestion_number.equals("3")){
            setText(title,A1,A2,A3,A4);
        }else if (Qestion_number.equals("4")){
            setText(title,A1,A2,A3,A4);
        }else if (Qestion_number.equals("5")){
            setText(title,A1,A2,A3,A4);
        }else if (Qestion_number.equals("ex")){
            setText(title,A1,A2,A3,A4);
        }

    }
    //Intentしてきた問題、回答文をTextViewにセット
    public void setText(String question,String q1,String q2,String q3,String q4){
        TextView mondai = findViewById(R.id.textView_問題);
        TextView Q1 = findViewById(R.id.textView_回答1);
        TextView Q2 = findViewById(R.id.textView_回答2);
        TextView Q3 = findViewById(R.id.textView_回答3);
        TextView Q4 = findViewById(R.id.textView_回答4);

        mondai.setText(question);
        Q1.setText(q1);
        Q2.setText(q2);
        Q3.setText(q3);
        Q4.setText(q4);

    }


    //問題１の正答
    private class btClick1 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            Intent OK = new Intent(qr1.this, qr1_ans.class);
            Intent NG = new Intent(qr1.this,qr1_ans_ng.class);
            switch (id) {
                case R.id.ans_1:
                    startActivity(NG);
                    break;
                case R.id.ans_2:
                    startActivity(NG);
                    break;
                case R.id.ans_3:
                    OK.putExtra("question","1");
                    startActivity(OK);
                    break;
                case R.id.ans_4:
                    startActivity(NG);
                    break;
            }
        }
    }

    //問題２の正答
    private class btClick2 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            Intent OK = new Intent(qr1.this, qr1_ans.class);
            Intent NG = new Intent(qr1.this,qr1_ans_ng.class);
            switch (id) {
                case R.id.ans_1:
                    startActivity(NG);
                    break;
                case R.id.ans_2:
                    startActivity(NG);
                    break;
                case R.id.ans_3:
                    startActivity(OK);
                    break;
                case R.id.ans_4:
                    startActivity(NG);
                    break;
            }
        }
    }

    //問題３の正答
    private class btClick3 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            Intent OK = new Intent(qr1.this, qr1_ans.class);
            Intent NG = new Intent(qr1.this,qr1_ans_ng.class);
            switch (id) {
                case R.id.ans_1:
                    startActivity(NG);
                    break;
                case R.id.ans_2:
                    startActivity(NG);
                    break;
                case R.id.ans_3:
                    startActivity(OK);
                    break;
                case R.id.ans_4:
                    startActivity(NG);
                    break;
            }
        }
    }

    //問題４の正答
    private class btClick4 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            Intent OK = new Intent(qr1.this, qr1_ans.class);
            Intent NG = new Intent(qr1.this,qr1_ans_ng.class);
            switch (id) {
                case R.id.ans_1:
                    startActivity(NG);
                    break;
                case R.id.ans_2:
                    startActivity(NG);
                    break;
                case R.id.ans_3:
                    startActivity(OK);
                    break;
                case R.id.ans_4:
                    startActivity(NG);
                    break;
            }
        }
    }

    //問題５の正答
    private class btClick5 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            Intent OK = new Intent(qr1.this, qr1_ans.class);
            Intent NG = new Intent(qr1.this,qr1_ans_ng.class);
            switch (id) {
                case R.id.ans_1:
                    startActivity(NG);
                    break;
                case R.id.ans_2:
                    startActivity(NG);
                    break;
                case R.id.ans_3:
                    startActivity(OK);
                    break;
                case R.id.ans_4:
                    startActivity(NG);
                    break;
            }
        }
    }
}