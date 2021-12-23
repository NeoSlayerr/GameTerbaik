package com.dicoding.picodiploma.mysubmission;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SuperMario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supermario);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Super Mario Bros");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
