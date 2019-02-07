package com.practicas.tecnicaturautnbasavilbaso.turismobasavilbaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bandera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        //imageView bandera
        bandera=(ImageView)findViewById(R.id.imageViewBandera);

        int intBandera=getResources().getIdentifier("drawable/bandera basso app", null, this.getPackageName());
        bandera.setImageResource(intBandera);



    }
}
