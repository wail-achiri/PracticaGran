package com.example.practicagran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView restaurants;
    ImageView parkings;
    ImageView movies;
    ImageView hotels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restaurants = findViewById(R.id.restaurant);
        restaurants.setOnClickListener(this);

        parkings = findViewById(R.id.parking);
        parkings.setOnClickListener(this);

        movies = findViewById(R.id.movie);
        movies.setOnClickListener(this);

        hotels = findViewById(R.id.hotel);
        hotels.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ImageView imatgeCategoria = (ImageView) v;
        String nomImatge = String.valueOf(imatgeCategoria.getTag());


        if(nomImatge.equals("img_icon_parking"))
        {
            Intent intent = new Intent(this,Parkings.class);
            startActivity(intent);
        }
        else if(nomImatge.equals("restaurant"))
        {
            Intent intent = new Intent(this,Restaurants.class);
            startActivity(intent);
        }
        else if(nomImatge.equals("movie"))
        {
            Intent intent = new Intent(this,Movies.class);
            startActivity(intent);
        }
        else if(nomImatge.equals("hotel"))
        {
            Intent intent = new Intent(this,hotels.class);
            startActivity(intent);
        }
    }
}