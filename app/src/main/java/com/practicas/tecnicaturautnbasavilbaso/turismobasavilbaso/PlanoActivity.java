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

        int intPlano=getResources().getIdentifier("drawable/mapabassore", null, this.getPackageName());
        plano.setImageResource(intPlano);
    }

    public void googleMaps (View view){
        Intent mapsIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.ar/maps/@-32.3723761,-58.8783746,15.08z"));
        startActivity(mapsIntent);
    }
}
