package com.example.tomon.main_painter_v1.QR;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tomon.main_painter_v1.MainScreen.main;
import com.example.tomon.main_painter_v1.R;

public class stamp extends AppCompatActivity {

    int Q1=0,Q2=0,Q3=0,Q4=0,Q5=0,Qex=0;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_stamp);


        //Intentでもらった値を比較して、スタンプ（画像）をセット
        Intent intent = getIntent();
        String x = intent.getStringExtra("question");
        //Toast.makeText(getBaseContext(),x+"",Toast.LENGTH_SHORT).show();

        if (x.equals("1")){
            ImageView image = findViewById(R.id.Q1_stamp);
            image.setImageResource(R.drawable.itarusukun);
            Q1=1;
        }else if(x.equals("2")){
            ImageView image = findViewById(R.id.Q2_stamp);
            image.setImageResource(R.drawable.itarusukun);
        }


        //セットした画像を保持する
        if(Q1 == 1){
            ImageView image1 = findViewById(R.id.Q1_stamp);
            image1.setImageResource(R.drawable.itarusukun);
        }


        //全問正解したら、EX問題出題！
        if (1==(Q1&Q2&Q3&Q4&Q5)){
            Intent quiz = new Intent(stamp.this,qr1.class);
            quiz.putExtra("Question","ex");//何の問題か
            quiz.putExtra("Q","");//問題
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


}
