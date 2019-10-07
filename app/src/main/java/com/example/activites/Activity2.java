package com.example.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
     private TextView txtm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtm = (TextView) findViewById(R.id.tvnombre);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_NOMBRE);
        txtm.setText("Bienvenido: "+message);

    }
}
