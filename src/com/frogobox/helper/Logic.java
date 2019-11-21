package com.frogobox.helper;

import com.frogobox.checker.TokenChecker;

import java.util.ArrayList;
import java.util.Collections;

import static com.frogobox.helper.Constant.*;

public class Logic {

    private TokenChecker tokenChecker = new TokenChecker();

    private String[] separatorSentence(String sentence) {
        return sentence.split(" ");
    }

    private char[] separatorString(String splitString) {
        return splitString.toCharArray();
    }

    private ArrayList<String> arraySplitString(String input) {
        ArrayList<String> partTemp = new ArrayList<>();
        Collections.addAll(partTemp, separatorSentence(input));
        return partTemp;
    }

    public void parseString(String input) {
        ArrayList<Integer> arrayListToken = new ArrayList<>();
        ArrayList<String> arrayListWord = arraySplitString(input);

        for (String stringWord : arrayListWord) {
            char[] word = separatorString(stringWord);
            arrayListToken.add(tokenChecker.getParseToken(word));
        }

        System.out.print(TEXT_OUTPUT);

        for (Integer integer : arrayListToken) {
            if (integer != 0) {
                System.out.print(integer + "\t");
            } else {
                System.out.print(TOKEN_ERROR + " ");
            }
        }

    }


}
