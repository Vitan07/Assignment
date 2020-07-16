package com.example.droidcafe;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    ImageView iv1,iv2,iv3;
    Toolbar tb;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1=findViewById(R.id.venice);
        iv2=findViewById(R.id.spain);
        iv3=findViewById(R.id.norway);
        tb=findViewById(R.id.my_toolbar);
        setSupportActionBar(tb);
        tb.showOverflowMenu();
    }

    private void setSupportActionBar(Toolbar mytoolbar) {
    }

    public void submit(View view) {
        Toast.makeText(this,"This is venice",Toast.LENGTH_SHORT).show();
    }

    public void display(View view) {
        Toast.makeText(this,"This is spain",Toast.LENGTH_SHORT).show();
    }

    public void onclick(View view) {
        Toast.makeText(this,"This is norway",Toast.LENGTH_SHORT).show();
    }
}