package com.example.chatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JuniorOrSenior extends AppCompatActivity {
    Button junior;
    Button senior;
    String so;
    public static final String Extra_Name="com.example.chatapplication.extra.Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_or_senior);



        junior=findViewById(R.id.button2);
        senior=findViewById(R.id.button3);



        senior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 so="Doubt:- ";
                openActivity(v);
            }
        });
        junior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so="Doubt Solver:- ";
                openActivity(v);
            }
        });
    }


    public void openActivity(View v)
    {
        Intent intent =new Intent(this, MainActivity.class);
        intent.putExtra(Extra_Name,so);
        startActivity(intent);
    }

}