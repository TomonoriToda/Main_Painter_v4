package com.example.tomon.main_painter_v1.MainScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.MainActivity;
import com.example.tomon.main_painter_v1.R;

public class main extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top);

        Button QR = (Button)findViewById(R.id.button_qr);
        QR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                // インテントのインスタンス生成
                Intent intent = new Intent(main.this, MainActivity.class);
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
}
