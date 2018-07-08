package com.example.tomon.main_painter_v1.MainScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tomon.main_painter_v1.Paint_Top;
import com.example.tomon.main_painter_v1.QR.QrCodeReader;
import com.example.tomon.main_painter_v1.QR.qr1;
import com.example.tomon.main_painter_v1.R;
import com.example.tomon.main_painter_v1.WebForm;

public class main extends AppCompatActivity {

    int x=0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top);

        Button QR_btn = (Button)findViewById(R.id.button_qr);       //QRボタン
        Button map_btn = (Button)findViewById(R.id.button_map);     //MAPのボタン
        Button paint_btn = (Button)findViewById(R.id.button_paint);   //お絵描きのボタン
        Button ars_btn = (Button)findViewById(R.id.button_arsinfo);     //アルス情報のボタン
        Button net_btn = (Button)findViewById(R.id.button_web);     //専用webフォーム




        QR_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントのインスタンス生成
                Intent intent = new Intent(main.this, QrCodeReader.class);
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });

        map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        paint_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントのインスタンス生成
                Intent intent = new Intent(main.this, Paint_Top.class);
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });

        ars_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        net_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントのインスタンス生成
                Intent intent = new Intent(main.this,WebForm.class);
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });



        ///////////////////////////////////////////////////////////////////////////////////////////
        //テスト
        ///////////////////////////////////////////////////////////////////////////////////////////
        Button test =  findViewById(R.id.test);
        Button test2 = findViewById(R.id.test2);
        Button test3 = findViewById(R.id.test3);
        Button test4 = findViewById(R.id.test4);
        Button test5 = findViewById(R.id.test5);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(main.this,qr1.class);
                quiz.putExtra("Question","1");//何の問題か
                quiz.putExtra("Q","わしには多くの孫がいるが、さて何歳でしょうか？");//問題
                quiz.putExtra("1","100歳");//回答１
                quiz.putExtra("2","60歳");//回答２
                quiz.putExtra("3","0歳");//回答３
                quiz.putExtra("4","111歳");//回答４
                startActivity(quiz);
            }
        });

        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(main.this,qr1.class);
                quiz.putExtra("Question","2");//何の問題か
                quiz.putExtra("Q","２問目の問題");//問題
                quiz.putExtra("1","あ");//回答１
                quiz.putExtra("2","い");//回答２
                quiz.putExtra("3","う");//回答３
                quiz.putExtra("4","え");//回答４
                startActivity(quiz);
            }
        });
        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(main.this,qr1.class);
                quiz.putExtra("Question","3");//何の問題か
                quiz.putExtra("Q","３問目の問題");//問題
                quiz.putExtra("1","あ");//回答１
                quiz.putExtra("2","い");//回答２
                quiz.putExtra("3","う");//回答３
                quiz.putExtra("4","え");//回答４
                startActivity(quiz);
            }
        });
        test4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(main.this,qr1.class);
                quiz.putExtra("Question","4");//何の問題か
                quiz.putExtra("Q","４問目の問題");//問題
                quiz.putExtra("1","あ");//回答１
                quiz.putExtra("2","い");//回答２
                quiz.putExtra("3","う");//回答３
                quiz.putExtra("4","え");//回答４
                startActivity(quiz);
            }
        });
        test5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(main.this,qr1.class);
                quiz.putExtra("Question","5");//何の問題か
                quiz.putExtra("Q","５問目の問題");//問題
                quiz.putExtra("1","あ");//回答１
                quiz.putExtra("2","い");//回答２
                quiz.putExtra("3","う");//回答３
                quiz.putExtra("4","え");//回答４
                startActivity(quiz);
            }
        });
    }



    ///////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////

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
