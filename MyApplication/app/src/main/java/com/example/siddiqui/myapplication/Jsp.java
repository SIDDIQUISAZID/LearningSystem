package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Jsp extends AppCompatActivity {

    ListView jsp;

    String contacts[]= {"JSP Scriptlet tag",
            "JSP Implicit Objects",
            "JSP directives",
            "Exception Handling in JSP",

            "JSP Action Tags",
            "Pagination in JSP",
            "JSP CRUD Example"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jsp);

        jsp=(ListView)findViewById(R.id.listView8);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        jsp.setAdapter(adapter);
        registerForContextMenu(jsp);
    }
}
