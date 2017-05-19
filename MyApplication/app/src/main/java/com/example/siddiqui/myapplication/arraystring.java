package com.example.siddiqui.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class arraystring extends AppCompatActivity {

    ListView araystring;
    Intent intent;

    String contacts[]={"How to sort an array and search an element inside it?",
            "How to reverse an array list ?",
            "How to search the minimum and the maximum element in an array ?",
            "How to merge two arrays ?" ,

            "How to remove an element of array?",

            "How to remove one array from another array?" ,

            "How to find an object or a string in an Array?",
            "How to compare two arrays?",
            "How to determine the upper bound of a two dimensional array ?",
            "How to compare two strings ?",
            "How to reverse a String?",
            "How to optimize string concatenation ?",
            "How to buffer strings ?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arraystring);

        araystring=(ListView)findViewById(R.id.listView2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        araystring.setAdapter(adapter);
        registerForContextMenu(araystring);

        //  listview.setOnItemClickListener(new OnItemClickListener();

        araystring.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            public void onItemClick(AdapterView <?> adapter, View v, int position, long id){

                switch(position){
                    case 0:
                        intent = new Intent(arraystring.this,Sort_Array_search.class);
                        break;
                    case 1:
                        intent = new Intent(arraystring.this,Array_reverce.class);
                        break;
                    case 2:
                        intent = new Intent(arraystring.this,Maxim_Min_Eli.class);
                        break;
                    case 3:
                        intent = new Intent(arraystring.this,Merge_Array.class);
                        break;
                    case 4:
                        intent = new Intent(arraystring.this,Remove_Eliment.class);
                        break;
                    case 5:
                        intent = new Intent(arraystring.this,Remove_into_anotherarray.class);
                        break;
                    case 6:
                        intent = new Intent(arraystring.this,Object_Array.class);
                        break;
                    case 7:
                        intent = new Intent(arraystring.this,CompireArray.class);
                        break;
                    case 8:
                        intent = new Intent(arraystring.this,DimentionArray_2.class);
                        break;
                    case 9:
                        intent = new Intent(arraystring.this,StringCmpre.class);
                        break;
                    case 10:
                        intent = new Intent(arraystring.this,StringReverce.class);
                        break;
                    case 11:
                        intent = new Intent(arraystring.this,CancatenationString.class);
                        break;
                    case 12:
                        intent = new Intent(arraystring.this,BufferString.class);
                        break;


                    //add more if you have more items in listview
                    //0 is the first item 1 second and so on...
                }
                startActivity(intent);
            }

        });

    }
}
