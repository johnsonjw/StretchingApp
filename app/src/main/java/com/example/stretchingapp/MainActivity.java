package com.example.stretchingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button CreateLists;
    private Button BackStretches;
    private Button ThighStretches;
    private Button NeckStretches;
    private Button TricepStretches;
    private Button HamstringStretches;
    private Button ShoulderStreches;
    private Button ChestStreches;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateLists =  findViewById(R.id.CreateList);
        BackStretches = findViewById(R.id.Backmus);
        ThighStretches = findViewById(R.id.Thighs);
        NeckStretches = findViewById(R.id.Neck);
        TricepStretches = findViewById(R.id.Triceps);
        HamstringStretches = findViewById(R.id.Hamstrings);
        ShoulderStreches = findViewById(R.id.Shoulders);
        ChestStreches = findViewById(R.id.Chest);


        CreateLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  forwardIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(forwardIntent);
            }
        });

        BackStretches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ViewingBackStretches = new Intent( MainActivity.this, BackExercises.class);
                startActivity(ViewingBackStretches);
            }
        });
        ThighStretches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ViewingThighStretches = new Intent(MainActivity.this, ThighExercises.class);
                startActivity(ViewingThighStretches);
            }
        });
        NeckStretches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ViewingNeckStretches = new Intent(MainActivity.this, NeckExercises.class);
                startActivity(ViewingNeckStretches);
            }
        });
        TricepStretches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ViewingNeckStretches = new Intent(MainActivity.this, NeckExercises.class);
                startActivity(ViewingNeckStretches);
            }
        });
        HamstringStretches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ViewingNeckStretches = new Intent(MainActivity.this, NeckExercises.class);
                startActivity(ViewingNeckStretches);
            }
        });
        ShoulderStreches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ViewingNeckStretches = new Intent(MainActivity.this, NeckExercises.class);
                startActivity(ViewingNeckStretches);
            }
        });
        ChestStreches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ViewingNeckStretches = new Intent(MainActivity.this, NeckExercises.class);
                startActivity(ViewingNeckStretches);
            }
        });
    }
}
