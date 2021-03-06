package com.example.practicagran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Restaurants extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    String[] urls = {"https://www.eltrabuc.com/", "https://www.tripadvisor.es/Restaurant_Review-g670666-d10820059-Reviews-El_Gato_Verde-Granollers_Catalonia.html", "https://elcellerdejabugo.com/", "http://www.restaurantcuynes.com/es/restaurante-cuynes-granollers_134455.html", "http://www.fondaeuropa.eu/", "https://www.tripadvisor.es/Restaurant_Review-g670666-d8779106-Reviews-L_Anima_De_Granollers-Granollers_Catalonia.html","http://www.vinyam.es/"};
    String[] contacte = {"938 70 86 57", "938 40 38 36", "938 70 96 00", "938 61 30 37", "938 70 03 12", "938 70 42 91","930 23 28 99"};
    String[] mapita = {"41.590960368842374, 2.2847244553087127", "41.61092529067517, 2.2868889534571166", "41.60946061790583, 2.2892438306882825", "41.60899938572303, 2.289948384145327", "41.60841190871738, 2.2890715553092766", "41.60882475179065, 2.2906984957849708", "41.60712888819498, 2.284177426473188"};
    TextView webTrabuc,webGato,webJabugo,webCuynes,webFondaEur,webAnima,webVinyam;
    TextView trucaTrabuc,trucaGato,trucaJabugo,trucaCuynes,trucaFondaEur,trucaAnima,trucaVinyam;
    TextView mapaTrabuc,mapaGato,mapaJabugo,mapaCuynes,mapaFondaEur,mapaAnima,mapaVinyam;
    Spinner restaurants_spinner;
    CardView card1, card2, card3, card4, card5, card6, card7;
    ImageView flecha;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        /// WEB

        webTrabuc = findViewById(R.id.webTrabuc);
        webTrabuc.setOnClickListener(this);

        webGato = findViewById(R.id.webGatoVerda);
        webGato.setOnClickListener(this);

        webJabugo = findViewById(R.id.webJabugo);
        webJabugo.setOnClickListener(this);

        webCuynes = findViewById(R.id.webCuynes);
        webCuynes.setOnClickListener(this);

        webFondaEur = findViewById(R.id.webFondaEuropa);
        webFondaEur.setOnClickListener(this);

        webAnima = findViewById(R.id.webAnima);
        webAnima.setOnClickListener(this);

        webVinyam = findViewById(R.id.webVinyam);
        webVinyam.setOnClickListener(this);


        // TLF

        trucaTrabuc = findViewById(R.id.trucaTrabuc);
        trucaTrabuc.setOnClickListener(this);

        trucaGato = findViewById(R.id.trucaGatoVerde);
        trucaGato.setOnClickListener(this);

        trucaJabugo = findViewById(R.id.trucaJabugo);
        trucaJabugo.setOnClickListener(this);

        trucaCuynes = findViewById(R.id.trucaCuynes);
        trucaCuynes.setOnClickListener(this);

        trucaFondaEur = findViewById(R.id.trucaFondaEuropa);
        trucaFondaEur.setOnClickListener(this);

        trucaAnima = findViewById(R.id.trucaAnima);
        trucaAnima.setOnClickListener(this);

        trucaVinyam = findViewById(R.id.trucaVinyam);
        trucaVinyam.setOnClickListener(this);

        // MAPES

        mapaTrabuc = findViewById(R.id.mapaTrabuc);
        mapaTrabuc.setOnClickListener(this);

        mapaGato = findViewById(R.id.mapaGato);
        mapaGato.setOnClickListener(this);

        mapaJabugo = findViewById(R.id.mapaJabugo);
        mapaJabugo.setOnClickListener(this);

        mapaCuynes = findViewById(R.id.mapaCuynes);
        mapaCuynes.setOnClickListener(this);

        mapaFondaEur = findViewById(R.id.mapaFondaEur);
        mapaFondaEur.setOnClickListener(this);

        mapaAnima = findViewById(R.id.mapaAnima);
        mapaAnima.setOnClickListener(this);

        mapaVinyam = findViewById(R.id.mapaVinyam);
        mapaVinyam.setOnClickListener(this);


        /// CARDS
        card1= findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);
        card6=findViewById(R.id.card6);
        card7=findViewById(R.id.card7);

        restaurants_spinner = findViewById(R.id.spinner_restaurants);
        restaurants_spinner.setOnItemSelectedListener(this);

        // FLECHA
        flecha = findViewById(R.id.back);
        flecha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Integer posicio=null;

        /// RETURN MAIN ACTIVITY
        if(v.getId()==R.id.back){
            Intent inici = new Intent(this,MainActivity.class);
            startActivity(inici);
        }

        /// PÀGINES WEB
        switch(v.getId()){
            case R.id.webTrabuc: posicio=0;break;
            case R.id.webGatoVerda:posicio=1;break;
            case R.id.webJabugo:posicio=2;break;
            case R.id.webCuynes:posicio=3;break;
            case R.id.webFondaEuropa:posicio=4;break;
            case R.id.webAnima:posicio=5;break;
            case R.id.webVinyam:posicio=6;break;
        }
        if(posicio!=null){
            Uri uri = Uri.parse(urls[posicio]);
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }

        /// TLF
        posicio=null;
        switch(v.getId()){
            case R.id.trucaTrabuc: posicio=0;break;
            case R.id.trucaGatoVerde: posicio=1;break;
            case R.id.trucaJabugo: posicio=2;break;
            case R.id.trucaCuynes: posicio=3;break;
            case R.id.trucaFondaEuropa: posicio=4;break;
            case R.id.trucaAnima: posicio=5;break;
            case R.id.trucaVinyam: posicio=6;break;
        }

        if(posicio!=null){
            Uri tel = Uri.parse("tel:"+contacte[posicio]);
            Intent intent2 = new Intent(Intent.ACTION_DIAL,tel);
            startActivity(intent2);
        }

        /// GOOGLE MAPS
        posicio=null;
        switch(v.getId()){
            case R.id.mapaTrabuc: posicio=0;break;
            case R.id.mapaGato: posicio=1;break;
            case R.id.mapaJabugo: posicio=2;break;
            case R.id.mapaCuynes: posicio=3;break;
            case R.id.mapaFondaEur: posicio=4;break;
            case R.id.mapaAnima: posicio=5;break;
            case R.id.mapaVinyam: posicio=6;break;
        }

        if(posicio!=null){
            Uri mapa = Uri.parse("geo:" +mapita[posicio]);
            Intent intent3 = new Intent(Intent.ACTION_VIEW,mapa);
            startActivity(intent3);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        /// SPINNER
        if(position==0){
            card1.setVisibility(View.VISIBLE);
            card2.setVisibility(View.VISIBLE);
            card3.setVisibility(View.VISIBLE);
            card4.setVisibility(View.VISIBLE);
            card5.setVisibility(View.VISIBLE);
            card6.setVisibility(View.VISIBLE);
            card7.setVisibility(View.VISIBLE);
        }else if(position==1){
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.VISIBLE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.VISIBLE);
            card5.setVisibility(View.GONE);
            card6.setVisibility(View.VISIBLE);
            card7.setVisibility(View.VISIBLE);
        }else if(position==2){
            card1.setVisibility(View.VISIBLE);
            card2.setVisibility(View.VISIBLE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.VISIBLE);
            card5.setVisibility(View.VISIBLE);
            card6.setVisibility(View.GONE);
            card7.setVisibility(View.GONE);
        }else if(position==3){
            card1.setVisibility(View.VISIBLE);
            card2.setVisibility(View.GONE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.VISIBLE);
            card5.setVisibility(View.VISIBLE);
            card6.setVisibility(View.GONE);
            card7.setVisibility(View.VISIBLE);
        }
        else if(position==4){
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.GONE);
            card3.setVisibility(View.VISIBLE);
            card4.setVisibility(View.GONE);
            card5.setVisibility(View.GONE);
            card6.setVisibility(View.VISIBLE);
            card7.setVisibility(View.GONE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}