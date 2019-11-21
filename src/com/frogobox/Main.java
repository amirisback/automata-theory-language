package com.frogobox;

import com.frogobox.helper.Logic;

import java.util.Scanner;

import static com.frogobox.helper.Constant.*;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        new Main().introView();
        new Main().onCreate();
    }

    private void onCreate(){
        // Call all function here
        System.out.print(TEXT_INPUT);
        new Logic().parseString(getStringScanner());
        
    }

    private String getStringScanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void teamView(){
        System.out.println("Muhammad Faisal Amir");
        System.out.println("Hildan Fawwaz");
        System.out.println("Monica liviandra");
        System.out.println("Revi Chandra Riana");
        System.out.println("IFX - 43 - 02");
    }
    
    private void introView(){
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
}
