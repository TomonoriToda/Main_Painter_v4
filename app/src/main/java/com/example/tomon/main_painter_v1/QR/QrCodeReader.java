package com.example.tomon.main_painter_v1.QR;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.example.tomon.main_painter_v1.MainScreen.main_top;
import com.example.tomon.main_painter_v1.R;
import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.CompoundBarcodeView;

import java.util.List;

public class QrCodeReader extends AppCompatActivity {

    public static int N1=0;
    public static int N2=0;
    public static int N3=0;
    public static int N4=0;
    public static int N5=0;



    private CompoundBarcodeView mBarcodeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ql_main);

        Button home = findViewById(R.id.button_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QrCodeReader.this,main_top.class);
                startActivity(intent);
            }
        });



        mBarcodeView = (CompoundBarcodeView)findViewById(R.id.barcodeView);
        mBarcodeView.decodeSingle(new BarcodeCallback() {
            @Override
            public void barcodeResult(BarcodeResult barcodeResult) {
                //読み取ったQRの文字を比較して、問題に移動
                if(barcodeResult.getText().equals("qr1")& N1==0){
                    Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","1");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","アルスコンピュータ専門学校の学科コースはいくつあるか？");//問題
                    quiz.putExtra("1","7");//回答１
                    quiz.putExtra("2","8");//回答２
                    quiz.putExtra("3","9");//回答３
                    quiz.putExtra("4","10");//回答４
                    startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr2")&N2==0) {
                   Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","2");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","勉強熱心なケンイチ君は、毎日勉強しています。でも、どうしてもたくさん勉強できない月があります。さて、何月でしょうか？");//問題
                    quiz.putExtra("1","２月");//回答１
                    quiz.putExtra("2","１０月");//回答２
                    quiz.putExtra("3","７月");//回答３
                    quiz.putExtra("4","３月");//回答４
                   startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr3")&N3==0) {
                   Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","3");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","S=4,B=2,G=?,I=1,W=1 ？に入る数字は？");//問題
                    quiz.putExtra("1","6");//回答１
                    quiz.putExtra("2","3");//回答２
                    quiz.putExtra("3","4");//回答３
                    quiz.putExtra("4","1");//回答４
                   startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr4")&N4==0){
                   Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","4");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","国家資格である、'基本情報技術者試験'は何月に行われるか");//問題
                    quiz.putExtra("1","２月と１１月");//回答１
                    quiz.putExtra("2","１０月と４月");//回答２
                    quiz.putExtra("3","８月と５月");//回答３
                    quiz.putExtra("4","９月と３月");//回答４
                   startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr5")&N5==0){
                   Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    quiz.putExtra("Question","5");//何の問題か
                    quiz.putExtra("nokori",3);
                    quiz.putExtra("Q","ポテトのナイト、手品師の自転車、ルーキーの頭。さてなんだろう？");//問題
                    quiz.putExtra("1","ポテンシャル");//回答１
                    quiz.putExtra("2","サイクリング");//回答２
                    quiz.putExtra("3","ホテルのナジア");//回答３
                    quiz.putExtra("4","新サイクルじゃがー");//回答４
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