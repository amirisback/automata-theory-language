package com.frogobox.checker;

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
public class StringChecker {

    // List String Lexic : p, q, r, s, not, and, or, xor, if, then, iff, (, )

    private CharChecker charChecker = new CharChecker();

    public boolean checkStringP(char[] arrayString){
        if (charChecker.checkSizeOneChar(arrayString)){
            return charChecker.checkP(arrayString[0]);
        } else {
            return false;
        }
    }

    public boolean checkStringQ(char[] arrayString){
        if (charChecker.checkSizeOneChar(arrayString)){
            return charChecker.checkQ(arrayString[0]);
        } else {
            return false;
        }
    }

    public boolean checkStringR(char[] arrayString){
        if (charChecker.checkSizeOneChar(arrayString)){
            return charChecker.checkR(arrayString[0]);
        } else {
            return false;
        }
    }

    public boolean checkStringS(char[] arrayString){
        if (charChecker.checkSizeOneChar(arrayString)){
            return charChecker.checkS(arrayString[0]);
        } else {
            return false;
        }
    }

    public boolean checkStringBracketOpen(char[] arrayString){
        if (charChecker.checkSizeOneChar(arrayString)){
            return charChecker.checkBracketOpen(arrayString[0]);
        } else {
            return false;
        }
    }

    public boolean checkStringBracketClose(char[] arrayString){
        if (charChecker.checkSizeOneChar(arrayString)){
            return charChecker.checkBracketClose(arrayString[0]);
        } else {
            return false;
        }
    }

    public boolean checkStringIf(char[] arrayString) {
        if (charChecker.checkSizeTwoChar(arrayString)) {
            if (charChecker.checkI(arrayString[0])) {
                return charChecker.checkF(arrayString[1]);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkStringOr(char[] arrayString) {
        if (charChecker.checkSizeTwoChar(arrayString)) {
            if (charChecker.checkO(arrayString[0])) {
                return charChecker.checkR(arrayString[1]);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkStringAnd(char[] arrayString) {
        if (charChecker.checkSizeThreeChar(arrayString)) {
            if (charChecker.checkA(arrayString[0])) {
                if (charChecker.checkN(arrayString[1])) {
                    return charChecker.checkD(arrayString[2]);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkStringNot(char[] arrayString) {
        if (charChecker.checkSizeThreeChar(arrayString)) {
            if (charChecker.checkN(arrayString[0])) {
                if (charChecker.checkO(arrayString[1])) {
                    return charChecker.checkT(arrayString[2]);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkStringXor(char[] arrayString) {
        if (charChecker.checkSizeThreeChar(arrayString)) {
            if (charChecker.checkX(arrayString[0])) {
                if (charChecker.checkO(arrayString[1])) {
                    return charChecker.checkR(arrayString[2]);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkStringIff(char[] arrayString) {
        if (charChecker.checkSizeThreeChar(arrayString)) {
            if (charChecker.checkI(arrayString[0])) {
                if (charChecker.checkF(arrayString[1])) {
                    return charChecker.checkF(arrayString[2]);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkStringThen(char[] arrayString) {
        if (charChecker.checkSizeFourChar(arrayString)) {
            if (charChecker.checkT(arrayString[0])) {
                if (charChecker.checkH(arrayString[1])) {
                    if (charChecker.checkE(arrayString[2])) {
                        return charChecker.checkN(arrayString[3]);
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
