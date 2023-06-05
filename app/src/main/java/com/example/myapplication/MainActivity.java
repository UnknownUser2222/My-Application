package com.example.myapplication;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity  {
    TextView txtOurText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOurText = (TextView) findViewById(R.id.textView);
        txtOurText.setText("Text");
        txtOurText.setTextSize(40);


    }
}