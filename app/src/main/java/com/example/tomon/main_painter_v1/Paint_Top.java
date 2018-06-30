package com.example.tomon.main_painter_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.MainScreen.main;

public class Paint_Top extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint_top);

        Button next = (Button)findViewById(R.id.button_次へ);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                // インテントのインスタンス生成
                Intent intent = new Intent(Paint_Top.this, MainActivity.class);
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });



    }
}
