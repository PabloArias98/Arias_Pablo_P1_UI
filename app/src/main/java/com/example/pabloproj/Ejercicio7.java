package com.example.pabloproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ejercicio7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);
    }

    public void toMainActivity (View view){
        Intent intent = new Intent(this, MainActivity.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }
}