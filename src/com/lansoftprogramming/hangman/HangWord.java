/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lansoftprogramming.hangman;

import java.util.Random;

/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class HangWord {
    protected static String mMainWord;
    
    private static final String[] mMordList = { //word list
      "hello","word2","magicWord"  
    };
    
    public static String getWord(){
        return mMainWord;
    }
    public static void setWord(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mMordList.length);//random number
        mMainWord = mMordList[randomNumber];
    }
}