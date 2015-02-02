/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lansoftprogramming.hangman;

import java.util.Scanner;

/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class HangMan {
//set default values for variables
    private static String cryptoWord;
    private static String mMainWord;
    private static int lives;
    private static boolean gameWon;
    // ---- 
    public static void main(String[] args){
        newGame();
        
        //System.out.println(mainWord);//outprint word - del
    }
    //set and get methods
    public static void setLives(int i){
        lives=lives+i;
    }
    public static int getLives(){
        return lives;
    }
    public static boolean getGameWonStatus(){
        return gameWon;
    }
    public static void setGameWonStatus(boolean i){
        gameWon=i;
    }
    
    public static void newGame() {
        //set variables of new game
        lives=10;
        gameWon=false;
        newWord();//make a new word
        System.out.println("Welcome to hangman! Your word is:");
        System.out.println(cryptoWord);
    }
    public static void newWord(){
        HangWord.setWord();//new game; set new word
        mMainWord = HangWord.getWord();//get real word
        cryptoWord = HangLetter.cryptoWord();//and crypto word 
    }

}
