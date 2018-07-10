package com.example.tomon.main_painter_v1;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ars_web extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ars_web);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://www.arsnet.ac.jp/school/sp/");
    }
}
