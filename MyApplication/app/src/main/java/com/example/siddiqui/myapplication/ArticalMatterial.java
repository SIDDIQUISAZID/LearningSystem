package com.example.siddiqui.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArticalMatterial extends AppCompatActivity {

    ListView articles;
    String contants[]={"Object and Class in Java","Constructor in Java","Java static keyword","this keyword in java","super keyword in java",
    "Final Keyword In Java","Java Array","Hibernate Framework","Struts 2 Framework","Spring Framework"};
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artical_matterial);
        articles=(ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,contants);

        articles.setAdapter(adapter);
        registerForContextMenu(articles);

        articles.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            public void onItemClick(AdapterView <?> adapter, View v, int position, long id){

                switch(position){
                    case 0:
                        intent = new Intent(ArticalMatterial.this,ObjectandClassInJava.class);
                        break;
                    case 1:
                        intent = new Intent(ArticalMatterial.this,ConstructorInJava.class);
                        break;
                    case 2:
                        intent = new Intent(ArticalMatterial.this,JavaStaticKeyword.class);
                        break;
                    case 3:
                        intent = new Intent(ArticalMatterial.this,ThiskeywordInJava.class);
                        break;
                    case 4:
                        intent = new Intent(ArticalMatterial.this,SuperKeywordJava.class);
                        break;
                    case 5:
                        intent = new Intent(ArticalMatterial.this,FinalKeyWordJava.class);
                        break;
                    case 6:
                        intent = new Intent(ArticalMatterial.this,JavaArrayArticles.class);
                        break;
                    case 7:
                        intent = new Intent(ArticalMatterial.this,HibernateFramework.class);
                        break;
                    case 8:
                        intent = new Intent(ArticalMatterial.this,Struts2.class);
                        break;
                    case 9:
                        intent = new Intent(ArticalMatterial.this,SpringFramework.class);
                        break;






                    //add more if you have more items in listview
                    //0 is the first item 1 second and so on...
                }
                startActivity(intent);
            }

        });






    }
}
