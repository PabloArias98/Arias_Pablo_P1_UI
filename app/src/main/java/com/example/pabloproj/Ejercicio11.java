package com.example.pabloproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio11 extends AppCompatActivity {
    Button btnAceptar;
    EditText textotitulo;
    EditText textoautor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio11);

        textotitulo = (EditText) findViewById(R.id.editTextTitle);
        textoautor = (EditText) findViewById(R.id.editTextAutorName);

        btnAceptar = (Button) findViewById(R.id.acep_form);
        btnAceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (textotitulo.getText().toString().isEmpty()) {
                    Toast toast1 = Toast.makeText(getApplicationContext(),
                            "Por favor introduzca un titulo", Toast.LENGTH_SHORT);
                    toast1.show();
                } else if (textoautor.getText().toString().isEmpty()) {
                    Toast toast2 = Toast.makeText(getApplicationContext(),
                            "Por favor introduzca un autor", Toast.LENGTH_SHORT);
                    toast2.show();
                } else {
                    Toast toast3 = Toast.makeText(getApplicationContext(),
                            "Datos correctos!!!, pulse otra vez para salir", Toast.LENGTH_SHORT);
                    toast3.show();

                    btnAceptar.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Ejercicio11.this, MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }

                    });

                }

            }

        });
    }

    public void toMainActivity (View view){
        Intent intent = new Intent(this, MainActivity.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }


}