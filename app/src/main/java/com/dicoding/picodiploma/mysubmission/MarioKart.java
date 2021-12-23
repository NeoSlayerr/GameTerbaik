package com.dicoding.picodiploma.mysubmission;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MarioKart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mariokart);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Mario Kart Wii");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
