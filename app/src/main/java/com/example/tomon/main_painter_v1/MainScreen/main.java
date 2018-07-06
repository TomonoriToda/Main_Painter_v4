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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Toast.makeText(getBaseContext(),"起動",Toast.LENGTH_SHORT).show();
        if (requestCode == 1){
            Toast.makeText(getBaseContext(),"if文入った",Toast.LENGTH_SHORT).show();
            TextView tx = (TextView)findViewById(R.id.textView11);//カウント
           // x+=1;
           // String s = Integer.toString(x);
            tx.setText("3");
        }
    }
}
