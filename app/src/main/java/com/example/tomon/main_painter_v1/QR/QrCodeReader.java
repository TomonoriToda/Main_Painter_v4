package com.example.tomon.main_painter_v1.QR;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tomon.main_painter_v1.MainScreen.main;
import com.example.tomon.main_painter_v1.R;
import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.CompoundBarcodeView;

import java.util.List;

public class QrCodeReader extends AppCompatActivity {

    private CompoundBarcodeView mBarcodeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ql_main);

        Button home = findViewById(R.id.button_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QrCodeReader.this,main.class);
                startActivity(intent);
            }
        });

        mBarcodeView = (CompoundBarcodeView)findViewById(R.id.barcodeView);
        mBarcodeView.decodeSingle(new BarcodeCallback() {
            @Override
            public void barcodeResult(BarcodeResult barcodeResult) {
                //読み取ったQRの文字を比較して、問題に移動
                if(barcodeResult.getText().equals("qr1")){
                    Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","1");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","アルスコンピュータ専門学校の学科コースはいくつあるか？");//問題
                    quiz.putExtra("1","7");//回答１
                    quiz.putExtra("2","8");//回答２
                    quiz.putExtra("3","9");//回答３
                    quiz.putExtra("4","10");//回答４
                    startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr2")) {
                   Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","2");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","");//問題
                    quiz.putExtra("1","");//回答１
                    quiz.putExtra("2","");//回答２
                    quiz.putExtra("3","");//回答３
                    quiz.putExtra("4","");//回答４
                   startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr3")) {
                   Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","3");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","");//問題
                    quiz.putExtra("1","");//回答１
                    quiz.putExtra("2","");//回答２
                    quiz.putExtra("3","");//回答３
                    quiz.putExtra("4","");//回答４
                   startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr4")){
                   Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","4");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","");//問題
                    quiz.putExtra("1","");//回答１
                    quiz.putExtra("2","");//回答２
                    quiz.putExtra("3","");//回答３
                    quiz.putExtra("4","");//回答４
                   startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr5")){
                   Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","5");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","");//問題
                    quiz.putExtra("1","");//回答１
                    quiz.putExtra("2","");//回答２
                    quiz.putExtra("3","");//回答３
                    quiz.putExtra("4","");//回答４
                   startActivity(quiz);
                }else{
                    finish();
                }
            }

            @Override
            public void possibleResultPoints(List<ResultPoint> list) {}
        });
    }
    @Override
    public void onResume() {
        super.onResume();
        mBarcodeView.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mBarcodeView.pause();
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