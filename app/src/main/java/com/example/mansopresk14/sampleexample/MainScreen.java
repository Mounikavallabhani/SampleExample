package com.example.mansopresk14.sampleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    public void lable(View v){
        Intent it =new Intent(MainScreen.this,MainActivity.class);
        startActivity(it);
    }
    public void drawers(View v){
        Intent it =new Intent(MainScreen.this,NavigationDrawers.class);
        startActivity(it);
    }
    public void web(View v){
        Intent it =new Intent(MainScreen.this,WebTypes.class);
        startActivity(it);
    }
}
