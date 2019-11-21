package com.frogobox;

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
        System.out.println(input);
    }
}
