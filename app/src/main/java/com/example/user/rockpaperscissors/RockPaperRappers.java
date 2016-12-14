package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperRappers extends AppCompatActivity {

    Button dreButton;
    Button tupacButton;
    Button biggieButton;
    TextView displayComputerChoice;
    TextView displayWinner;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dreButton = (Button) findViewById(R.id.dre_button);
        tupacButton = (Button) findViewById(R.id.tupac_button);
        biggieButton = (Button) findViewById(R.id.biggie_button);
        displayComputerChoice = (TextView) findViewById(R.id.display_computer_choice);
        displayWinner = (TextView) findViewById(R.id.display_winner);

        game = new Game();

        biggieButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                game.setPlayerChoice("Biggie");
                String choice = game.getComputerChoice();
                displayComputerChoice.setText(choice);

                game.decideRapBattleWinner();
                String winner = game.getWinner();
                displayWinner.setText(winner);
            }
        });

        tupacButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                game.setPlayerChoice("2Pac");
                String choice = game.getComputerChoice();
                displayComputerChoice.setText(choice);

                game.decideRapBattleWinner();
                String winner = game.getWinner();
                displayWinner.setText(winner);
            }

        });

        dreButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                game.setPlayerChoice("Dr Dre");
                String choice = game.getComputerChoice();
                displayComputerChoice.setText(choice);

                game.decideRapBattleWinner();
                String winner = game.getWinner();
                displayWinner.setText(winner);
            }
        });
    }
}
