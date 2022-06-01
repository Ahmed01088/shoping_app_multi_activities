package com.example.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.shopping.R;

public class SupportActivity extends AppCompatActivity {
   private  ConstraintLayout btnBack;
   private ConstraintLayout btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        btnBack=findViewById(R.id.btnSupportLogOut);
        btnHome=findViewById(R.id.backHomeFromSupport);
                btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SupportActivity.this,MainActivity.class));
            }
        });

    }
}