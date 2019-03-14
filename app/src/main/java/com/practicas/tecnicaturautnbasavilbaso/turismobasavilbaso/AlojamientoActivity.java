package com.practicas.tecnicaturautnbasavilbaso.turismobasavilbaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class AlojamientoActivity extends AppCompatActivity {

    ImageButton call5Soles;
    ImageButton callRobertito;
    ImageButton callDelOeste;
    ImageButton callMBurucuya;
    ImageButton callElTala;
    ImageButton callElNe;
    ImageButton callBungTermas;
    ImageButton callCampPoli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alojamiento);

    //call5Soles(ImageButton)=findViewById(); falta el R.id
    //callRobertito(ImageButton)=findViewById(); falta el R.id
    //callDelOeste(ImageButton)=findViewById(); falta el R.id.
    //callMBurucuya(ImageButton)=findViewById(); falta el R.id.
    //callElTala(ImageButton)=findViewById(); falta el R.id.
    //callElNe(ImageButton)=findViewById(); falta el R.id.
    //callBungTermas(ImageButton)=findViewById(); falta el R.id.
    //callCampPoli(ImageButton)=findViewById(); falta el R.id.
    }

    /*metodos de llamada
    public void llamar5Soles (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445645410"));

        startActivity(intent);
    }

    public void llamarRobertito (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445451590"));

        startActivity(intent);
    }

    public void llamarDelOeste (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481459"));

        startActivity(intent);
    }

    public void llamarMBurucuya (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445654036"));

        startActivity(intent);
    }

    public void llamarElTala (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445653910"));

        startActivity(intent);
    }

    public void llamarElNe (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445458315"));

        startActivity(intent);
    }

    public void llamarBungTermas (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445430083"));

        startActivity(intent);
    }

    public void llamarCampPoli (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481380"));

        startActivity(intent);
    }
     */
}
