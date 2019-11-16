package com.example.ecovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void buttonRegresar(View view){
        Intent intent = new Intent(registro.this, ingreso.class);
        startActivity(intent);
    }

    public void buttonRegistrar(View view){
        Intent intent = new Intent(registro.this, ingreso.class);
        Toast.makeText(this, "Se ha registrado Correcatamente", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

}
