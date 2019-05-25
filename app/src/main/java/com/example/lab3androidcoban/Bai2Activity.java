package com.example.lab3androidcoban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai2Activity extends AppCompatActivity {

    private EditText a;
    private EditText b;
    private EditText c;
    private Button kq;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        AnhXa();
        kq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KetQua();
            }
        });
    }

    private void KetQua() {
        double soA = Double.parseDouble(a.getText().toString());
        double soB = Double.parseDouble(b.getText().toString());
        double soC = Double.parseDouble(c.getText().toString());
        Intent intent = new Intent(Bai2Activity.this,Main2Activity.class);
        if (soA == 0) {
            if (soB == 0) {
                if (soC == 0) {
                    String voSoNghiem = "Phương trình có vô số nghiệm";
                    intent.putExtra("voSoNghiem",voSoNghiem);
                }
                else {
                    String voNghiem = "Phương trình vô nghiệm";
                    intent.putExtra("voNghiem",voNghiem);
                }
            }
            else {
                String motNghiem = "Phương trình có một nghiệm là: "+ (-soC/soB);
                intent.putExtra("motNghiem",motNghiem);
            }
        }
        else {
            double x1;
            double x2;
            double delta = Math.pow(soB,2)-4*soA*soC;
            if (delta < 0) {
                String kqVoNghiem = "Phương trình vô nghiệm";
                intent.putExtra("kqVoNghiem",kqVoNghiem);
            }
            else if (delta > 0){
                x1 = (-soB + Math.sqrt(delta))/(2*soA);
                x2 = (-soB - Math.sqrt(delta))/(2*soA);
                String kq2Nghiem = "Kết quả: \n x1=" + x1 + "\n x2=" + x2;
                intent.putExtra("kq2Nghiem",kq2Nghiem);
            }
            else {
                String kqNghiemKep = "PT có nghiệm kép x1 = x2 =" + (-soB/(2*soA));
                intent.putExtra("kqNghiemKep",kqNghiemKep);
            }
        }

        startActivity(intent);
    }

    private void AnhXa() {
        a = (EditText) findViewById(R.id.a);
        b = (EditText) findViewById(R.id.b);
        c = (EditText) findViewById(R.id.c);
        kq = (Button) findViewById(R.id.kq);

    }

}
