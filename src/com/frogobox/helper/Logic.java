package com.frogobox.helper;


import java.util.ArrayList;
import java.util.Collections;

public class Logic {

    private String[] separatorSentence(String sentence) {
        return sentence.split(" ");
    }

    private char[] separatorString(String string){
        return string.toCharArray();
    }

    private ArrayList<String> arraySplitString(String input) {
        ArrayList<String> partTemp = new ArrayList<>();
        Collections.addAll(partTemp, separatorSentence(input));
        return partTemp;
    }

}
