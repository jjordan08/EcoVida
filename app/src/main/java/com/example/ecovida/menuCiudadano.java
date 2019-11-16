package com.example.ecovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuCiudadano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ciudadano);
    }

    public void buttonRegresar(View view){
        Intent intent = new Intent(menuCiudadano.this, ingreso.class);
        startActivity(intent);
    }

    public void buttonRegistroArbol(View view){
        Intent intent = new Intent(menuCiudadano.this,consultarArbol.class);
        startActivity(intent);
    }

    public void buttonEscanearCodigo(View view){
        Intent intent = new Intent(menuCiudadano.this,escanearCodigo.class);
        startActivity(intent);
    }

    public void buttonReportarEmergencia(View view){
        Intent intent = new Intent(menuCiudadano.this,reportarEmergenia.class);
        startActivity(intent);
    }
}
