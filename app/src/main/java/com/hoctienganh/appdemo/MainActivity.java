package com.hoctienganh.appdemo;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnQcao, btnTuVung, btnHocTu, btnCaiDat, btnThemTu, btnHuongDan, btnLikePage, btnGopY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnThemTu.setOnClickListener(this);
        btnQcao.setOnClickListener(this);
    }

    private void initView() {
        btnQcao = findViewById(R.id.btnTatQc);
        btnTuVung = findViewById(R.id.btnTuVung);
        btnHocTu = findViewById(R.id.btnHocTu);
        btnCaiDat = findViewById(R.id.btnCaiDat);
        btnThemTu = findViewById(R.id.btnThemTu);
        btnHuongDan = findViewById(R.id.btnHuongDan);
        btnLikePage = findViewById(R.id.btnLikePages);
        btnGopY = findViewById(R.id.btnGopY);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnTatQc:
                Dialog dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_tatqc);
                dialog.show();
                break;
            case R.id.btnTuVung:
                break;
            case R.id.btnHocTu:
                break;
            case R.id.btnCaiDat:
                break;
            case R.id.btnThemTu:
                startActivity(new Intent(MainActivity.this, ThemTuActivity.class));
                break;
            case R.id.btnHuongDan:
                break;
            case R.id.btnLikePages:
                break;
            case R.id.btnGopY:
                break;


        }
    }
}
