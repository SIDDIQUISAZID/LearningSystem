package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Struts extends AppCompatActivity {

    ListView stut;

    String contacts[]= {"Hello World Example",
            "Struts 2 - Value Stack/OGNL",
            "Struts 2 - Database Access"



    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.struts);
        stut=(ListView)findViewById(R.id.listView10);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        stut.setAdapter(adapter);
        registerForContextMenu(stut);
    }
}
