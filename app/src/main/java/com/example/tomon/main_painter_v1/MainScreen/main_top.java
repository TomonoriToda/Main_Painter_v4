package com.example.tomon.main_painter_v1.MainScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.Paint_Top;
import com.example.tomon.main_painter_v1.QR.QrCodeReader;
import com.example.tomon.main_painter_v1.QR.qr1;
import com.example.tomon.main_painter_v1.QR.stamp;
import com.example.tomon.main_painter_v1.R;
import com.example.tomon.main_painter_v1.WebForm;
import com.example.tomon.main_painter_v1.ars_web;
import com.example.tomon.main_painter_v1.map.Map_main;

public class main_top extends AppCompatActivity {

    int x=0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top);

        Button QR_btn = (Button)findViewById(R.id.button_qr);       //QRボタン
        Button map_btn = (Button)findViewById(R.id.button_map);     //MAPのボタン
        Button paint_btn = (Button)findViewById(R.id.button_paint);   //お絵描きのボタン
        Button ars_btn = (Button)findViewById(R.id.button_arsinfo);     //アルス情報のボタン
        Button net_btn = (Button)findViewById(R.id.button_web);     //専用webフォーム
        Button net2_btn = findViewById(R.id.button_web2);           //専用webフォーム
        Button kaitou = findViewById(R.id.button_回答状況);//回答状況確認　スタンプ画面へ移動



        //トップ画面から、QR読み取り画面へ移動
        QR_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントのインスタンス生成
                Intent intent = new Intent(main_top.this, QrCodeReader.class);
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });

        //トップ画面から、マップ画面へ移動
        map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントのインスタンス生成
                Intent intent = new Intent(main_top.this, Map_main.class);
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });

        //トップ画面から、お絵描きアプリへ移動
        paint_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントのインスタンス生成
                Intent intent = new Intent(main_top.this, Paint_Top.class);
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });

        //トップ画面から、お絵描きwebへ移動
        ars_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main_top.this,ars_web.class);
                startActivity(intent);
            }
        });

        //トップ画面から、お絵描きwebへ移動
        net_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントのインスタンス生成
                Intent intent = new Intent(main_top.this,WebForm.class);
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });

        //トップ画面から、アルス情報へ移動
        net2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントのインスタンス生成
                Intent intent = new Intent(main_top.this,WebForm.class);
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });

        //トップ画面から、回答状況確認画面へ移動
        kaitou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントのインスタンス生成
                Intent intent = new Intent(main_top.this,stamp.class);
                intent.putExtra("question","");
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });

    }




    ///////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////

    //↓端末のバックボタンを無効にする処理↓
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Disable Back key
        return keyCode != KeyEvent.KEYCODE_BACK && super.onKeyDown(keyCode, event);

    }






}
