package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hibernate extends AppCompatActivity {

    ListView hibernate;

    String contacts[]= {"Hibernate Example",
            "Inheritance Mapping",
            "Collection Mapping",
            "Association Mapping",

            "HQL",
            "Named Query"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hibernate);

        hibernate=(ListView)findViewById(R.id.listView9);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        hibernate.setAdapter(adapter);
        registerForContextMenu(hibernate);
    }
}
