package com.frogobox;

import com.frogobox.helper.StringChecker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    new Main().programView();
    }

    private void mainView(){
        System.out.println();
    }

    private void programView(){
        System.out.print("Input Program : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringChecker stringChecker = new StringChecker();
        stringChecker.loopstring(input);
    }
}
