package com.dicoding.picodiploma.mysubmission;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class WiiSports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wiisports);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Wii Sports");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
