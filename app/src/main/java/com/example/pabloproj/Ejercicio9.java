package com.example.pabloproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio9 extends AppCompatActivity {

    Button botovolver;
    Button botoguardar;
    Button btnCancelar;
    TextView visorGuardar1;
    EditText texto;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Botón de regresar al menú
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);

        botovolver = (Button) findViewById(R.id.buttonregresar);
        botovolver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio9.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

        });

        //boton de guardar
        botoguardar = (Button) findViewById(R.id.buttonguardar);
        botoguardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast toast1 = Toast.makeText(getApplicationContext(),  "Ha guardado el texto", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });



        texto = findViewById(R.id.textviewcaja);
        EditText editor = new EditText(this);
        editor.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

        //boton cancelar y marchamos del texto
        btnCancelar = (Button) findViewById(R.id.buttoncancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                texto.setText("");
            }
        });



    }
}