package com.example.pabloproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);
    }

    public void ClickOnOffice(View view) {
        TextView tv = findViewById(R.id.textView2);
        tv.setText("Como te atreves!!!");
        Toast.makeText(Ejercicio4.this,"Has pulsado MS Office", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }

    public void ClickOnLibreOffice(View view) {
        TextView tv = findViewById(R.id.textView2);
        tv.setText("Como te atreves!!!");
        Toast.makeText(Ejercicio4.this,"Has pulsado LibreOffice", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }

    public void ClickOnOpenOffice(View view) {
        TextView tv = findViewById(R.id.textView2);
        tv.setText("Como te atreves!!!");
        Toast.makeText(Ejercicio4.this,"Has pulsado OpenOffice", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }
    public void toMainActivity (View view){
        Intent intent = new Intent(this, MainActivity.class);                      //el intent va a tener que recibir el contexto de la actividad
        startActivity(intent);
    }
}