/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lansoftprogramming.hangman;

/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class HangLetter {
    
    public static String cryptoWord(){
        int wordLen = HangWord.getWord().length();
        int i=1;//assuming a word has min 1 letter
        String cryptoWord="_ ";//i=1, word Must have atleast 1 '_'
        while (i<wordLen){
            cryptoWord+="_ ";
            i++;
        }
        return cryptoWord;
    }
}
