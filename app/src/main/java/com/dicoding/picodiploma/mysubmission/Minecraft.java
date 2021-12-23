package com.dicoding.picodiploma.mysubmission;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Minecraft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minecraft);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Minecraft");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
