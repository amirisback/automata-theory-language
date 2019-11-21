package com.frogobox;

import java.util.ArrayList;
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
        Helperhildan helperhildan = new Helperhildan();
        helperhildan.loopstring(input);


    }
}
