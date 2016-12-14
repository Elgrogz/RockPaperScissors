package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperRappers extends AppCompatActivity {

    EditText choiceEditText;
    Button battleButton;
    TextView displayComputerChoice;
    TextView displayWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        choiceEditText = (EditText)findViewById(R.id.sentence_text);
        battleButton = (Button) findViewById(R.id.count_button);
        displayComputerChoice = (TextView) findViewById(R.id.display_count);
        displayWinner = (TextView) findViewById(R.id.display_count);

}
