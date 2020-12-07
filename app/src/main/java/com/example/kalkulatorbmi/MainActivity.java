package com.example.kalkulatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {
    private ImageButton mExitButton;
    private Button mOpenSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mExitButton = (ImageButton) findViewById(R.id.mExitButton);
        mExitButton.setOnClickListener(v -> System.exit(0));

        mOpenSecondActivity = (Button) findViewById(R.id.mOpenSecondActivity);
        mOpenSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


    }
    public void openActivity2() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}