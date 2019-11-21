package com.frogobox;

import com.frogobox.helper.Logic;

import java.util.Scanner;

import static com.frogobox.helper.Constant.TEXT_INPUT;

public class Main {

    public static void main(String[] args) {
        // Write your code here
//        new Main().introView();
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

    private void introView(){
        System.out.println("Muhammad Faisal Amir");
        System.out.println("Hildan Fawwaz");
        System.out.println("Monica liviandra");
        System.out.println("Revi Chandra Riana");
        System.out.println("IFX - 43 - 02");
    }

}
