package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JavaclassExample extends AppCompatActivity {
    WebView classexamples;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javaclass_example);
        classexamples=(WebView)findViewById(R.id.classexample);
        classexamples.loadUrl("file:///android_asset/classExample.html");



    }
}
