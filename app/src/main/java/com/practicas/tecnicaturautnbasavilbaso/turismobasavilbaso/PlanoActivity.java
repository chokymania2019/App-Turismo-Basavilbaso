package com.practicas.tecnicaturautnbasavilbaso.turismobasavilbaso;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlanoActivity extends AppCompatActivity {

    ImageView plano;
    Button googleMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plano);

        googleMaps=(Button)findViewById(R.id.btnGoogleMaps);

        //imageView plano
        plano=(ImageView)findViewById(R.id.imageViewPlano);

        int intPlano=getResources().getIdentifier("drawable/mapabasso", null, this.getPackageName());
        plano.setImageResource(intPlano);
    }

    public void googleMaps (View view){
        Intent mapsIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.ar/maps/@-32.3727404,-58.8760139,15z?hl=es"));
        startActivity(mapsIntent);
    }
}
