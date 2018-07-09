package com.example.tomon.main_painter_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.tomon.main_painter_v1.MainScreen.main_top;

public class WebForm extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.webactivity);

            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.setWebViewClient(new WebViewClient());
            myWebView.loadUrl("http://172.16.31.18:8080/paint.php");

            Button main = (Button)findViewById(R.id.button_メインへ);
            Button web = findViewById(R.id.button_絵を見に行く);

            main.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // インテントのインスタンス生成
                    Intent intent = new Intent(WebForm.this, main_top.class);
                    // 次画面のアクティビティ起動
                    startActivity(intent);
                }
            });

            Button write_btn = (Button)findViewById(R.id.button_問題描く);
            write_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // インテントのインスタンス生成
                    Intent intent = new Intent(WebForm.this,MainActivity.class);
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
