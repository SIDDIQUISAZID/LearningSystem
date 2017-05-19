package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class rectangularPerimeter extends AppCompatActivity {

    WebView rectp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangular_perimeter);

        rectp=(WebView)findViewById(R.id.recta);
        rectp.loadUrl("file:///android_asset/rect_p.html");
    }
}
