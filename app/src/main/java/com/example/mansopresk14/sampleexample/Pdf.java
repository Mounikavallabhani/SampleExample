package com.example.mansopresk14.sampleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Pdf extends AppCompatActivity {
    WebView mywebview1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        mywebview1=(WebView)findViewById(R.id.webView2);

        String myPdfUrl = "https://www.adobe.com/content/dam/acom/en/devnet/acrobat/pdfs/pdf_open_parameters.pdf";
       // String myPdfUrl ="https://www.antennahouse.com/XSLsample/pdf/sample-link_1.pdf";
        String url = "http://docs.google.com/gview?embedded=true&url=" + myPdfUrl;
        Log.e("error", "Opening PDF: " + url);
        mywebview1.getSettings().setJavaScriptEnabled(true);
        mywebview1.loadUrl(url);

    }
}
