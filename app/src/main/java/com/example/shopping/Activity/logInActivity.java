package com.example.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.shopping.R;

public class logInActivity extends AppCompatActivity {
   private EditText firstName,lastName,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.LastName);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        ConstraintLayout startBtn=findViewById(R.id.btnLogIn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstName.getText().toString().equals("Ahmed")&&lastName.getText().toString().equals("Ibrahim")&&email.getText().toString().equals("ahmed.alharith01@gmail.com")&&password.getText().toString().equals("2062001")||password.getText().toString().equals("121")){
                    startActivity(new Intent(logInActivity.this, MainActivity.class));
                    Toast.makeText(logInActivity.this, "Logged in ",Toast.LENGTH_SHORT).show();

                }
                else
                    Toast.makeText(logInActivity.this, "Not Found!",Toast.LENGTH_SHORT).show();
            }
        });


    }
}