package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et,et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.username);
        et1=findViewById(R.id.password);
    }

    public void submit(View view) {
        String data = et.getText().toString();
        String data1=et1.getText().toString();
        if (data.isEmpty()) {
            Toast.makeText(this, "Enter email", Toast.LENGTH_SHORT).show();
        }
        if(data1.isEmpty()){
            Toast.makeText(this,"Enter password",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }
    }

    public void register(View view) {
        Intent i1=new Intent (this,Register.class);
        startActivity(i1);
    }
}