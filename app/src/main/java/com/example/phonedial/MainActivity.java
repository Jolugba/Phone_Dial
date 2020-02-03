package com.example.phonedial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button button;
    public static  final  String EXTRA_TEXT="estherjolugba@yahoo.com.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.submit_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
                Toast toast= Toast.makeText(getApplicationContext(),"YOU ARE WELCOME TO PHONE DIAL",Toast.LENGTH_SHORT);
                toast.show();


            }

        });
            }

    public void openActivity2(){


        EditText editText2 =findViewById(R.id.phoneNumber_edit_text);
        //int number=Integer.parseInt(editText2.getText().toString());
        String text =editText2.getText().toString();



        Intent intent = new Intent(this,Main2Activity.class);
        //intent.putExtra(EXTRA_TEXT,text);
        intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);
    }
}
