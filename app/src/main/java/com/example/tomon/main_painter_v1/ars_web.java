package com.example.tomon.main_painter_v1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.tomon.main_painter_v1.MainScreen.main_top;

public class ars_web extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ars_web);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        Button b = findViewById(R.id.button_back);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://www.arsnet.ac.jp/school/sp/");


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ars_web.this,main_top.class);
                startActivity(intent);
            }
        });
    }
}
