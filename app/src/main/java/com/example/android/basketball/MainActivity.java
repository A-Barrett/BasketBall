package com.example.android.basketball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static java.lang.String.valueOf;
public class MainActivity extends AppCompatActivity {

    /**
     * Prevents scores from resetting after view rotation.
     */

    private static final String teamA_score = "team_A_score";
    private static final String teamB_score = "team_B_score";
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(valueOf(scoreTeamA));
            scoreTeamB = savedInstanceState.getInt(valueOf(scoreTeamB));

        }
        setContentView(R.layout.activity_main);

        TextView teamAscore = findViewById( R.id.team_a_score );
        teamAscore.setText(valueOf(scoreTeamA));

        TextView teamBscore = findViewById( R.id.team_b_score );
        teamBscore.setText(valueOf(scoreTeamB));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(teamA_score, scoreTeamA);
        outState.putInt(teamB_score, scoreTeamB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt(String.valueOf(scoreTeamA));
        scoreTeamB = savedInstanceState.getInt(String.valueOf(scoreTeamB));


    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Resets score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
