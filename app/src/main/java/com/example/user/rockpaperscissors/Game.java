package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by user on 14/12/2016.
 */
public class Game {

    ArrayList<String> rappers;
    String playerChoice;
    String computerChoice;
    String winner;

    public Game()   {
        this.rappers = new ArrayList<String>();
        startRapBattle();
    }

    public void startRapBattle() {
        rappers.add("Biggie");
        rappers.add("2Pac");
        rappers.add("Dr Dre");
    }

    public void setPlayerChoice(String choice) {
        this.playerChoice = choice;
    }

    public void getRapper() {
        for (String rapper : rappers) {
            System.out.println(rapper);
        }
    }

    public int getRapperCount() {
        return rappers.size();
    }


    public String getComputerChoice()  {
        Random rand = new Random();
        int listSize = getRapperCount();
        int index = rand.nextInt(listSize);
        String answer = rappers.get(index);
        computerChoice = answer;
        return "Computer chooses: " + answer;
    }

    public String getWinner()   {
        if (this.winner != "Draw") {
            return this.winner + " spits mad rhymes and wins!";
        }
        else {
            return "The rap battle is a draw!";
        }
    }

    public void decideRapBattleWinner() {
        if (playerChoice == "Biggie" && computerChoice == "2Pac")   {
        this.winner = "Biggie";}
        else if (playerChoice == "Biggie" && computerChoice == "Dr Dre")    {
        this.winner = "Dr Dre";}
        else if (playerChoice == "2Pac" && computerChoice == "Dr Dre")   {
        this.winner = "2Pac";}
        else if (playerChoice == "2Pac" && computerChoice == "Biggie")   {
        this.winner = "Biggie";}
        else if (playerChoice == "Dr Dre" && computerChoice == "Biggie"){
        this.winner = "Dr Dre";}
        else if (playerChoice == "Dr Dre" && computerChoice == "2Pac"){
        this.winner = "2Pac";}
        else
        {this.winner = "Draw";}
    }

//    trying to get score counter

//    public HashMap<String, Integer> scoreCount(String string) {
//        HashMap<String, Integer> score = new HashMap<String, Integer>();
//        score.put("Player", 0);
//        score.put("Computer", 0);
//
//        for (String word : words) {
//            word = word.toLowerCase();
//            if (results.get(word) == null) {
//                results.put(word, 1);
//            }
//            else results.put(word, results.get(word) + 1);
//        }
//        return results;
//    }
}
