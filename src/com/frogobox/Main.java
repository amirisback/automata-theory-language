package com.frogobox;

import com.frogobox.helper.Logic;

import java.util.Scanner;

import static com.frogobox.helper.Constant.*;

public class Main {

    private void teamView(){
        System.out.println(TEXT_TITLE_PROGRAM);
        System.out.println(VIEW_LINE);
        System.out.println("Muhammad Faisal Amir (1301198497)");
        System.out.println("Hildan Fawwaz        (1301198514)");
        System.out.println("Monica liviandra     (1301198517)");
        System.out.println("Revi Chandra Riana   (1301198512)");
        System.out.println("IFX - 43 - 02");
        System.out.println(VIEW_LINE);
    }

    private void introView(){
        System.out.println("List Token : ");
        System.out.println(VIEW_LINE);
        System.out.println("TOKEN_PROPOSITION \t: "  + TOKEN_PROPOSITION);
        System.out.println("TOKEN_NOT \t\t\t: "        + TOKEN_NOT);
        System.out.println("TOKEN_AND \t\t\t: "        + TOKEN_AND);
        System.out.println("TOKEN_OR \t\t\t: "         + TOKEN_OR);
        System.out.println("TOKEN_XOR \t\t\t: "        + TOKEN_XOR);
        System.out.println("TOKEN_IF \t\t\t: "         + TOKEN_IF);
        System.out.println("TOKEN_THEN \t\t\t: "       + TOKEN_THEN);
        System.out.println("TOKEN_IFF \t\t\t: "        + TOKEN_IFF);
        System.out.println("TOKEN_( \t\t\t: "          + TOKEN_BRACKET_OPEN);
        System.out.println("TOKEN_) \t\t\t: "      + TOKEN_BRACKET_CLOSE);
        System.out.println(VIEW_LINE);
    }

    public static void main(String[] args) {
        // Write your code here
        new Main().teamView();
        new Main().introView();
        new Main().onCreate();
    }

    private void onCreate(){
        // Call all function here
        runLexicalAnalyzer();
    }

    private void runLexicalAnalyzer(){
        System.out.print(TEXT_INPUT);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        new Logic().parseString(input);
    }


}
