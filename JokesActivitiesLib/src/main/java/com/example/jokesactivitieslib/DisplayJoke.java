package com.example.jokesactivitieslib;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent extras = getIntent();
        String jj= extras.getStringExtra(String.valueOf(R.string.jokeKey));

        TextView text=findViewById(R.id.textviewForJoke);
        text.setText(jj);
    }



}