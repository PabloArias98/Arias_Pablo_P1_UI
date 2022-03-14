package com.example.pabloproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio10 extends AppCompatActivity {

    Button btnBack;
    Button btnInicio;
    EditText textousuario;
    EditText textocontrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);

        //boton menu
        btnBack = (Button) findViewById(R.id.butregreso);
        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio10.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

        });


        //boton iniciar sesion
        textousuario = (EditText) findViewById(R.id.editTextTextPersonName);
        textocontrasena = (EditText) findViewById(R.id.editTextTextPassword);

        btnInicio = (Button) findViewById(R.id.butsesion);
        btnInicio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (textousuario.getText().toString().isEmpty()) {
                    Toast toast1 = Toast.makeText(getApplicationContext(),
                            R.string.Usu_error, Toast.LENGTH_SHORT);
                    toast1.show();
                } else if (textocontrasena.getText().toString().isEmpty() || (textocontrasena.getText().length() < 8)) {
                    Toast toast2 = Toast.makeText(getApplicationContext(),
                            R.string.Pass_error, Toast.LENGTH_SHORT);
                    toast2.show();
                } else {
                    Toast toast3 = Toast.makeText(getApplicationContext(),
                            R.string.Log_success, Toast.LENGTH_SHORT);
                    toast3.show();
                }

            }

        });

    }

    public void toMainActivity (View view){
        Intent intent = new Intent(this, MainActivity.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }
}