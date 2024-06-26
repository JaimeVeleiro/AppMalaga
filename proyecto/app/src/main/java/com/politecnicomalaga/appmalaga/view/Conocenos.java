package com.politecnicomalaga.appmalaga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.politecnicomalaga.appmalaga.R;

public class Conocenos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_conocenos);

        Button botonVolver = findViewById(R.id.btVolver);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Conocenos.this, Inicio.class);
                startActivity(intent);
                finish();
            }
        });
    }
}