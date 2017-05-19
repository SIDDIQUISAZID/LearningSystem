package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class circuleArea extends AppCompatActivity {

    WebView ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circule_area);
        ca=(WebView)findViewById(R.id.areacircule);
        ca.loadUrl("file:///android_asset/cicule_a.html");
    }
}
