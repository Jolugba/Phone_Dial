package com.example.phonedial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent =getIntent();
       final String text =intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView textView1= findViewById(R.id.phone_no_text);

        textView1.setText(text);




    }
}
