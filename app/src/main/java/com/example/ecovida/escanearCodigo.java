package com.example.ecovida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class escanearCodigo extends AppCompatActivity {


    EditText codigo;
    Button scanner;
    private ZXingScannerView vistaScanner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escanear_codigo);
    }


    public void buttonScanner (View view){

        vistaScanner = new ZXingScannerView(this);
        vistaScanner.setResultHandler(new zxingscanner());
        setContentView(vistaScanner);
        vistaScanner.startCamera();
    }

    class zxingscanner implements ZXingScannerView.ResultHandler{

        @Override
        public void handleResult(Result result) {
            String dato = result.getText();
            setContentView(R.layout.activity_escanear_codigo);
            vistaScanner.stopCamera();
            codigo = (EditText) findViewById(R.id.editText11);
            codigo.setText(dato);
        }
    }
}
