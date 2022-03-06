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

            min=findViewById(R.id.min);
            plus=findViewById(R.id.plus);
            textpersonen=findViewById(R.id.textpersonen);

            update();

            min.setOnClickListener(view ->
            {
                number--;
                MainActivity.this.update();
            });

        plus.setOnClickListener(view ->
            {
                number--;
                update();
            });
        }

        void update(){
            textpersonen.setText(String.format("Pannenkoeken voor", number, "personen"));
            plus.setEnabled(number < 15);
            min.setEnabled(number > 1);
        }
    }