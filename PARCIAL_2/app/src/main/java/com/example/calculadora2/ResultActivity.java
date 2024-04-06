package com.example.calculadora2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String apellido = extras.getString("apellido");


        TextView nombreTextView = findViewById(R.id.nombreTextView);
        TextView apellidoTextView = findViewById(R.id.apellidoTextView);
        nombreTextView.setText(nombre);
        apellidoTextView.setText(apellido);

    }



    public void devolver(View view) {
        finish();
    }
}

