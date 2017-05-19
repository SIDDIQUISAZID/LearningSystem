package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sort extends AppCompatActivity {

    ListView sorting;

    String contacts[]={"Implement bubble sort in java.",
            "Implement selection sort in java.",
            "Implement insertion sort in java.",
            "Implement quick sort in java." ,

            "Implement merge sort in java"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sort);

        sorting=(ListView)findViewById(R.id.listView4);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        sorting.setAdapter(adapter);
        registerForContextMenu(sorting);
    }
}
