package com.practicas.tecnicaturautnbasavilbaso.turismobasavilbaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class GastronomiaActivity extends AppCompatActivity {

    ImageButton callLaChacra;
    ImageButton callClemente;
    ImageButton callRobertito;
    ImageButton callElBar;
    ImageButton callBahamas;
    ImageButton callLaOchava;
    ImageButton callPipols;
    ImageButton callHilda;
    ImageButton callBobe;
    ImageButton callSara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastronomia);

        /*casteo botones
        callLaChacra(ImageButton)=findViewById(R.id);
        callClemente(ImageButton)=findViewById(R.id);
        callRobertito(ImageButton)=findViewById(R.id);
        callElBar(ImageButton)=findViewById(R.id);
        callBahamas(ImageButton)=findViewById(R.id);
        callLaOchava(ImageButton)=findViewById(R.id);
        callPipols(ImageButton)=findViewById(R.id);
        callHilda(ImageButton)=findViewById(R.id);
        callBobe(ImageButton)=findViewById(R.id);
        callSara(ImageButton)=findViewById(R.id);
         */
    }

    /*metodos llamadas
    public void llamarLaChacra (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445419896"));

        startActivity(intent);
    }

    public void llamarClemente (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445451247"));

        startActivity(intent);
    }

    public void llamarRobertito (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481590"));

        startActivity(intent);
    }

    public void llamarElBar (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445482611"));

        startActivity(intent);
    }

    public void llamarBahamas (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445482387"));

        startActivity(intent);
    }

    public void llamarLaOchava (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481853"));

        startActivity(intent);
    }

    public void llamarPipols (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445453973"));

        startActivity(intent);
    }

    public void llamarHilda (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445440045"));

        startActivity(intent);
    }

    public void llamarBobe (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445456703"));

        startActivity(intent);
    }

    public void llamarSara (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481023"));

        startActivity(intent);
    }
     */
}
