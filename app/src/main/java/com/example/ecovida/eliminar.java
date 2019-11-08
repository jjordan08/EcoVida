package com.example.ecovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class eliminar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar);
    }

    public void buttonEscanearEliminar(View view){
        Intent intent = new Intent(eliminar.this,escanearCodigo.class);
        startActivity(intent);
    }

    public void buttoneliminar(View view){

        Toast.makeText(this, "Los datos han sido eliminados", Toast.LENGTH_SHORT).show();
    }

    public void buttonAtras(View view){
        Intent intent = new Intent(eliminar.this,MenuEntidad.class);
        startActivity(intent);
    }


    
}
