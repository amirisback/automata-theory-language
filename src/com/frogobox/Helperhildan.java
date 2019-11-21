package com.frogobox;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Helperhildan {

    public ArrayList<String> sparatorstring(String input) {
        String[] split = input.split(" ");
        ArrayList<String> partTemp = new ArrayList<>();
        Collections.addAll(partTemp, split);
        return partTemp;
    }


    public void loopstring(String input){
        ArrayList<String> loop = sparatorstring(input);
        for (int i = 0; i < loop.size(); i++) {
            System.out.println(new Helper().checkTokenIf(loop.get(i).toCharArray()));
        }
    }

}
