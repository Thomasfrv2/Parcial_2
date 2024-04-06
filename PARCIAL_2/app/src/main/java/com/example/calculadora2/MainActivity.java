package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombre, apellido, correo, cedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nombre = findViewById(R.id.nombre);
        apellido = findViewById(R.id.Apellido);
        correo = findViewById(R.id.correo);
        cedula = findViewById(R.id.cedula);


    }

    public void ADMINISTRACION(View view) {

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("correo", correo.getText().toString());
        intent.putExtra("Cedula", cedula.getText().toString());
        startActivity(intent);
    }

    public void GASTRONOMIA(View view) {

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("correo", correo.getText().toString());
        intent.putExtra("Cedula", cedula.getText().toString());
        startActivity(intent);
    }

    public void INGENIERIA(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("correo", correo.getText().toString());
        intent.putExtra("Cedula", cedula.getText().toString());
        startActivity(intent);
    }

    public void PROGRAMACION(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("correo", correo.getText().toString());
        intent.putExtra("Cedula", cedula.getText().toString());
        startActivity(intent);
    }


    public void CIENCIASDELDEPORTE(View view) {
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        startActivity(intent);
    }




    public void POLITICA(View view) {
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        startActivity(intent);
    }
}
