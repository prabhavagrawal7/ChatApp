package com.example.mychatapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.view.DataEvent;
import com.google.firebase.database.core.view.View;

import java.sql.DatabaseMetaData;
import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mydatabase;
    private BreakIterator myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydatabase = FirebaseDatabase.getInstance().getReference("message");

        final  TextView chat=findViewById(R.id.textView3);

        mydatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public  void sendmessage(View view)
    {

        mydatabase.setValue(myEditText.getText());
        myEditText.setText("");

    }

}