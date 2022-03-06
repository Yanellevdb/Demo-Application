package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number=1;
    TextView textpersonen;
    TextView textingredienten;
    Button plus;
    Button min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button min= findViewById(R.id.min);
        Button plus= findViewById(R.id.plus);

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textpersonen= findViewById(R.id.textpersonen);
                textpersonen.setText(String.format("Pannenkoeken voor", number, "personen"));
                number--;

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textpersonen= findViewById(R.id.textpersonen);
                textpersonen.setText(String.format("Pannenkoeken voor", number, "personen"));
                number++;

            }
        });
    }
}