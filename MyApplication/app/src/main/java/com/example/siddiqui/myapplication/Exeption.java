package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Exeption extends AppCompatActivity {

    ListView exption;

    String contacts[]={"Example of Try catch in Java",
            "Nested try catch example",
            "What are checked exceptions?",
            " Finally block and Return statement" ,

            "Flow of control in try/catch/finally blocks:",
            "Example of throw keyword",
            "Arithmetic exception",
            "Catching multiple exceptions",
            "Example of User defined exception in Java",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exeption);


        exption=(ListView)findViewById(R.id.listView6);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        exption.setAdapter(adapter);
        registerForContextMenu(exption);
    }
}
