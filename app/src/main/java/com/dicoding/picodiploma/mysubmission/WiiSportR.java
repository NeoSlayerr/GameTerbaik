package com.dicoding.picodiploma.mysubmission;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class WiiSportR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wiisportr);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Wii Sports Resort");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
