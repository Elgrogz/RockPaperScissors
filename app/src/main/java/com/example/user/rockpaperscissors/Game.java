package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 14/12/2016.
 */
public class Game {

    ArrayList<String> rappers;
    String playerChoice;
    String computerChoice;

    public Game(String playerChoice)   {
        this.playerChoice = playerChoice;
        this.computerChoice = null;
        this.rappers = new ArrayList<String>();
    }

    public void startRapBattle() {
        rappers.add("Biggie");
        rappers.add("2Pac");
        rappers.add("Dr Dre");
    }

    public void getRapper() {
        for (String rapper : rappers) {
            System.out.println(rapper);
        }
    }

    public int getRapperCount() {
        return rappers.size();
    }


    public void getComputerChoice()  {
        Random rand = new Random();
        int listSize = getRapperCount();
        int index = rand.nextInt(listSize);
        String answer = rappers.get(index);
        computerChoice = answer;
    }

    public String decideRapBattleWinner() {
        if (playerChoice == "Biggie" && computerChoice == "2Pac")   {
        return "Biggie";}
        else if (playerChoice == "Biggie" && computerChoice == "Dr Dre")    {
        return "Dr Dre";}
        else if (playerChoice == "2Pac" && computerChoice == "Dr Dre")   {
        return "2Pac";}
        else if (playerChoice == "2Pac" && computerChoice == "Biggie")   {
        return "Biggie";}
        else if (playerChoice == "Dr Dre" && computerChoice == "Biggie"){
        return "Dr Dre";}
        else if (playerChoice == "Dr Dre" && computerChoice == "2Pac"){
        return "2Pac";}
        else if (playerChoice == computerChoice)
        return "Draw";
        else
        return "Invalid rapper";
    }

//
//    public ArrayList<String> getComputerChoice() {
//        return this.rapper;
//    }
//
//    public void playGame(String playerChoice, String ComputerChoice) {
//
//    }

}
