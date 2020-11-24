package com.example.practicagran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Movies extends AppCompatActivity implements View.OnClickListener {
    ImageView flecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        flecha = findViewById(R.id.back);
        flecha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.back){
            Intent inici = new Intent(this,MainActivity.class);
            startActivity(inici);
        }
    }
}