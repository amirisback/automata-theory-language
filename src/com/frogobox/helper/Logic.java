package com.frogobox.helper;

import com.frogobox.checker.StringChecker;
import com.frogobox.checker.TokenChecker;

import java.util.ArrayList;
import java.util.Collections;

import static com.frogobox.helper.Constant.*;

public class Logic {

    private TokenChecker tokenChecker = new TokenChecker();
    private StringChecker stringChecker = new StringChecker();

    public int getParseToken(char[] arrayString) {
        if (stringChecker.checkStringProposition(arrayString)) {
            return TOKEN_PROPOSITION;
        } else if (stringChecker.checkStringNot(arrayString)) {
            return TOKEN_NOT;
        } else if (stringChecker.checkStringAnd(arrayString)) {
            return TOKEN_AND;
        } else if (stringChecker.checkStringOr(arrayString)) {
            return TOKEN_OR;
        } else if (stringChecker.checkStringXor(arrayString)) {
            return TOKEN_XOR;
        } else if (stringChecker.checkStringIf(arrayString)) {
            return TOKEN_IF;
        } else if (stringChecker.checkStringThen(arrayString)) {
            return TOKEN_THEN;
        } else if (stringChecker.checkStringIff(arrayString)) {
            return TOKEN_IFF;
        } else if (stringChecker.checkStringBracketOpen(arrayString)) {
            return TOKEN_BRACKET_OPEN;
        } else if (stringChecker.checkStringBracketClose(arrayString)) {
            return TOKEN_BRACKET_CLOSE;
        } else {
            return 0;
        }
    }

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
        String checkValid = TEXT_VALID;
        ArrayList<Integer> arrayListToken = new ArrayList<>();
        ArrayList<String> arrayListWord = arraySplitString(input);

        for (String stringWord : arrayListWord) {
            char[] word = separatorString(stringWord);
            arrayListToken.add(getParseToken(word));
        }

        System.out.print(TEXT_OUTPUT);

        for (Integer integer : arrayListToken) {
            if (integer != 0) {
                System.out.print(integer + "\t");
            } else {
                System.out.print(TOKEN_ERROR + " ");
                checkValid = TEXT_NOT_VALID;
                break;
            }
        }

        System.out.println();
        System.out.println(TEXT_RESULT + checkValid);

    }


}
