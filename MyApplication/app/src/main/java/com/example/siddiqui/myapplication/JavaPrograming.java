package com.example.siddiqui.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JavaPrograming extends AppCompatActivity {
    ListView listView1;
    Intent intent;
    String contacts[]={"Hello World example",
            "Java Class Example",
            "Calculate Circle Area using Java Example",
            "Calculate Circle Perimeter using Java  Example" ,

            "Calculate Rectangle Area using Java  Example",

            "Calculate Rectangle Perimeter using Java Example" ,

            "Even Odd Number Example",
            "Find the largest and Smallest in an Array Example",
            "Java factorial Example",
            "Reverse Number using java",
            "Swap Numbers JavaExample",
    "Armstrong Numbers",
    "Palidrome Number"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_programing);
        listView1=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contacts);
        listView1.setAdapter(adapter);
     registerForContextMenu(listView1);

      //  listview.setOnItemClickListener(new OnItemClickListener();

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            public void onItemClick(AdapterView <?> adapter,View v, int position,long id){

                switch(position){
                    case 0:
                        intent = new Intent(JavaPrograming.this,Helloworld.class);
                        break;
                    case 1:
                        intent = new Intent(JavaPrograming.this,JavaclassExample.class);
                        break;
                    case 2:
                        intent = new Intent(JavaPrograming.this,circuleArea.class);
                        break;
                    case 3:
                        intent = new Intent(JavaPrograming.this,circulePerimeter.class);
                        break;
                    case 4:
                        intent = new Intent(JavaPrograming.this,rectangularArea.class);
                        break;
                    case 5:
                        intent = new Intent(JavaPrograming.this,rectangularPerimeter.class);
                        break;
                    case 6:
                        intent = new Intent(JavaPrograming.this,evenOdd.class);
                        break;
                    case 7:
                        intent = new Intent(JavaPrograming.this,largestSmallest.class);
                        break;
                    case 8:
                        intent = new Intent(JavaPrograming.this,factorial.class);
                        break;
                    case 9:
                        intent = new Intent(JavaPrograming.this,reverce.class);
                        break;
                    case 10:
                        intent = new Intent(JavaPrograming.this,swapNumber.class);
                        break;
                    case 11:
                        intent = new Intent(JavaPrograming.this,armstrongnumber.class);
                        break;
                    case 12:
                        intent = new Intent(JavaPrograming.this,palidrome.class);
                        break;

                    //add more if you have more items in listview
                    //0 is the first item 1 second and so on...
                }
                startActivity(intent);
            }

        });
    }

}
