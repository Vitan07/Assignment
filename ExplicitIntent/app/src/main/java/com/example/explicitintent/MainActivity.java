package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.username);
    }

    public void submit(View view) {
        String data = et.getText().toString();
        if (data.isEmpty()) {
            Toast.makeText(this, "Enter username", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }
    }

    public void register(View view) {
        Intent i1=new Intent(this,MainActivity3.class);
        startActivity(i1);

    }
}