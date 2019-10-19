package com.example.ecovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class entidada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entidada);
    }

    public void buttonRegresar(View view){
        Intent intent = new Intent(entidada.this,menuSeleccion.class);
        startActivity(intent);
    }

    public void buttonIngresar(View view){
        Intent intent = new Intent(entidada.this,MenuEntidad.class);
        startActivity(intent);
    }
}

