package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class factorial extends AppCompatActivity {

    WebView facto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factorial);
        facto=(WebView)findViewById(R.id.fact);
        facto.loadUrl("file:///android_asset/factorial.html");
    }
}
