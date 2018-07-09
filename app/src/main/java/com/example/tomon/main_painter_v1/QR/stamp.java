package com.example.tomon.main_painter_v1.QR;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tomon.main_painter_v1.MainScreen.main;
import com.example.tomon.main_painter_v1.R;

public class stamp extends AppCompatActivity {

    static boolean Q1=false,Q2=false,Q3=false,Q4=false,Q5=false,Qex=false;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_stamp);



        //Intentでもらった値を比較して、スタンプ（画像）をセット
        Intent intent = getIntent();
        String x = intent.getStringExtra("question");
        //Toast.makeText(getBaseContext(),x+"",Toast.LENGTH_SHORT).show();

        switch (x) {
            case "1": {
                ImageView image = findViewById(R.id.Q1_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Q1 = true;
                break;
            }
            case "2": {
                ImageView image = findViewById(R.id.Q2_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Q2 = true;
                break;
            }
            case "3": {
                ImageView image = findViewById(R.id.Q3_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Q3 = true;
                break;
            }
            case "4": {
                ImageView image = findViewById(R.id.Q4_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Q4 = true;
                break;
            }
            case "5": {
                ImageView image = findViewById(R.id.Q5_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Q5 = true;
                break;
            }
        }
        if(Q1){
            ImageView image = findViewById(R.id.Q1_stamp);
            image.setImageResource(R.drawable.itarusukun);
        }
        if(Q2){
            ImageView image = findViewById(R.id.Q2_stamp);
            image.setImageResource(R.drawable.itarusukun);
        }
        if(Q3){
            ImageView image = findViewById(R.id.Q3_stamp);
            image.setImageResource(R.drawable.itarusukun);
        }
        if(Q4){
            ImageView image = findViewById(R.id.Q4_stamp);
            image.setImageResource(R.drawable.itarusukun);
        }
        if(Q5){
            ImageView image = findViewById(R.id.Q5_stamp);
            image.setImageResource(R.drawable.itarusukun);
        }




        //全問正解したら、EX問題出題！
        if ((Q1 & Q2 & Q3 & Q4 & Q5)){
            Intent quiz = new Intent(stamp.this,qr1.class);
            quiz.putExtra("Question","ex");//何の問題か
            quiz.putExtra("title","５問全てに正解したので、EX問題に挑戦!!");
            quiz.putExtra("Q","EX問題!!");//問題
            quiz.putExtra("1","");//回答１
            quiz.putExtra("2","");//回答２
            quiz.putExtra("3","");//回答３
            quiz.putExtra("4","");//回答４
            startActivity(quiz);
        }




        //ボタン設定
        Button home = (Button)findViewById(R.id.button_home);
        Button QR = findViewById(R.id.button_QR);

        //メイン画面へ移動する

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stamp.this,main.class);
                startActivity(intent);
            }
        });
        //QR読み取り画面へ移動する
        QR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stamp.this,QrCodeReader.class);
                startActivity(intent);
            }
        });

    }

    //↓端末のバックボタンを無効にする処理↓
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Disable Back key
        return keyCode != KeyEvent.KEYCODE_BACK && super.onKeyDown(keyCode, event);

    }


}
