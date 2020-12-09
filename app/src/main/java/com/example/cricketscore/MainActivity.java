package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore;
    private int teamBScore;
    private int teamAWicket;
    private int teamBWicket;
    private TextView textViewTeamA;
    private TextView textViewTeamB;
    private TextView textViewWicketA;
    private TextView textViewWicketB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTeamA = findViewById(R.id.team_a_score);
        textViewTeamB = findViewById(R.id.team_b_score);
        textViewWicketA = findViewById(R.id.team_a_wicket);
        textViewWicketB = findViewById(R.id.team_b_wicket);
    }

    public void add6ForTeamA(View view) {
        teamAScore = teamAScore + 6;
        displayScoreForTeamA(teamAScore);

    }

    public void add4ForTeamA(View view) {
        teamAScore = teamAScore + 4;
        displayScoreForTeamA(teamAScore);

    }


    public void add3ForTeamA(View view) {
        teamAScore = teamAScore + 3;
        displayScoreForTeamA(teamAScore);

    }

    public void add2ForTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayScoreForTeamA(teamAScore);
    }

    public void add1ForTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayScoreForTeamA(teamAScore);
    }

    public void add1ForTeamAWicket(View view) {
        teamAWicket = teamAWicket + 1;
        if (teamAWicket < 10) {
            displayWicketForTeamA(teamAWicket);
        }

    }

    private void displayWicketForTeamA(int wicket) {
        textViewWicketA.setText(String.valueOf(wicket));
    }


    public void displayScoreForTeamA(int score) {
        textViewTeamA.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score) {
        textViewTeamB.setText(String.valueOf(score));
    }

    public void add6ForTeamB(View view) {
        teamBScore = teamBScore + 6;
        displayScoreForTeamB(teamBScore);
    }

    public void add4ForTeamB(View view) {
        teamBScore = teamBScore + 4;
        displayScoreForTeamB(teamBScore);
    }

    public void add3ForTeamB(View view) {
        teamBScore = teamBScore + 3;
        displayScoreForTeamB(teamBScore);
    }

    public void add2ForTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayScoreForTeamB(teamBScore);
    }

    public void add1ForTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayScoreForTeamB(teamBScore);
    }

    public void add1ForTeamBWicket(View view) {
        teamBWicket = teamBWicket + 1;
        if (teamBWicket < 10) {
            displayWicketForTeamB(teamBWicket);
        }
    }
        private void displayWicketForTeamB(int wicket) {
            textViewWicketB.setText(String.valueOf(wicket));

        }


        public void resetScore (View view){
            teamAScore = 0;
            teamBScore = 0;
            teamAWicket = 0;
            teamBWicket = 0;
            displayScoreForTeamA(teamAScore);
            displayScoreForTeamB(teamBScore);
            displayWicketForTeamA(teamAWicket);
            displayWicketForTeamB(teamBWicket);


        }
    }




