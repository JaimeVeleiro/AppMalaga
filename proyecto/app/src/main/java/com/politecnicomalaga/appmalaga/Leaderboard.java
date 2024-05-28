package com.politecnicomalaga.appmalaga;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leaderboard extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private static final String PREF_NAME = "LeaderboardPrefs";
    private static final String KEY_SCORES = "Scores";

    public Leaderboard(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void addScore(String name, int score) {
        String scores = sharedPreferences.getString(KEY_SCORES, "");
        String newScore = name + ":" + score + ",";
        sharedPreferences.edit().putString(KEY_SCORES, scores + newScore).apply();
    }

    public List<String> getScores() {
        String scores = sharedPreferences.getString(KEY_SCORES, "");
        List<String> scoreList = new ArrayList<>(Arrays.asList(scores.split(",")));
        scoreList.removeIf(String::isEmpty); // Remove empty strings if any
        return scoreList;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_leaderboard);

        Button btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Leaderboard.this, Inicio.class);
                startActivity(intent);
            }
        });



    }
}

