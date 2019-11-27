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

    private boolean checkValidPropotionalLogic(ArrayList<Integer> integerArrayList) {
        return (integerArrayList.get(0) == 2) && (integerArrayList.get(1) == 1);
    }


    // Token Per Kata
    private void validatorLexicalParse(ArrayList<Integer> arrayListToken) {
        String checkValid = TEXT_VALID;
        if ((arrayListToken.size() == 1) && (arrayListToken.get(0) <= 10)) {

            if (arrayListToken.get(0) == 1) {
                System.out.print(arrayListToken.get(0));
            } else if (arrayListToken.get(0) == 0) {
                System.out.print(TOKEN_ERROR + " ");
                checkValid = TEXT_NOT_VALID;
            } else {
                System.out.print(arrayListToken.get(0));
                checkValid = TEXT_NOT_VALID;
            }

        } else if ((arrayListToken.size() == 2)) {
            if (!checkValidPropotionalLogic(arrayListToken)) {
                checkValid = TEXT_NOT_VALID;
            }
            for (Integer integer : arrayListToken) {
                if (integer == 0) {
                    System.out.print(TOKEN_ERROR + " ");
                    break;
                } else {
                    System.out.print(integer + "\t");
                }

            }
        } else {
            for (int i = 0; i < arrayListToken.size(); i++) {
                if (arrayListToken.get(i) != 0) {
                    System.out.print(arrayListToken.get(i) + "\t");
                    if (i != arrayListToken.size() - 1) {
                        if (arrayListToken.get(i) == arrayListToken.get(i + 1)) {
                            checkValid = TEXT_NOT_VALID;
                        }
                    }
                } else {
                    System.out.print(TOKEN_ERROR + " ");
                    checkValid = TEXT_NOT_VALID;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println(TEXT_RESULT + checkValid);
    }


    public void parseString(String input) {
        ArrayList<Integer> arrayListToken = new ArrayList<>();
        ArrayList<String> arrayListWord = arraySplitString(input);
        for (String stringWord : arrayListWord) {
            char[] word = separatorString(stringWord);
            arrayListToken.add(getParseToken(word));
        }
        System.out.print(TEXT_OUTPUT);
        validatorLexicalParse(arrayListToken);
    }

}
