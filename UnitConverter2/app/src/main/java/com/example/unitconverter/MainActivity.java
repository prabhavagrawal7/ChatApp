package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        textView= findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Convert button works", Toast.LENGTH_SHORT).show();
//                String s= editText.getText().toString();
//                int kg=Integer.parseInt(s);
//                int grams = 1000*kg;
//                textView.setText("The corresponding value in grams is " + grams + " grams");
//            }
//        });

        }
    public void calculate(View view){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        int grams = 1000 * kg;
        textView.setText("The corresponding value in grams is " + grams + " grams");
    }
}