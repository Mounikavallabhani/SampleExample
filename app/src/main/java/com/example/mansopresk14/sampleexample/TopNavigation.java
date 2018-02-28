package com.example.mansopresk14.sampleexample;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SlidingDrawer;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class TopNavigation extends Activity {

    SlidingDrawer slidingdrawer;
    Button SlidingButton;
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_navigation);

        slidingdrawer = (SlidingDrawer)findViewById(R.id.slidingDrawer1);
        SlidingButton = (Button)findViewById(R.id.handle);

        slidingdrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {

            @Override
            public void onDrawerOpened() {

                Toast.makeText(TopNavigation.this, "Sliding drawer open", Toast.LENGTH_LONG).show();
            }
        });

        slidingdrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {

            public void onDrawerClosed() {

                Toast.makeText(TopNavigation.this, "Sliding drawer close", Toast.LENGTH_LONG).show();

            }

        });

    }

}