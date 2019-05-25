package com.example.lab3androidcoban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tvKetQua1;
    private TextView tvKetQua2;
    private TextView tvKetQua3;
    private TextView tvKetQua4;
    private TextView tvKetQua5;
    private TextView tvKetQua6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tvKetQua1 = (TextView) findViewById(R.id.tv_ket_qua1);
        tvKetQua2 = (TextView) findViewById(R.id.tv_ket_qua2);
        tvKetQua3 = (TextView) findViewById(R.id.tv_ket_qua3);
        tvKetQua4 = (TextView) findViewById(R.id.tv_ket_qua4);
        tvKetQua5 = (TextView) findViewById(R.id.tv_ket_qua5);
        tvKetQua6 = (TextView) findViewById(R.id.tv_ket_qua6);



        Intent intent = getIntent();
        String kq1 = intent.getStringExtra("voSoNghiem");
        String kq2 = intent.getStringExtra("voNghiem");
        String kq3 = intent.getStringExtra("motNghiem");
        String kq4 = intent.getStringExtra("kqVoNghiem");
        String kq5 = intent.getStringExtra("kq2Nghiem");
        String kq6 = intent.getStringExtra("kqNghiemKep");

        tvKetQua1.setText(kq1);
        tvKetQua2.setText(kq2);
        tvKetQua3.setText(kq3);
        tvKetQua4.setText(kq4);
        tvKetQua5.setText(kq5);
        tvKetQua6.setText(kq6);
    }
}
