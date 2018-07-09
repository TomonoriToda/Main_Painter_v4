package com.example.tomon.main_painter_v1.QR;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tomon.main_painter_v1.MainScreen.main;
import com.example.tomon.main_painter_v1.R;


public class qr1_ans_ng extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr1_ans_ng);

        Intent intent = getIntent();
        final String Q = intent.getStringExtra("question");

        Button b = findViewById(R.id.button_問題へ戻る);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                back(Q);
            }
        });

        Button home = findViewById(R.id.button_ホームへ戻る);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(qr1_ans_ng.this,main.class);
                startActivity(intent);
            }
        });



    }

    int i = qr1.mTransitionCount;
    int x = i-1;

    //もう一度問題を解くときに、どの問題から来たかを判定
    //判定後、再度同じ問題に移動
    public void back(String q){
        if (q.equals("1") & x > 0){
            Intent quiz = new Intent(qr1_ans_ng.this,qr1.class);
            //残り回答数をiに。

            Toast.makeText(getBaseContext(),x+"",Toast.LENGTH_SHORT).show();
            quiz.putExtra("Question","1");//何の問題か
            quiz.putExtra("Q","わしには多くの孫がいるが、さて何歳でしょうか？");//問題
            quiz.putExtra("nokori",x);
            quiz.putExtra("1","100歳");//回答１
            quiz.putExtra("2","60歳");//回答２
            quiz.putExtra("3","0歳");//回答３
            quiz.putExtra("4","111歳");//回答４
            startActivity(quiz);
        }else if(q.equals("2")){
            Intent quiz = new Intent(qr1_ans_ng.this,qr1.class);

            quiz.putExtra("Question","2");//何の問題か
            quiz.putExtra("Q","２の問題");//問題
            quiz.putExtra("nokori",x);
            quiz.putExtra("1","あ");//回答１
            quiz.putExtra("2","");//回答２
            quiz.putExtra("3","");//回答３
            quiz.putExtra("4","");//回答４
            startActivity(quiz);
        }
    }
















    //↓端末のバックボタンを無効にする処理↓
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Disable Back key
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return false;
        }

        return super.onKeyDown(keyCode, event);
    }
}
