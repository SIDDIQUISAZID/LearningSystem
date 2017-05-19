package com.example.siddiqui.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class atternprogram extends AppCompatActivity {
    ListView listView;
    Intent intent;

    String contacts[]={"Pattern 1",
            "Pattern 2",
            "Pattern 3",
            "Pattern 4" ,

            "Pattern 5",

            "Pattern 6" ,

            "Pattern 7",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atternprogram);
        listView=(ListView)findViewById(R.id.listView2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);

        //  listview.setOnItemClickListener(new OnItemClickListener();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            public void onItemClick(AdapterView <?> adapter, View v, int position, long id){

                switch(position){
                    case 0:
                        intent = new Intent(atternprogram.this,Ptrn1.class);
                        break;
                    case 1:
                        intent = new Intent(atternprogram.this,Ptrn2.class);
                        break;
                    case 2:
                        intent = new Intent(atternprogram.this,Ptrn3.class);
                        break;
                    case 3:
                        intent = new Intent(atternprogram.this,Ptrn4.class);
                        break;
                    case 4:
                        intent = new Intent(atternprogram.this,Ptrn5.class);
                        break;
                    case 5:
                        intent = new Intent(atternprogram.this,Ptrn6.class);
                        break;
                    case 6:
                        intent = new Intent(atternprogram.this,Ptrn7.class);
                        break;


                    //add more if you have more items in listview
                    //0 is the first item 1 second and so on...
                }
                startActivity(intent);
            }

        });
    }
}
