package com.vishal.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display2);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.MSG);
        intent.getStringExtra(MainActivity.MSG);
        TextView textView=findViewById(R.id.textss);
        textView.setText(message);
    }
}