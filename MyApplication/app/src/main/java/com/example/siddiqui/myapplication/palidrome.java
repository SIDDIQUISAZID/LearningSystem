package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class palidrome extends AppCompatActivity {

WebView polidrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palidrome);
        polidrome=(WebView)findViewById(R.id.palidr);
        polidrome.loadUrl("file:///android_asset/palidrome.html");
    }
}
