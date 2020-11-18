package com.example.practicagran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class hotels extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    String[] urls = {"https://www.hoteliris.com","https://www.hotelaugustavalles.com","https://www.hotelciutatgranollers.com","https://www.hotelgranollers.com"};
    String[] contacte = {"938792929","938456050","938796220","938795100"};
    TextView webIris;
    TextView webAugusta;
    TextView webCiutat;
    TextView webGranollers;
    TextView trucaIris;
    TextView trucaAugusta;
    TextView trucaCiutat;
    TextView trucaGranollers;
    CardView card1,card2,card3,card4;
    Spinner hotel_spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        webIris = findViewById(R.id.webIris);
        webIris.setOnClickListener(this);

        webAugusta = findViewById(R.id.webAugusta);
        webAugusta.setOnClickListener(this);

        webCiutat = findViewById(R.id.webCiutat);
        webCiutat.setOnClickListener(this);

        webGranollers = findViewById(R.id.webGrano);
        webGranollers.setOnClickListener(this);

        trucaIris = findViewById(R.id.trucaIris);
        trucaIris.setOnClickListener(this);

        trucaAugusta = findViewById(R.id.trucaAugusta);
        trucaAugusta.setOnClickListener(this);

        trucaCiutat = findViewById(R.id.trucaCiutat);
        trucaCiutat.setOnClickListener(this);

        trucaGranollers = findViewById(R.id.trucaGrano);
        trucaGranollers.setOnClickListener(this);
        card1= findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        card4=findViewById(R.id.card4);
        hotel_spinner = findViewById(R.id.spinner_hotel);

        hotel_spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {
        Integer posicio=null;

        switch(v.getId()){
            case R.id.webIris: posicio=0;break;
            case R.id.webAugusta:posicio=1;break;
            case R.id.webCiutat:posicio=2;break;
            case R.id.webGrano:posicio=3;break;
        }
        if(posicio!=null){
            Uri uri = Uri.parse(urls[posicio]);
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }

        posicio=null;
        switch(v.getId()){
            case R.id.trucaIris: posicio=0;break;
            case R.id.trucaAugusta: posicio=1;break;
            case R.id.trucaCiutat: posicio=2;break;
            case R.id.trucaGrano: posicio=3;break;
        }

        if(posicio!=null){
            Uri tel = Uri.parse("tel:"+contacte[posicio]);
            Intent intent2 = new Intent(Intent.ACTION_DIAL,tel);
            startActivity(intent2);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){
            card1.setVisibility(View.VISIBLE);
            card2.setVisibility(View.VISIBLE);
            card3.setVisibility(View.VISIBLE);
            card4.setVisibility(View.VISIBLE);
        }else if(position==1){
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.VISIBLE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.GONE);
        }else if(position==2){
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.GONE);
            card3.setVisibility(View.VISIBLE);
            card4.setVisibility(View.VISIBLE);
        }else if(position==3){
            card1.setVisibility(View.VISIBLE);
            card2.setVisibility(View.GONE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.GONE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}