package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Servlet extends AppCompatActivity {

    ListView servlets;

    String contacts[]={"The init() method",
            "The service() method :",
            "The doGet() Method",
            " The doPost() Method" ,

            "The destroy() method :",
            "Sample Code for Hello World:",
            "POST Method Example Using Form:",
            "Accessing a Database::",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servlet);

        servlets=(ListView)findViewById(R.id.listView7);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        servlets.setAdapter(adapter);
        registerForContextMenu(servlets);
    }
}
