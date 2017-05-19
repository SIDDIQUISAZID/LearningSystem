package com.example.siddiqui.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Oops extends AppCompatActivity {

    ListView oops;
Intent intent;
    String contacts[]={"Method Overloading examples",
            "Method overriding in java with example",
            "Exception handling in Method overriding with example",
            "Constructor Overloading in Java with examples" ,

            "private constructor example",

            "Super keyword in java with example" ,

            "Abstract class vs interface",
            "Abstract Classes and Methods in Java",
            "Static method example",
            "Multiple Static blocks"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oops);
        oops=(ListView)findViewById(R.id.listView3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        oops.setAdapter(adapter);
        registerForContextMenu(oops);

        oops.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            public void onItemClick(AdapterView <?> adapter, View v, int position, long id){

                switch(position){
                    case 0:
                        intent = new Intent(Oops.this,OverloadingExample.class);
                        break;
                    case 1:
                        intent = new Intent(Oops.this,OverridingInJava.class);
                        break;
                    case 2:
                        intent = new Intent(Oops.this,ExeptionHandling.class);
                        break;
                    case 3:
                        intent = new Intent(Oops.this,ConstructorOverloading.class);
                        break;
                    case 4:
                        intent = new Intent(Oops.this,PrivetConstractor.class);
                        break;
                    case 5:
                        intent = new Intent(Oops.this,SuperKeyword.class);
                        break;
                    case 6:
                        intent = new Intent(Oops.this,AbstractInterface.class);
                        break;
                    case 7:
                        intent = new Intent(Oops.this,AbstractMethod.class);
                        break;
                    case 8:
                        intent = new Intent(Oops.this,StaticMethod.class);
                        break;
                    case 9:
                        intent = new Intent(Oops.this,MultipleStatic.class);
                        break;


                    //add more if you have more items in listview
                    //0 is the first item 1 second and so on...
                }
                startActivity(intent);
            }

        });
    }
}
