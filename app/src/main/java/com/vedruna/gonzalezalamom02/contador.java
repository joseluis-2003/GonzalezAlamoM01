package com.vedruna.gonzalezalamom02;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class contador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contador);

        String username = getIntent().getStringExtra("usuario");

        TextView nombre = findViewById(R.id.ByUser);

        nombre.setText("Bienvenido, " + username);

    }
}
