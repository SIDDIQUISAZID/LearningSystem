package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Jdbc extends AppCompatActivity {

    ListView jdbc;

    String contacts[]={"Connecting to the database",
            "Executing INSERT statement",
            "Executing SELECT statement",
            " Executing UPDATE statement" ,

            "Executing DELETE statement"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jdbc);

        jdbc=(ListView)findViewById(R.id.listView6);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        jdbc.setAdapter(adapter);
        registerForContextMenu(jdbc);
    }
}
