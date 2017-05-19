package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class rectangularArea extends AppCompatActivity {
    WebView recta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangular_area);
        recta=(WebView)findViewById(R.id.rectA);
        recta.loadUrl("file:///android_asset/rect_a.html");
    }
}
