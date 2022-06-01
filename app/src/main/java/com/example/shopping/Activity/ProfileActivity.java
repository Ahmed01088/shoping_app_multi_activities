package com.example.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

import com.example.shopping.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ConstraintLayout btnLogOut=findViewById(R.id.btnLogOut);
        btnLogOut.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}