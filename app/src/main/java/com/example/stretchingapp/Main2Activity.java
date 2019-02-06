package com.example.stretchingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

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

        ListCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List newExcerciseList = new ArrayList();
                System.out.println("What would you like to name the list");
                String p = "";

            }
        });

        }
    }
}
