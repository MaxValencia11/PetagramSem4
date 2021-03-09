package com.matscode.miscontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Desarrollador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desarrollador);

        androidx.appcompat.widget.Toolbar miActionbar = findViewById(R.id.miActionbar2);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}