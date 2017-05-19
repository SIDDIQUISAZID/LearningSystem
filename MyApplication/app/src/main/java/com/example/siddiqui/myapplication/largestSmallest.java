package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class largestSmallest extends AppCompatActivity {
    WebView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.largest_smallest);
        ls=(WebView)findViewById(R.id.lsn);
        ls.loadUrl("file:///android_asset/largest_smallest.html");
    }
}
