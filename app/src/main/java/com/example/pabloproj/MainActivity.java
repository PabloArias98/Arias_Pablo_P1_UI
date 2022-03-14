package com.example.pabloproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static  com.example.pabloproj.Ejercicio1.ERROR_OP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mensaje_recibido = getIntent().getStringExtra(ERROR_OP);

        if (mensaje_recibido!=null) {
            Toast.makeText(MainActivity.this, mensaje_recibido, Toast.LENGTH_SHORT).show();
        }
    }

    public void toEjercicio1 (View view){
        Intent intent = new Intent(this, Ejercicio1.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }
    public void toEjercicio2 (View view){
        Intent intent = new Intent(this, Ejercicio2.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }
    public void toEjercicio3 (View view){
        Intent intent = new Intent(this, Ejercicio3.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }
    public void toEjercicio4 (View view){
        Intent intent = new Intent(this, Ejercicio4.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }
    public void toEjercicio5 (View view){
        Intent intent = new Intent(this, Ejercicio5.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }

    public void toEjercicio6 (View view){
        Intent intent = new Intent(this, Ejercicio6.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }

    public void toEjercicio7 (View view){
        Intent intent = new Intent(this, Ejercicio7.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }

    public void toEjercicio8 (View view){
        Intent intent = new Intent(this, Ejercicio8.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }

    public void toEjercicio9 (View view){
        Intent intent = new Intent(this, Ejercicio9.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }

    public void toEjercicio10 (View view){
        Intent intent = new Intent(this, Ejercicio10.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }

    public void toEjercicio11 (View view){
        Intent intent = new Intent(this, Ejercicio11.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }
}