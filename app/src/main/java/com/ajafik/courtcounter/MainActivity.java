package com.ajafik.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA =0;
    int scoreTeamB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void plus_three_score_a(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void plus_two_score_a(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void free_throw_score_a(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void plus_three_score_b(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void plus_two_score_b(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void free_throw_score_b(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset_score(View view){
         scoreTeamA =0;
         scoreTeamB =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
