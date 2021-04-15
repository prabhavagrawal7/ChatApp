package com.example.goodmorning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private TextView num1;
    private TextView num2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text =findViewById(R.id.textView);
        num1 =findViewById(R.id.num1);
        num2 =findViewById(R.id.num2);
        button=findViewById(R.id.button);
        //text.setText("Good Morning");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
               // text.setText("The sum is " + sum );
                Toast.makeText(MainActivity.this, "Ankit ek dum kutta hai", Toast.LENGTH_SHORT).show();
            }
        });

    }

}