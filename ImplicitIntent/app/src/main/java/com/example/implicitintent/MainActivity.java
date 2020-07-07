package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.sharetext);
        b=findViewById(R.id.sbutton);
    }

    public void sharetext(View view) {
       String txt=et.getText().toString();
       String mimetype="text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimetype)
                .setChooserTitle("Share this text with:")
                .setText(txt)
                .startChooser();


    }
}