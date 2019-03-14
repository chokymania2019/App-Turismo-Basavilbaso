package com.practicas.tecnicaturautnbasavilbaso.turismobasavilbaso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bandera;
    Button atractivos;
    Button alojamientos;
    Button gastronomia;
    Button telefonos;
    Button plano;
    Button fotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casteo de los botones
        atractivos=(Button)findViewById(R.id.btnAtractivos);
        alojamientos=(Button)findViewById(R.id.btnAlojamientos);
        gastronomia=(Button)findViewById(R.id.btnGastronomia);
        telefonos=(Button)findViewById(R.id.btnTelefonos);
        plano=(Button)findViewById(R.id.btnTelefonos);
        fotos=(Button)findViewById(R.id.btnFotos);

        //icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        //imageView bandera
        bandera=(ImageView)findViewById(R.id.imageViewBandera);

        int intBandera=getResources().getIdentifier("drawable/banderabassoapp", null, this.getPackageName());
        bandera.setImageResource(intBandera);



    }

    public void abrirAtractivos (View view){

        Intent inAt = new Intent (this, AtractivosActivity.class);
        startActivity(inAt);

    }

    public void abrirAlojamientos (View view){

        Intent inAl = new Intent (this, AlojamientoActivity.class);
        startActivity(inAl);

    }

    public void abrirGastronomia (View view){

        Intent inGa = new Intent (this, GastronomiaActivity.class);
        startActivity(inGa);

    }

    public void abrirTelefonos (View view){

        Intent inTel = new Intent (this, TelUtilActivity.class);
        startActivity(inTel);

    }
    public void abrirPlano (View view){

        Intent inPla = new Intent (this, PlanoActivity.class);
        startActivity(inPla);

    }

    public void abrirFotos (View view){

        Intent inFot = new Intent (this, FotosActivity.class);
        startActivity(inFot);

    }


}
