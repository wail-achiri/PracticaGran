package com.example.practicagran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView restaurants;
    ImageView parkings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restaurants = findViewById(R.id.restaurant);
        restaurants.setOnClickListener(this);

        parkings = findViewById(R.id.parking);
        parkings.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ImageView imatgeCategoria = (ImageView) v;
        String nomImatge = String.valueOf(imatgeCategoria.getTag());


        if(nomImatge.equals("parking"))
        {
            Intent intent = new Intent(this,Parkings.class);
            startActivity(intent);
        }
        else if(nomImatge.equals("restaurant"))
        {
            ///Intent intent = new Intent(this,Restaurants.class);
            ///startActivity(intent);
        }
    }
}