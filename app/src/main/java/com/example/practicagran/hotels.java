package com.example.practicagran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hotels extends AppCompatActivity implements View.OnClickListener {
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
}