package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class evenOdd extends AppCompatActivity {

    WebView even;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.even_odd);
        even=(WebView)findViewById(R.id.evenodd);
        even.loadUrl("file:///android_asset/evenodd.html");
    }
}
