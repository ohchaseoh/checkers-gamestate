package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * @authors Chase Ohmstede, Mohammad Surur, Alex Martinez-Lopez
 * @version 10/13/22
 *
 * An accurate and playable depiction of the game Checkers, written using Android API
 * Network play and AI soon to be available
 *
 * Bugs: doesn't work yet (just the GameState)
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // C: sets up the test button
        Button testButton = (Button) findViewById(R.id.testButton);
        testButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // C: setting up the edit text
                //EditText multilineText = (EditText) findViewById(R.id.editTextTextMultiLine);
                //multilineText.setText("");

                // C: new instance of GameState class
                CheckerState firstState = new CheckerState();

                // C: deep copy of firstState
                CheckerState secondState = new CheckerState(firstState);

            }
        });
    }
}