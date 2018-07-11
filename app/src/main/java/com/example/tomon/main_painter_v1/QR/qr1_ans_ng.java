package com.example.tomon.main_painter_v1.QR;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tomon.main_painter_v1.MainScreen.main_top;
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
                Intent intent = new Intent(qr1_ans_ng.this,main_top.class);
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

            quiz.putExtra("Question","1");//何の問題か
            quiz.putExtra("Q","わしには多くの孫がいるが、さて何歳でしょうか？");//問題
            quiz.putExtra("nokori",x);
            quiz.putExtra("1","100歳");//回答１
            quiz.putExtra("2","60歳");//回答２
            quiz.putExtra("3","0歳");//回答３
            quiz.putExtra("4","111歳");//回答４
            startActivity(quiz);
        }else if(q.equals("2")& x > 0) {
            Intent quiz = new Intent(qr1_ans_ng.this, qr1.class);

            quiz.putExtra("Question", "2");//何の問題か
            quiz.putExtra("nokori", x);
            quiz.putExtra("Q", "勉強熱心なケンイチ君は、毎日勉強しています。でも、どうしてもたくさん勉強できない月があります。さて、何月でしょうか？");//問題
            quiz.putExtra("1", "２月");//回答１
            quiz.putExtra("2", "１０月");//回答２
            quiz.putExtra("3", "７月");//回答３
            quiz.putExtra("4", "３月");//回答４
            startActivity(quiz);

        }else if(q.equals("3")& x > 0) {
            Intent quiz = new Intent(qr1_ans_ng.this, qr1.class);
            quiz.putExtra("Question", "3");//何の問題か
            quiz.putExtra("nokori", x);
            quiz.putExtra("Q", "S=4,B=2,G=?,I=1,W=1 ？に入る数字は？");//問題
            quiz.putExtra("1", "6");//回答１
            quiz.putExtra("2", "3");//回答２
            quiz.putExtra("3", "4");//回答３
            quiz.putExtra("4", "1");//回答４
            startActivity(quiz);
        }else if(q.equals("4")& x > 0) {
            Intent quiz = new Intent(qr1_ans_ng.this, qr1.class);
            quiz.putExtra("Question", "4");//何の問題か
            quiz.putExtra("nokori", x);
            quiz.putExtra("Q", "国家資格である、'基本情報技術者試験'は何月に行われるか");//問題
            quiz.putExtra("1", "２月と１１月");//回答１
            quiz.putExtra("2", "１０月と４月");//回答２
            quiz.putExtra("3", "８月と５月");//回答３
            quiz.putExtra("4", "９月と３月");//回答４
            startActivity(quiz);
        }else if(q.equals("5")& x > 0){
            Intent quiz = new Intent(qr1_ans_ng.this, qr1.class);
            quiz.putExtra("Question", "5");//何の問題か
            quiz.putExtra("nokori", x);
            quiz.putExtra("Q","ポテトのナイト、手品師の自転車、ルーキーの頭。さてなんだろう？");//問題
            quiz.putExtra("1","ポテンシャル");//回答１
            quiz.putExtra("2","サイクリング");//回答２
            quiz.putExtra("3","ホテルのナジア");//回答３
            quiz.putExtra("4","新サイクルじゃがー");//回答４
            startActivity(quiz);
        }else {
            Intent intent = new Intent(qr1_ans_ng.this, qr1_ans_ng_seigen.class);
            switch (q) {
                case "1":
                    QrCodeReader.N1=1;
                    startActivity(intent);
                    break;
                case "2":
                    QrCodeReader.N2 = 1;
                    startActivity(intent);
                    break;
                case "3":
                    QrCodeReader.N3 = 1;
                    startActivity(intent);
                    break;
                case "4":
                    QrCodeReader.N4 = 1;
                    startActivity(intent);
                    break;
                case "5":
                    QrCodeReader.N5 = 1;
                    startActivity(intent);
                    break;
            }
            Toast.makeText(getBaseContext(), "回答制限に達しました(´Д⊂ヽ", Toast.LENGTH_SHORT).show();

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
