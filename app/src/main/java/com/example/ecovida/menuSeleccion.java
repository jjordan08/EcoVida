package com.example.ecovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuSeleccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_seleccion);
    }

    public void buttonEntidad(View view){
        Intent intent = new Intent(menuSeleccion.this,entidada.class);
        startActivity(intent);
    }

    public void buttonCiudadano(View view){
        Intent intent = new Intent(menuSeleccion.this, ciudadano.class);
        startActivity(intent);
        ///hola jorge
    }
}
