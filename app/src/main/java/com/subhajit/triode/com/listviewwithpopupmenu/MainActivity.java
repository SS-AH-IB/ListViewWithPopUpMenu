package com.subhajit.triode.com.listviewwithpopupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private String[] myArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myArray=getResources().getStringArray(R.array.myArray);
        ListView lv=(ListView)findViewById(R.id.lv);
        lv.setAdapter(new MyAdapter(MainActivity.this,myArray));
    }
}
