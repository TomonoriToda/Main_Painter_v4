package com.example.tomon.main_painter_v1;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;



public class MainActivity extends AppCompatActivity{

    final byte[] bByte = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CanvasView cv = (CanvasView) findViewById(R.id.canvasView);
        final CanvasView cv2 = (CanvasView) findViewById(R.id.canvasView2);
        final Button bt_save = (Button) findViewById(R.id.Button_Save);

        //-- Button関連
        Button bt = (Button) findViewById(R.id.clear_button);
        Button bt2 = (Button) findViewById(R.id.clear_button2);

        //- 動作設定
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv.allDelete();
            }
        });

        //- 動作設定
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv2.allDelete();
            }
        });

        bt_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                run1(findViewById(R.id.canvasView));
                run2(findViewById(R.id.canvasView2));

            }


        });
    }


    //Bitmapからbyte[]に変換
    public static byte[] aByte(Bitmap bmp){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] bytes = baos.toByteArray();
        return bytes;
    }


    // スクリーンショットを取得する
    public static Bitmap getViewCapture(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap cache = view.getDrawingCache();
        if (cache == null) return null;
        Bitmap screen_shot = Bitmap.createBitmap(cache);
        view.setDrawingCacheEnabled(false);
        return screen_shot;
    }

    public void onClick1(View v) {
        final Date date = new Date(System.currentTimeMillis());
        final File file = new File(Environment.getExternalStorageDirectory() + "/Download/" + "paint" + ".png");
        file.getParentFile().mkdir();
        switch (v.getId()) {
            case R.id.Button_Save:
                saveCapture(findViewById(R.id.canvasView), file);
        }

    }
    public void onClick2(View v) {
        final Date date = new Date(System.currentTimeMillis());
        final File file = new File(Environment.getExternalStorageDirectory() + "/Download/" + "paint2" + ".png");
        file.getParentFile().mkdir();
        switch (v.getId()) {
            case R.id.Button_Save:
                saveCapture(findViewById(R.id.canvasView2), file);
        }
    }

    // スクリーンショットを取得して保存する
    public void saveCapture(View view, File file) {
        Bitmap capture = getViewCapture(view);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, false);
            // 画像のフォーマットと画質と出力先を指定して保存
            capture.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), "画像保存に失敗しました。権限を確認してください。", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        } finally {
            if (fos == null) return;
            try {
                fos.close();
            } catch (Exception ie) {
                fos = null;
            }
        }
    }



    //////////////////////////////////////////////////////////////////////////////////////////////
    //  HTTP通信 AsyncTask
    ////////////////////////////////////////////////////////////////////////////////////////////

    public void run1(View view){
        Bitmap bitmap= getViewCapture(view);
        Bitmap bmp = bitmap;
        new PostBmpAsyncHttpRequest(this).execute(new Param("http://172.16.31.18/index.php", bmp));
    }

    public void run2(View view){
        Bitmap bitmap= getViewCapture(view);
        Bitmap bmp = bitmap;
        new PostBmpAsyncHttpRequest(this).execute(new Param("http://172.16.31.18/index2.php", bmp));
    }

















}


