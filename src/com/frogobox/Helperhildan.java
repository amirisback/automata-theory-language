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

}
