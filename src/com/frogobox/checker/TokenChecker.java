package com.frogobox.checker;

import static com.frogobox.helper.Constant.*;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Automata-Theory-Language
 * Copyright (C) 22/11/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.checker
 */
public class TokenChecker {

    private StringChecker stringChecker = new StringChecker();

    public int getTokenProposition(char[] arrayString) {
        if (stringChecker.checkStringProposition(arrayString)) {
            return TOKEN_PROPOSITION;
        } else {
            return 0;
        }
    }

    public int getTokenNot(char[] arrayString) {
        if (stringChecker.checkStringNot(arrayString)) {
            return TOKEN_NOT;
        } else {
            return 0;
        }
    }

    public int getTokenAnd(char[] arrayString) {
        if (stringChecker.checkStringAnd(arrayString)) {
            return TOKEN_AND;
        } else {
            return 0;
        }
    }

    public int getTokenOr(char[] arrayString) {
        if (stringChecker.checkStringOr(arrayString)) {
            return TOKEN_OR;
        } else {
            return 0;
        }
    }

    public int getTokenXor(char[] arrayString) {
        if (stringChecker.checkStringXor(arrayString)) {
            return TOKEN_XOR;
        } else {
            return 0;
        }
    }

    public int getTokenIf(char[] arrayString) {
        if (stringChecker.checkStringIf(arrayString)) {
            return TOKEN_IF;
        } else {
            return 0;
        }
    }

    public int getTokenThen(char[] arrayString) {
        if (stringChecker.checkStringThen(arrayString)) {
            return TOKEN_THEN;
        } else {
            return 0;
        }
    }

    public int getTokenIff(char[] arrayString) {
        if (stringChecker.checkStringIff(arrayString)) {
            return TOKEN_IFF;
        } else {
            return 0;
        }
    }

    public int getTokenBracketOpen(char[] arrayString) {
        if (stringChecker.checkStringBracketOpen(arrayString)) {
            return TOKEN_BRACKET_OPEN;
        } else {
            return 0;
        }
    }

    public int getTokenBracketClose(char[] arrayString) {
        if (stringChecker.checkStringBracketClose(arrayString)) {
            return TOKEN_BRACKET_CLOSE;
        } else {
            return 0;
        }
    }


}
