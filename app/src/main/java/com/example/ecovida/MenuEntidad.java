package com.example.ecovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuEntidad extends AppCompatActivity {

    public static final String user="names";
    TextView textUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_entidad);

        textUser = (TextView)findViewById(R.id.textView14);
        String user = getIntent().getStringExtra("names");
        textUser.setText("Usuario: "+user);

    }

    public void buttonRegresar(View view){
        Intent intent = new Intent(MenuEntidad.this,ingreso.class);
        startActivity(intent);

    }

    public void buttonRegistrarNuevo(View view){
        Intent intent = new Intent(MenuEntidad.this,registrarArbol.class);
        startActivity(intent);
    }



    public void buttonEscanearCodigo(View view){
        Intent intent = new Intent(MenuEntidad.this,escanearCodigo.class);
        startActivity(intent);
    }

    public void buttonReportes(View view){
        Intent intent = new Intent(MenuEntidad.this,reportes.class);
        startActivity(intent);
    }
}
