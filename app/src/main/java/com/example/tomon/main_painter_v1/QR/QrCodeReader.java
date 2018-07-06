package com.example.tomon.main_painter_v1.QR;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        mBarcodeView = (CompoundBarcodeView)findViewById(R.id.barcodeView);
        mBarcodeView.decodeSingle(new BarcodeCallback() {
            @Override
            public void barcodeResult(BarcodeResult barcodeResult) {
                if(barcodeResult.getText().equals("qr1")){
                    Intent quiz = new Intent(QrCodeReader.this,qr1.class);
                    startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr2")) {
                   // Intent quiz = new Intent(QrCodeReader.this,qr2.class);
                   // startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr3")) {
                   // Intent quiz = new Intent(QrCodeReader.this,qr3.class);
                   // startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr4")){
                  //  Intent quiz = new Intent(QrCodeReader.this,qr4.class);
                   // startActivity(quiz);
                }else if(barcodeResult.getText().equals("qr5")){
                  //  Intent quiz = new Intent(QrCodeReader.this,qr5.class);
                  //  startActivity(quiz);
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
}