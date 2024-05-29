package com.politecnicomalaga.appmalaga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appmalaga.Control.PreguntaRVAdapter;
import com.politecnicomalaga.appmalaga.Control.PreguntasViewModel;
import com.politecnicomalaga.appmalaga.R;

public class Jugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jugar);

        PreguntasViewModel vmodel = new ViewModelProvider(this).get(PreguntasViewModel.class);
        vmodel.getResults().observe(this, Pregunta -> {

            RecyclerView pRecyclerView = findViewById(R.id.rvPreguntas);
            PreguntaRVAdapter pAdapter = new PreguntaRVAdapter(this, Pregunta);
            pRecyclerView.setAdapter(pAdapter);
            pRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        });

        Button btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jugar.this, Inicio.class);
                startActivity(intent);
            }
        });





    }
}