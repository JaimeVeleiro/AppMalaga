package com.politecnicomalaga.appmalaga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.politecnicomalaga.appmalaga.R;

import java.util.ArrayList;

public class Leaderboard extends AppCompatActivity {
    private ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_leaderboard);


            String name = getIntent().getStringExtra("NAME");

            // Agregar el nuevo nombre a la lista de nombres
            if (name != null) {
                names.add(name);
            }

            // Mostrar los nombres en los TextViews correspondientes
            TextView tvName1 = findViewById(R.id.tvName1);
            TextView tvName2 = findViewById(R.id.tvName2);
            TextView tvName3 = findViewById(R.id.tvName3);
            TextView tvName4 = findViewById(R.id.tvName4);
            TextView tvName5 = findViewById(R.id.tvName5);

            for (int i = 0; i < names.size(); i++) {
                String nameToShow = names.get(i);
                switch (i) {
                    case 0:
                        tvName1.setText("1:" + nameToShow);
                        break;
                    case 1:
                        tvName2.setText("2:" + nameToShow);
                        break;
                    case 2:
                        tvName3.setText("3:" +nameToShow);
                        break;
                    case 3:
                        tvName4.setText("4:" + nameToShow);
                        break;
                    case 4:
                        tvName5.setText("5:" + nameToShow);
                        break;
                }
            }

        Button btnBack = (Button)findViewById(R.id.btVolver);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Leaderboard.this, Inicio.class);
                startActivity(intent);
            }
        });





    }
}

