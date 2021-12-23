package com.dicoding.picodiploma.mysubmission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private RecyclerView rvGames;
    private ArrayList<Game> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGames = findViewById(R.id.rv_games);
        rvGames.setHasFixedSize(true);

        list.addAll(GamesData.getListData());
        showRecyclerList();



    }

    private void showRecyclerList(){
        rvGames.setLayoutManager(new LinearLayoutManager(this));
        ListGameAdapter listGameAdapter = new ListGameAdapter(list);
        rvGames.setAdapter(listGameAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.myprofile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.myProfile:
                startActivity(new Intent(this, MyProfile.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }






}
