package com.politecnicomalaga.appmalaga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appmalaga.Control.PreguntaRVAdapter;
import com.politecnicomalaga.appmalaga.Control.PreguntasViewModel;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        PreguntasViewModel vmodel = new ViewModelProvider(this).get(PreguntasViewModel.class);
        vmodel.getResults().observe(this, Pregunta -> {

            RecyclerView pRecyclerView = findViewById(R.id.rvPreguntas);
            PreguntaRVAdapter pAdapter = new PreguntaRVAdapter(this, Pregunta);
            pRecyclerView.setAdapter(pAdapter);
            pRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        });

        Button botonConocenos = findViewById(R.id.btConocenos);
        botonConocenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Inicio.this, Conocenos.class);
                startActivity(intent);
                finish();
            }
        });

        Button botonOpciones = findViewById(R.id.btOpciones);
        botonOpciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Opciones.class);
                startActivity(intent);
                finish();
            }
            });

        Button botonLogro = findViewById(R.id.btLogros);
        botonLogro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Logros.class);
                startActivity(intent);
                finish();
            }
        });

        Button botonJugar = findViewById(R.id.btJugar);
        botonJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Jugar.class);
                startActivity(intent);
                finish();
            }
        });

        Button botonPreguntas = findViewById(R.id.btPreguntas);
        botonPreguntas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, PreguntasLibres.class);
                startActivity(intent);
                finish();
            }
        });

        Button botonLeader = findViewById(R.id.btLeaderboard);
        botonLeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Leaderboard.class);
                startActivity(intent);
                finish();
            }
        });
    }
}