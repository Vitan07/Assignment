package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText et, et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et = findViewById(R.id.name);
        et1 = findViewById(R.id.emailid);
        et2 = findViewById(R.id.pass);
    }

    public void register(View view) {
        String data = et.getText().toString();
        String data1 = et1.getText().toString();
        String data2 = et2.getText().toString();
        if (data.isEmpty()) {
            Toast.makeText(this, "Enter username", Toast.LENGTH_SHORT).show();
        }
        if (data1.isEmpty()) {
            Toast.makeText(this, "Enter email-id", Toast.LENGTH_SHORT).show();
        }
        if (data2.isEmpty()) {
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
        } else {
            Intent i2 = new Intent(this, MainActivity.class);
            startActivity(i2);

        }
    }
}