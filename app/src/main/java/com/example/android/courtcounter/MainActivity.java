package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    static int goalsHomeTeam = 0;
    static int goalsGuestTeam = 0;
    static int cornersHomeTeam = 0;
    static int cornersGuestTeam = 0;
    static int foulsHomeTeam = 0;
    static int foulsGuestTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("goalsHome", goalsHomeTeam);
        savedInstanceState.putInt("cornersHome", cornersHomeTeam);
        savedInstanceState.putInt("foulsHome", foulsHomeTeam);
        savedInstanceState.putInt("goalsGuest", goalsGuestTeam);
        savedInstanceState.putInt("cornersGuest", cornersGuestTeam);
        savedInstanceState.putInt("foulsGuest", foulsGuestTeam);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int goalsHomeTeam = savedInstanceState.getInt("goalsHome");
        int cornersHomeTeam = savedInstanceState.getInt("cornersHome");
        int foulsHomeTeam = savedInstanceState.getInt("foulsHome");
        int goalsGuestTeam = savedInstanceState.getInt("goalsGuest");
        int cornersGuestTeam = savedInstanceState.getInt("cornersGuest");
        int foulsGuestTeam = savedInstanceState.getInt("foulsGuest");
        displayForHomeTeam(goalsHomeTeam, cornersHomeTeam, foulsHomeTeam);
        displayForGuestTeam(goalsGuestTeam, cornersGuestTeam, foulsGuestTeam);
    }

    /**
     * Displays the Home team's statistics.
     */
    public void displayForHomeTeam(int goals, int corners, int fouls) {
        TextView goalsView = (TextView) findViewById(R.id.goals_home_team);
        goalsView.setText(String.valueOf(goals));
        TextView cornersView = (TextView) findViewById(R.id.corners_home_team);
        cornersView.setText("Corners: " + String.valueOf(corners));
        TextView foulsView = (TextView) findViewById(R.id.fouls_home_team);
        foulsView.setText("Fouls: " + String.valueOf(fouls));
    }

    /**
     * The following methods increase Home Team's statistics by 1.
     */
    public void goal_home_team(View v) {
        goalsHomeTeam++;
        displayForHomeTeam(goalsHomeTeam, cornersHomeTeam, foulsHomeTeam);
    }

    public void add_corner_to_home_team(View v) {
        cornersHomeTeam++;
        displayForHomeTeam(goalsHomeTeam, cornersHomeTeam, foulsHomeTeam);
    }

    public void add_foul_to_home_team(View v) {
        foulsHomeTeam++;
        displayForHomeTeam(goalsHomeTeam, cornersHomeTeam, foulsHomeTeam);
    }


    /**
     * Displays the Guest Team's statistics.
     */
    public void displayForGuestTeam(int goals, int corners, int fouls) {
        TextView goalsView = (TextView) findViewById(R.id.goals_guest_team);
        goalsView.setText(String.valueOf(goals));
        TextView cornersView = (TextView) findViewById(R.id.corners_guest_team);
        cornersView.setText("Corners: " + String.valueOf(corners));
        TextView foulsView = (TextView) findViewById(R.id.fouls_guest_team);
        foulsView.setText("Fouls: " + String.valueOf(fouls));
    }

    /**
     * The following methods increase Guest Team's statistics by 1.
     */
    public void goal_guest_team(View v) {
        goalsGuestTeam++;
        displayForGuestTeam(goalsGuestTeam, cornersGuestTeam, foulsGuestTeam);
    }

    public void add_corner_to_guest_team(View v) {
        cornersGuestTeam++;
        displayForGuestTeam(goalsGuestTeam, cornersGuestTeam, foulsGuestTeam);
    }

    public void add_foul_to_guest_team(View v) {
        foulsGuestTeam++;
        displayForGuestTeam(goalsGuestTeam, cornersGuestTeam, foulsGuestTeam);
    }

    /**
     * Resets both statistics to zero.
     */
    public void reset_points(View v) {
        goalsHomeTeam = 0;
        goalsGuestTeam = 0;
        cornersHomeTeam = 0;
        cornersGuestTeam = 0;
        foulsHomeTeam = 0;
        foulsGuestTeam = 0;
        displayForHomeTeam(goalsHomeTeam, cornersHomeTeam, foulsHomeTeam);
        displayForGuestTeam(goalsGuestTeam, cornersGuestTeam, foulsGuestTeam);
    }
}
