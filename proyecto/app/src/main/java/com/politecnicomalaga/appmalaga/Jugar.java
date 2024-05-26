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

import com.politecnicomalaga.appmalaga.Data.Pregunta;

public class Jugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jugar);

        Button btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jugar.this, Inicio.class);
                startActivity(intent);
            }
        });

        Pregunta preguntaActual = new Pregunta("Cuantos dias tiene la semana","url","1,4,6,7","7");

/*
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button) v;
                String textoBt = boton.getText().toString();
                Comprobacion comp = new Comprobacion();
                boolean esCorrecto = comp.compararTextos(textoBt,preguntaActual);
                if(esCorrecto){
                    //Puntuacion++
                    //Cambiar de pregunta
                }else{
                    //Cambiar de pregunta
                }

            }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);*/

    }
}