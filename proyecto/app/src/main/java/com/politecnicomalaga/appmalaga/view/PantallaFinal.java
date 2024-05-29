package com.politecnicomalaga.appmalaga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.politecnicomalaga.appmalaga.R;

public class PantallaFinal extends AppCompatActivity {
    private int score; // Asume que esta es tu puntuación calculada durante el juego
    private Leaderboard leaderboard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla_final);

        EditText etName = findViewById(R.id.et_nombre);
        Button btAceptar = (Button) findViewById(R.id.btAceptar);
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                if (!name.isEmpty()) {
                    Intent intent = new Intent(PantallaFinal.this, Leaderboard.class);
                    intent.putExtra("NAME", name);
                    startActivity(intent);
                }
            }
        });


    }
}