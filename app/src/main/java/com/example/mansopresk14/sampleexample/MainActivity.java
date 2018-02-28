package com.example.mansopresk14.sampleexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;

import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends Activity  {

    SeekBar seekBar1;
    CheckBox checkbox;
    EditText username, password;
    Button login, valid,test;
    RatingBar rating;
    RadioGroup radiogroup;
    RadioButton radioButton;
    Spinner spinner;
    Switch s1;
    ToggleButton tb;
    TextView date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.Password);
        login = (Button) findViewById(R.id.login);
        valid = (Button) findViewById(R.id.validate);
        rating = (RatingBar) findViewById(R.id.rating);
        radiogroup = (RadioGroup) findViewById(R.id.radiogroup);
        spinner = (Spinner) findViewById(R.id.spinner);
        test = (Button) findViewById(R.id.test);
        s1 = (Switch) findViewById(R.id.s1);
        tb = (ToggleButton) findViewById(R.id.tb1);
        date = (TextView) findViewById(R.id.date);
        String dt;
        Date cal = (Date) Calendar.getInstance().getTime();
        dt = cal.toLocaleString();
        date.setText(dt.toString());
        checkbox = (CheckBox) findViewById(R.id.chechbox);
        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progressChangedValue=i;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, " seek bar is :"+progressChangedValue, Toast.LENGTH_SHORT).show();

            }
        });

    }






    public void valid(View v) {

        if (username.getText().toString().isEmpty()) {
            username.requestFocus();
            username.setError("");
        } else if (password.getText().toString().isEmpty()) {
            password.requestFocus();
            password.setError("");

        }
        else {
            if (checkbox.isChecked()) {
                Toast.makeText(this, "validation suceessful", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, " accept term and condions", Toast.LENGTH_SHORT).show();

            }
        }


    }

    public  void clearing(View v)
    {
        username.setText("");
        password.setText("");
    }
    public  void validate(View v)

    {
        String rating1=String.valueOf(rating.getRating());
        int selectedId=radiogroup.getCheckedRadioButtonId();
        radioButton=(RadioButton)findViewById(selectedId);
        String st=spinner.getSelectedItem().toString();
        Toast.makeText(MainActivity.this,radioButton.getText().toString()+""+rating1+" "+st,Toast.LENGTH_SHORT).show();


    }
    public void test(View v)
    {
        if (s1.isChecked()&&tb.isChecked()) {
            Toast.makeText(this, "on", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "0ff", Toast.LENGTH_SHORT).show();
        }

    }




}


