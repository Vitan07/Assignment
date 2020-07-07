package com.example.dataparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.email);
        e2=findViewById(R.id.roll);
        e3=findViewById(R.id.name);
        e4=findViewById(R.id.pass);
        e5=findViewById(R.id.phone);
        e6=findViewById(R.id.dat);
        b=findViewById(R.id.submit);
        tv=findViewById(R.id.ress);
    }

    public void display(View view) {
        String email=e1.getText().toString();
        String roll=e2.getText().toString();
        String name=e3.getText().toString();
        String pass=e4.getText().toString();
        String phone=e5.getText().toString();
        String dat=e6.getText().toString();
        tv.setText(email+"\n"+roll+"\n"+name+"\n"+pass+"\n"+phone+"\n"+dat);
    }
}