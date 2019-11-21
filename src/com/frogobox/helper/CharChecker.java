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

    // List String Lexic : p, q, r, s, not, and, or, xor, if, then, iff, (, )
    // List Character : a, d, e, f, h, i, n, o, p, q, r, s, t, x, (, )

    boolean checkA(char input) {
        return (input == 'a') || input == 'A';
    }

    boolean checkD(char input) {
        return (input == 'd') || input == 'D';
    }

    public boolean checkE(char input) {
        return (input == 'e') || input == 'E';
    }

    boolean checkF(char input) {
        return (input == 'f') || input == 'F';
    }

    boolean checkH(char input) {
        return (input == 'h') || input == 'H';
    }

    boolean checkI(char input) {
        return (input == 'i') || input == 'I';
    }

    boolean checkN(char input) {
        return (input == 'n') || input == 'N';
    }

    boolean checkO(char input) {
        return (input == 'o') || input == 'O';
    }

    boolean checkP(char input) {
        return (input == 'p') || input == 'P';
    }

    boolean checkQ(char input) {
        return (input == 'q') || input == 'Q';
    }

    boolean checkR(char input) {
        return (input == 'r') || input == 'R';
    }

    boolean checkS(char input) {
        return (input == 's') || input == 'S';
    }

    public boolean checkT(char input) {
        return (input == 't') || input == 'T';
    }

    public boolean checkX(char input) {
        return (input == 'x') || input == 'X';
    }

    boolean checkBracketOpen(char input) {
        return input == '(';
    }

    boolean checkBracketClose(char input) {
        return input == ')';
    }

    // Check length for proposition p,q,r,s,(,)
    boolean checkSizeOneChar(char[] arrayString){
        return arrayString.length == 1;
    }

    // Check length for if,or,
    boolean checkSizeTwoChar(char[] arrayString){
        return arrayString.length == 2;
    }

    // Check length for not,and,xor,iff
    boolean checkSizeThreeChar(char[] arrayString){
        return arrayString.length == 3;
    }

    // Check length for then
    public boolean checkSizeFourChar(char[] arrayString){
        return arrayString.length == 4;
    }



}