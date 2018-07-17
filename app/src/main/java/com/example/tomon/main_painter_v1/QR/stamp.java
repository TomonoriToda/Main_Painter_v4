package com.example.tomon.main_painter_v1.QR;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tomon.main_painter_v1.MainScreen.main_top;
import com.example.tomon.main_painter_v1.R;

public class stamp extends AppCompatActivity {

    static boolean Q1=false,Q2=false,Q3=false,Q4=false,Q5=false,Qex=false;
    static boolean Qex2=false;
    static int seitou = 0;//正答数
    static String seitou_all="全問正解";//全問正解時



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
                seitou= seitou+1;
                break;
            }
            case "2": {
                ImageView image = findViewById(R.id.Q2_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Q2 = true;
                seitou= seitou+1;
                break;
            }
            case "3": {
                ImageView image = findViewById(R.id.Q3_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Q3 = true;
                seitou= seitou+1;
                break;
            }
            case "4": {
                ImageView image = findViewById(R.id.Q4_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Q4 = true;
                seitou= seitou+1;
                break;
            }
            case "5": {
                ImageView image = findViewById(R.id.Q5_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Q5 = true;
                seitou= seitou+1;
                break;
            }
            case "ex": {
                ImageView image = findViewById(R.id.Qex_stamp);
                image.setImageResource(R.drawable.itarusukun);
                Qex = true;
                break;
            }
        }

        //一番上で宣言している変数が、trueである場所だけ、画像を表示させる
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
        if (Qex){
            ImageView image = findViewById(R.id.Qex_stamp);
            image.setImageResource(R.drawable.itarusukun);

        }


        //スタンプを全部６種類集めた時
        if ((Q1 & Q2 & Q3 & Q4 & Q5 & Qex)){
            ImageView image = findViewById(R.id.imageView_last);
            image.setImageResource(R.drawable.ok_image_omedetou);
        }

        //正答数表示
        if (!Qex) {
            TextView text = findViewById(R.id.textView_seitousu);
            text.setText(""+seitou);
        }else{
            TextView text = findViewById(R.id.textView_seitousu);
            text.setText(seitou_all);
        }





        //全問正解したら、EX問題出題！
        if ((Q1 & Q2 & Q3 & Q4 & Q5)&& !Qex2){
            Intent quiz = new Intent(stamp.this,qr1.class);
            quiz.putExtra("Question","ex");//何の問題か
            quiz.putExtra("title","５問全てに正解したので、EX問題に挑戦!!");
            quiz.putExtra("nokori",2);
            quiz.putExtra("Q","一番長いホースの専門家であり設計者を逆さまに。これに当てはまるのは？");//問題
            quiz.putExtra("1","幼児保育コース");//回答１
            quiz.putExtra("2","システム開発コース");//回答２
            quiz.putExtra("3","プロダクトデザイナー・CADコース");//回答３
            quiz.putExtra("4","国際ITビジネスコース");//回答４
            Qex2=true;
            startActivity(quiz);
        }
        //■ダクト　⇒　導管　⇒　ホース　　　　
        //■プロ＝専門家　⇒　これを逆さまに　⇒　プロダクト　
        //■設計者　⇒　デザイナー
        //■逆さまに　⇒　プロ　ダクト　デザイナー　
        //■一番長い　⇒　一番長いコース名
        // ⇒プロダクトデザイナー・CADコース　



        //ボタン設定
        Button home = (Button)findViewById(R.id.button_home);
        Button QR = findViewById(R.id.button_QR);

        //メイン画面へ移動する

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stamp.this,main_top.class);
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
