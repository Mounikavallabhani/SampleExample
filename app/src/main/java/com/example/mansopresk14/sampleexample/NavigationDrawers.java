package com.example.mansopresk14.sampleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NavigationDrawers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawers);
    }
    public void leftright(View v){
        Intent it=new Intent(NavigationDrawers.this,LeftNavigation.class);
        startActivity(it);
    }
    public void right(View v){
        Intent it=new Intent(NavigationDrawers.this,RightNavigation.class);
        startActivity(it);

    }
    public void bottom(View v){
        Intent it=new Intent(NavigationDrawers.this,BotomNavigator.class);
        startActivity(it);

    }
    public void top(View v){
        Intent it=new Intent(NavigationDrawers.this,TopNavigation.class);
        startActivity(it);

    }
}
