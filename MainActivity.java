package com.example.eceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button = null;
    Button reset = null;
    TextView textView = null;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        reset = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
    }

    public void addCounters(View v){
        count++;
        textView.setText("Your total is: " + Integer.toString(count));
    }
    public void reset(View v){
        count = 0;
        textView.setText("Your total is: " + Integer.toString(count));
    }
}
