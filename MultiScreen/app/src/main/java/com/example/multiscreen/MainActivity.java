package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText namevariable;
    EditText emailid;
    public  static final  String Extra_Name= "com.example.multiscreen.extra.NAME";
    public  static  final  String Extra_Name2="email-id of user";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void  openActivity(View v)
    {
        Toast.makeText(this, "toast chal raha hai", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this, MainActivity2.class );
        namevariable =findViewById(R.id.name);
        String nameText = namevariable.getText().toString();
        intent.putExtra(Extra_Name,nameText);

        emailid=findViewById(R.id.email);
        String email=emailid.getText().toString();
        //intent = new Intent(this, MainActivity2.class);
        intent.putExtra(Extra_Name2,email);
        startActivity(intent);
    }


}