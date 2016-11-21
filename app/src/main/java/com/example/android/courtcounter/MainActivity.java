package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Displays score for team A
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //Displays score for team B
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    //(Team A)button onclick will change score accordance of the type of score.

    int currentScoreTeamA = 0;
    public void addOneForTeamA(View v) {
        displayForTeamA(currentScoreTeamA = currentScoreTeamA + 1);
    }

    public void addTwoForTeamA(View v) {
        displayForTeamA(currentScoreTeamA = currentScoreTeamA + 2);
    }

    public void addThreeForTeamA(View v) {
        displayForTeamA(currentScoreTeamA = currentScoreTeamA + 3);
    }
    public void resetTeamA(View v) {
        displayForTeamA(currentScoreTeamA = 0);
    }

    //(Team B)button onclick will change score accordance of the type of score.

    int currentScoreTeamB = 0;
    public void addOneForTeamB(View v) {
        displayForTeamB(currentScoreTeamB = currentScoreTeamB + 1);
    }
    public void addTwoForTeamB(View v) {
        displayForTeamB(currentScoreTeamB = currentScoreTeamB + 2);
    }
    public void addThreeForTeamB(View v) {
        displayForTeamB(currentScoreTeamB = currentScoreTeamB + 3);
    }
    public void resetTeamB(View v) {
        displayForTeamB(currentScoreTeamB = 0);
    }

    //reset all

    public void resetAll(View v){
        currentScoreTeamA = 0;
        currentScoreTeamB = 0;

        displayForTeamB(currentScoreTeamA);
        displayForTeamA(currentScoreTeamB);
    }


}