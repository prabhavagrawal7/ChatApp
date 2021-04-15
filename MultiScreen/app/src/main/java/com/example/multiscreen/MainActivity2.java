package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView yourname,youremail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main2);
       yourname=findViewById(R.id.textView);
        Intent intent=getIntent();
        String name= intent.getStringExtra(MainActivity.Extra_Name);
       yourname.setText("Your name is "+ name);
       youremail=findViewById(R.id.emailget);
       String email= intent.getStringExtra(MainActivity.Extra_Name2);
       youremail.setText("Your email id is "+ email);

    }
}