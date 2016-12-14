package com.example.user.rockpaperscissors;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by user on 14/12/2016.
 */
public class GameTest {

    public Game game;
//    public ArrayList<String> rappers;

    @Before
    public void before() {
        game = new Game("Biggie");
//        rappers = new ArrayList<String>();
    }

//    @Test
//    public void canGenerateRappers() {
//        game.startRapBattle();
//        game.getRapper();
//    }
//
//    @Test
//    public void canGetComputerChoice()  {
//        game.startRapBattle();
//        assertNotNull(game.getComputerChoice());
//        System.out.println(game.getComputerChoice());
//    }

    @Test
    public void rapperCanWin() {
        game.startRapBattle();
        game.getComputerChoice();
        System.out.println(game.decideRapBattleWinner());
    }



}
