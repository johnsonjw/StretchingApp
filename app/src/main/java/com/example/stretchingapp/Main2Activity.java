package com.example.stretchingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main2Activity extends AppCompatActivity  {

    private Button goBack;
    private Button ListCreate;
    private TextView Scrolling;
    public List UserCreatedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Scrolling = findViewById(R.id.ListView);
        ListCreate = findViewById(R.id.CreateList);
        goBack = findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });
        //TODO Have the app create an empty untitled list and have the user input the name and save said list.
        ListCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] UntitledExerciseList = {};
                //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView.getContext(), android.R.layout.simple_list_item_1,UntitledExerciseList);


            }
        });

        }
    }

