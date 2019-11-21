package com.frogobox.helper;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TeoriBahasaAutomata
 * Copyright (C) 21/11/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox
 */
public class CharChecker {

    // List String Lexic : p,q,r,s, not, and, or, xor, if, then, iff, (, )
    // List Character : a, e, f, i, n, o, p, q, r, s, t, x, (, )

    public boolean checkA(char input) {
        return (input == 'a') || input == 'A';
    }

    public boolean checkE(char input) {
        return (input == 'e') || input == 'E';
    }

    public boolean checkF(char input) {
        return (input == 'f') || input == 'F';
    }

    public boolean checkI(char input) {
        return (input == 'i') || input == 'I';
    }

    public boolean checkN(char input) {
        return (input == 'n') || input == 'N';
    }

    public boolean checkO(char input) {
        return (input == 'o') || input == 'O';
    }

    public boolean checkP(char input) {
        return (input == 'p') || input == 'P';
    }

    public boolean checkQ(char input) {
        return (input == 'q') || input == 'Q';
    }

    public boolean checkR(char input) {
        return (input == 'r') || input == 'R';
    }

    public boolean checkS(char input) {
        return (input == 's') || input == 'S';
    }

    public boolean checkT(char input) {
        return (input == 't') || input == 'T';
    }

    public boolean checkX(char input) {
        return (input == 'x') || input == 'X';
    }

    public boolean checkBracketOpen(char input) {
        return input == '(';
    }

    public boolean checkBracketClose(char input) {
        return input == ')';
    }


}