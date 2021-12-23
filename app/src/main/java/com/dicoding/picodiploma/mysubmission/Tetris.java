package com.dicoding.picodiploma.mysubmission;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Tetris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tetris);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tetris");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
