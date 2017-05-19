package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class circulePerimeter extends AppCompatActivity {
    WebView cperimeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circule_perimeter);

        cperimeter=(WebView)findViewById(R.id.circleP);
       cperimeter.loadUrl("file:///android_asset/circule_p.html");
    }
}
