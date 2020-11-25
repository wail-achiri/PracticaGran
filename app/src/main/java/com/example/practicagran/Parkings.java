package com.example.practicagran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

public class Parkings extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    ImageView flecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parkings);


        flecha = findViewById(R.id.back);
        flecha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /// RETURN MAIN ACTIVITY
        if(v.getId()==R.id.back){
            Intent inici = new Intent(this,MainActivity.class);
            startActivity(inici);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}