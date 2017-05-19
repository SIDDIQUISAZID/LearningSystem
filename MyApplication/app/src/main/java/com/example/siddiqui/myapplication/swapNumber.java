package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class swapNumber extends AppCompatActivity {
    WebView swnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swap_number);
        swnum=(WebView)findViewById(R.id.swn);
        swnum.loadUrl("file:///android_asset/swapNumber.html");
    }
}
