package com.example.thbaikiemtra3_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.app.AlertDialog;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPhepTinh;
    ArrayList<PhepTinh> arrayPhepTinh;
    PhepTinhAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter =new PhepTinhAdapter(this, R.layout.item_pheptinh, arrayPhepTinh);
        lvPhepTinh.setAdapter(adapter);



        lvPhepTinh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                startActivity(intent);
            }
        });


    }
    private void AnhXa () {
        lvPhepTinh = (ListView) findViewById(R.id.lvpheptinh);
        arrayPhepTinh = new ArrayList<>();
        arrayPhepTinh.add(new PhepTinh("Phép Cộng", R.drawable.h22));
        arrayPhepTinh.add(new PhepTinh("Phép Trừ", R.drawable.h11));
        arrayPhepTinh.add(new PhepTinh("Phép Nhân", R.drawable.h33));
        arrayPhepTinh.add(new PhepTinh("Phép Chia", R.drawable.h66));
        arrayPhepTinh.add(new PhepTinh("Phép Logarit", R.drawable.h55));


    }
}