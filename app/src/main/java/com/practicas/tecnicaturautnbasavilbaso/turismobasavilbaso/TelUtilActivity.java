package com.practicas.tecnicaturautnbasavilbaso.turismobasavilbaso;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelUtilActivity extends AppCompatActivity {

    ImageButton callBomberos;
    ImageButton callCorreo;
    ImageButton callHospital;
    ImageButton callMunicipalidad;
    ImageButton callPolicia;
    ImageButton callPolidep;
    ImageButton callFlechabus;
    ImageButton callServicentro;
    ImageButton callServife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel_util);

        //casteo de los botones
        callBomberos=(ImageButton)findViewById(R.id.btnCallBomberos);
        callCorreo=(ImageButton)findViewById(R.id.btnCallCorreo);
        callHospital=(ImageButton)findViewById(R.id.btnCallHospital);
        callMunicipalidad=(ImageButton)findViewById(R.id.btnCallMunicipalidad);
        callPolicia=(ImageButton)findViewById(R.id.btnCallPolicia);
        callPolidep=(ImageButton)findViewById(R.id.btnCallPolidep);
        callFlechabus=(ImageButton)findViewById(R.id.btnCallFlecha);
        callServicentro=(ImageButton)findViewById(R.id.btnCallServicentro);
        callServife=(ImageButton)findViewById(R.id.btnCallServife);
    }

    public void llamarBomberos (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445482018"));

        startActivity(intent);
    }

    public void llamarCorreo (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481621"));

        startActivity(intent);
    }

    public void llamarHospital (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481281"));

        startActivity(intent);
    }

    public void llamarMuni (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481055"));

        startActivity(intent);
    }

    public void llamarPolicia (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481281"));

        startActivity(intent);
    }

    public void llamarPolidep (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481380"));

        startActivity(intent);
    }

    public void llamarFlecha (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445482129"));

        startActivity(intent);
    }

    public void llamarServicentro (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481000"));

        startActivity(intent);
    }

    public void llamarServife (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445482400"));

        startActivity(intent);
    }

}
