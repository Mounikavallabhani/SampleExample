package com.example.mansopresk14.sampleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.webkit.WebView;

public class Url extends AppCompatActivity {
    WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_example);
        mywebview=(WebView)findViewById(R.id.webView1);
       mywebview.loadUrl("https://www.javatpoint.com/android-webview-example");

    }


}



