package com.example.ecovida;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class ingreso extends AppCompatActivity implements View.OnClickListener {

    //defining view objects
    private EditText TextEmail;
    private EditText TextPassword;
    private Button btnRegistrar;
    private ProgressDialog progressDialog;
    public String user =  "user";
    public String servidor =  "servidor";
    public String clave =  "admin";


    //Declaramos un objeto firebaseAuth
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);

        //inicializamos el objeto firebaseAuth
        firebaseAuth = FirebaseAuth.getInstance();

        //Referenciamos los views
        TextEmail = (EditText) findViewById(R.id.user);
        TextPassword = (EditText) findViewById(R.id.password);
        btnRegistrar = (Button) findViewById(R.id.button5);
        progressDialog = new ProgressDialog(this);

        //attaching listener to button
        btnRegistrar.setOnClickListener(this);
    }


    private void ingresar(){


        //Obtenemos el email y la contraseña desde las cajas de texto
        final String email = TextEmail.getText().toString().trim();
        String password  = TextPassword.getText().toString().trim();

        if ((email.equals(user)) && (password.equals(clave))) {
            Intent i = new Intent(ingreso.this, menuCiudadano.class);
            startActivity(i);
        }
        else if ((email.equals(servidor)) && (password.equals(clave))){
            Intent i = new Intent(ingreso.this, MenuEntidad.class);
            startActivity(i);
        }

        //Verificamos que las cajas de texto no esten vacías
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Se debe ingresar un email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Falta ingresar la contraseña",Toast.LENGTH_LONG).show();
            return;
        }


        progressDialog.setMessage("Realizando consulta en linea...");
        progressDialog.show();

        //consultar si el usuario existe
        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>(){
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success

                        if(task.isSuccessful()){
                            int pos = email.indexOf("@");//verifica el caracter donde se encuentra en el email
                            String user = email.substring(0,pos);// envia el email hasta donde se encuentra la posicion de la @
                            Toast.makeText(ingreso.this,"Hola: "+ TextEmail.getText(),Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ingreso.this,menuCiudadano.class);
                            intent.putExtra(menuCiudadano.user, user);
                            startActivity(intent);

                            } else {
                                Toast.makeText(ingreso.this, "Datos Erroneos ", Toast.LENGTH_LONG).show();
                            }

                        progressDialog.dismiss();
                    }
                });

    }


    @Override
    public void onClick(View view) {
        //Invocamos al método:
        ingresar();
    }

    public void buttonReggistrar(View view){

        Intent intent = new Intent(ingreso.this,registro.class);
        startActivity(intent);
    }
}

