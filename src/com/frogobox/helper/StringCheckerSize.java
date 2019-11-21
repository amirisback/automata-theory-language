package com.frogobox.helper;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Automata-Theory-Language
 * Copyright (C) 21/11/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.helper
 */
public class StringCheckerSize {

    // List String Lexic : p, q, r, s, not, and, or, xor, if, then, iff, (, )
    // List Character : a, e, f, i, n, o, p, q, r, s, t, x, (, )


    // Check length for proposition p,q,r,s,(,)
    public boolean checkSizeOneChar(char[] arrayString){
        return arrayString.length == 1;
    }

    // Check length for if,or,
    public boolean checkSizeTwoChar(char[] arrayString){
        return arrayString.length == 2;
    }

    // Check length for not,and,xor,iff
    public boolean checkSizeThreeChar(char[] arrayString){
        return arrayString.length == 3;
    }

    // Check length for then
    public boolean checkSizeFourChar(char[] arrayString){
        return arrayString.length == 4;
    }


}
