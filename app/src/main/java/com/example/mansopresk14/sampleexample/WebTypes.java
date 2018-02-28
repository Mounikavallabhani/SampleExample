package com.example.mansopresk14.sampleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WebTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_types);
    }
    public  void url(View v){
        Intent it=new Intent(WebTypes.this,Url.class);
        startActivity(it);
    }
    public  void pdf(View v){
        Intent it=new Intent(WebTypes.this,Pdf.class);
        startActivity(it);
    }


}
