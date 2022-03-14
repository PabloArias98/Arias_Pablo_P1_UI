package com.example.pabloproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Ejercicio1 extends AppCompatActivity {

    RadioGroup rad1;
    RadioButton rtFire, rtChrome, rtVivaldi;
    public static final String ERROR_OP = "error";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        rad1 = findViewById(R.id.radgroup);
        rtFire = findViewById(R.id.chFire);
        rtChrome = findViewById(R.id.chChrome);
        rtVivaldi = findViewById(R.id.chVivaldi);

        rad1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.chFire){
                    Toast.makeText(Ejercicio1.this, "Has seleccionado Firefox", Toast.LENGTH_SHORT).show();
                }
                else if (checkedId==R.id.chChrome){
                    Toast.makeText(Ejercicio1.this, "Ha seleccionado Chrome", Toast.LENGTH_SHORT).show();

                }
                else if (checkedId==R.id.chVivaldi){
                    Toast.makeText(Ejercicio1.this, "Ha seleccionado Vivaldi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void toMainActivity (View view) {
        if (!rtChrome.isChecked() && !rtVivaldi.isChecked() && !rtFire.isChecked()) {
            Intent intent = new Intent (Ejercicio1.this, MainActivity.class);
            startActivity(intent.putExtra(ERROR_OP, "No ha seleccionado ninguna de las opciones"));
        } else {

        }
    }
}