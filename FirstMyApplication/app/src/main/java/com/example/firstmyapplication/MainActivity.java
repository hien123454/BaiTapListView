package com.example.firstmyapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    //Spinner spnThing;
    //List arrthing;

   // ArrayAdapter atdThing;

     ListView lvGoods;
     CustomGoodsAdapter adt;
     ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods= findViewById(R.id.lvGoods);
        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Google","80$",R.drawable.google));
        arrayList.add(new Goods("Google","80$",R.drawable.google));
        arrayList.add(new Goods("Google","80$",R.drawable.google));
        adt = new CustomGoodsAdapter(this,R.layout.item_listview,arrayList);

        lvGoods.setAdapter(adt);
//        spnThing = findViewById(R.id.spinner123);
//        addDATA();


//        atdThing = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,
//        arrthing);
//        spnThing.setAdapter(atdThing);
    }

//    private void addDATA() {
//        arrthing = new ArrayList();
//        arrthing.add("AAAAAAA");
//        arrthing.add("BBBBBB");
//        arrthing.add("CCCCC");
//        arrthing.add("DDD");
//        arrthing.add("EEEE");
//    }
}