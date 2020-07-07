package com.example.cameraimplicit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    ImageView iv;
    public static final int CAMERA_REQUEST_CODE=22;
    public static final int GALLERY_REQUEST_CODE=33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.camera);
        b2=findViewById(R.id.gallery);
        iv=findViewById(R.id.image);
    }

    public void Cam(View view) {
        Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,CAMERA_REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==CAMERA_REQUEST_CODE){
            if(resultCode==RESULT_OK){
                Bitmap b=(Bitmap) data.getExtras().get("data");
                iv.setImageBitmap(b);

            }
        }
        if(requestCode==GALLERY_REQUEST_CODE){
            if(resultCode==RESULT_OK){
                Uri u=data.getData();
                iv.setImageURI(u);
            }
        }
    }

    public void gal(View view) {
        Intent i1=new Intent();
        i1.setType("Image/*");
        i1.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(i1,GALLERY_REQUEST_CODE);

    }


}