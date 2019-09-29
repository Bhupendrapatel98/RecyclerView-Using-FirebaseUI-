package com.example.recylerviewfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private EditText name,email,number,password;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        number=findViewById(R.id.number);
        password=findViewById(R.id.password);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HashMap<String,Object> map=new HashMap<>();
                map.put("name",name.getText().toString());
                map.put("email",email.getText().toString());
                map.put("number",number.getText().toString());
                map.put("password",password.getText().toString());

                FirebaseDatabase.getInstance().getReference().child("insert").push()
                        .setValue(map);

                Intent intent=new Intent(MainActivity.this,PostList.class);
                startActivity(intent);
            }
        });

    }
}
