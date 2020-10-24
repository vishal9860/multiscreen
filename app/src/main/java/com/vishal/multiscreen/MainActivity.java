package com.vishal.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG="com.vishal.multiscreen.MSG";
    public  void PlaceOrder(View view){
        Intent intent=new Intent(this, DisplayActivity.class);
        EditText editText1=findViewById(R.id.editTextTextPersonName);
        EditText editText2=findViewById(R.id.editTextTextPersonName2);
        EditText editText3=findViewById(R.id.editTextTextPersonName3);
        String Message="order for "+editText1.getText().toString()+","+editText2.getText().toString()+"&"+editText3.getText().toString()+"is  placed";
        intent.putExtra(MSG,Message);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}