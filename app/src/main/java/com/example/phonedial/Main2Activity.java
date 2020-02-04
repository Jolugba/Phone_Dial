package com.example.phonedial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent =getIntent();
       final String text =intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView textView1= findViewById(R.id.phone_no_text);

         textView1.setText(text);

        button=findViewById(R.id.dial_no_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number=Uri.parse("tel:"+text);
                Intent callIntent =new Intent(Intent.ACTION_DIAL,number);
                startActivity(callIntent);


            }
        });






    }
}
