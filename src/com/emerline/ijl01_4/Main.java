package com.emerline.ijl01_4;

import com.emerline.ijl01_4.utils.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char symbol = ' ';
        String inputString;
        boolean isSymbolAccepted;

        do {
            System.out.print("Input searching symbol: ");
            inputString = in.nextLine();
            isSymbolAccepted = (inputString.length() == 1);
            if (!isSymbolAccepted) {
                System.out.println("Needed only one symbol. Try another one.");
            } else {
                symbol = inputString.toCharArray()[0];
            }
        }
        while (!isSymbolAccepted);

        System.out.print("Input string: ");
        inputString = in.nextLine();

        char[] charArray = inputString.toCharArray();

        System.out.printf("String before symbol: %s%n", StringUtils.returnStringBeforeSymbol(inputString, symbol));
        System.out.printf("Chars before symbol: %s%n", StringUtils.returnStringBeforeSymbol(charArray, symbol));

    }
}
