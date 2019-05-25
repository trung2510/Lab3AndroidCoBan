package com.example.lab3androidcoban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Bai3Activity extends AppCompatActivity {

    private ListView lvMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        lvMonHoc = (ListView) findViewById(R.id.lv_mon_hoc);
        List list = new ArrayList();
        list.add("Android cơ bản");
        list.add("Android nâng cao");
        list.add("Thiết kế giao diện android");
        list.add("Test và triển khai ứng dụng android");
        list.add("NodeJS");
        list.add("Game 2D");
        list.add("Liên Minh Huyền Thoại");

        ArrayAdapter arrayAdapter = new ArrayAdapter(Bai3Activity.this,android.R.layout.simple_list_item_1,list);
        lvMonHoc.setAdapter(arrayAdapter);

    }
}
