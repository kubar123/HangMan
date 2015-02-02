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
public class HangGuess {
    HangMan hangMan = new HangMan();
    public static char[] letterList={
       'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
        's','t','u','v','w','x','y','z'
    };
    public static boolean[] usedLetters=new boolean[26];
    public static Scanner enter;
    
    public static void makeAGuess(){
       enter = new Scanner(System.in);
        while(HangMan.getLives()>0 | !HangMan.getGameWonStatus()){
            //put guesses, check for correct ans, 
            System.out.println("enter guess >> ");
            char currGuess = enter.next().charAt(0);//currGuess=letter at 0 of string
            
        }
            
   }
}
