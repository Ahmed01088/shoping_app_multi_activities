package com.example.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SearchView;

import com.example.shopping.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        SearchView searchView=findViewById(R.id.search);

    }
}