package com.example.lab3androidcoban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai1Activity extends AppCompatActivity {

    private EditText edtUserName;
    private EditText edtPassworđ;
    private Button btnDangNhap;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        edtUserName = (EditText) findViewById(R.id.edt_user_name);
        edtPassworđ = (EditText) findViewById(R.id.edt_passworđ);
        btnDangNhap = (Button) findViewById(R.id.btn_dang_nhap);
    }

    public void DangNhap(View view) {
        String name = edtUserName.getText().toString().trim();
        String pass = edtPassworđ.getText().toString().trim();
        if (!name.equals("trung")) {
            edtUserName.setError("Sai UserName");
        }
        else if (!pass.equals("251099")) {
            edtPassworđ.setError("Sai Password");
        }
        else{
            Toast.makeText(this, "ĐĂNG NHẬP THÀNH CÔNG", Toast.LENGTH_SHORT).show();
        }

    }
}
