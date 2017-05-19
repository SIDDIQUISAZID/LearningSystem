package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class armstrongnumber extends AppCompatActivity {
    WebView armstrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.armstrongnumber);
        armstrong=(WebView)findViewById(R.id.arms);
        armstrong.loadUrl("file:///android_asset/armstrong.html");
    }
}
