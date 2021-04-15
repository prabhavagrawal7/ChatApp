package com.example.chatapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText dataField;
    Button sendBtn;
    TextView show;
    Button junior;
    Button senior;

 String soj;
    EditText nickname;
    FirebaseDatabase db= FirebaseDatabase.getInstance();
    DatabaseReference databaseReference;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show =findViewById(R.id.textView4);
        //nickname=findViewById(R.id.nickname);
       // junior=findViewById(R.id.button4);
       // senior=findViewById(R.id.button5);
        Intent intent=getIntent();
         soj=intent.getStringExtra(JuniorOrSenior.Extra_Name);

//        senior.setOnClickListener(new View.OnClickListener() {
//            @
//            public void onClick(View v) {
//              soj="Senior: ";
//
//                junior.setVisibility(View.INVISIBLE);
//                senior.setVisibility(View.INVISIBLE);
//                junior.setClickable(false);
//                senior.setClickable(false);
//            }
//        });
//        junior.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                soj="Junior: ";
//                junior.setVisibility(View.INVISIBLE);
//                senior.setVisibility(View.INVISIBLE);
//                junior.setClickable(false);
//                senior.setClickable(false);
//            }
//        });

        dataField = findViewById(R.id.message);
        sendBtn= findViewById(R.id.button);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
                dataField.setText("");
            }


        });

        databaseReference = db.getReference();

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String s = snapshot.getValue().toString();

            // show.setText(databaseReference.child(name).get().toString());

              show.setText("\n"+show.getText()+s+"\n");

//
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }


    public void  sendData()
    {
        String dataFieldText = dataField.getText().toString();
        String id= databaseReference.push().getKey();
        if(!TextUtils.isEmpty(dataFieldText))
        {
            Data data= new Data(id,dataFieldText);
            //nickname.getText().toString();
            String name="";
            Intent intent=getIntent();
            soj=intent.getStringExtra(JuniorOrSenior.Extra_Name);
            databaseReference.child(name).setValue(soj+dataFieldText+"\n");
            //show.setText(databaseReference.child(name).get().toString());

        }
        else
        {
            Toast.makeText(this, "Please Enter a message", Toast.LENGTH_SHORT).show();
        }

//        databaseReference.addValueEventListener(
//                show.setText();
//        );
//        databaseReference.addValueEventListener(new ValueEventListener() {
////            @Override
////            public void onDataChange(@NonNull DataSnapshot snapshot) {
////                show.setText(databaseReference.get().toString()+"");
//////                String s=snapshot.getValue().toString();
//////                String me = null;
//////                for(int i=0;i<s.length();i++)
//////                {
//////                    if((s.charAt(i) == '=')
//////                    {
//////                    }
//////                }
//////                System.out.println(me);
////                //show.setText(me);
////            }
////
////            @Override
////            public void onCancelled(@NonNull DatabaseError error) {
////
////            }
//        });
    }

}