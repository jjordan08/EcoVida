package com.example.ecovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ciudadano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudadano);
    }

    public void buttonRegresar(View view){
        Intent intent = new Intent(ciudadano.this,menuSeleccion.class);
        startActivity(intent);
    }

    public void buttonIngresar(View view){
        Intent intent = new Intent(ciudadano.this,menuCiudadano.class);
        startActivity(intent);
    }

    public void buttonReggistrar(View view){

        Intent intent = new Intent(ciudadano.this,registro.class);
        startActivity(intent);
    }
}

