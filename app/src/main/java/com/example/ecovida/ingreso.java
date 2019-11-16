package com.example.ecovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ingreso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
    }



    public void buttonIngresar(View view){
        Intent intent = new Intent(ingreso.this,menuCiudadano.class);
        startActivity(intent);
    }

    public void buttonReggistrar(View view){

        Intent intent = new Intent(ingreso.this,registro.class);
        startActivity(intent);
    }
}

