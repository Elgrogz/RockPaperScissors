package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class Intro extends AppCompatActivity {

    TextView displayRules;
    Button goToGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        displayRules = (TextView) findViewById(R.id.rules_text);
        goToGameButton = (Button) findViewById(R.id.game_button);

        displayRules.getText();

        goToGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intro.this, RockPaperRappers.class);
                startActivity(intent);
            }
        });
    }

}


