package com.frogobox.helper;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringChecker {

    public ArrayList<String> arraySplitString(String input) {
        String[] split = input.split(" ");
        ArrayList<String> partTemp = new ArrayList<>();
        Collections.addAll(partTemp, split);
        return partTemp;
    }


    public void loopstring(String input){
        ArrayList<String> loop = arraySplitString(input);
        for (int i = 0; i < loop.size(); i++) {
//            System.out.println(new CharChecker().checkTokenIf(loop.get(i).toCharArray()));
        }
    }

}
