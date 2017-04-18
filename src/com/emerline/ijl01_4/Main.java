package com.emerline.ijl01_4;

import com.emerline.ijl01_4.utils.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String inputString;
        boolean isSymbolAccepted;
        StringUtils stringUtils = new StringUtils();
        String fileDestination = "C:\\TestStrings.txt";


        do {
            System.out.print("Input searching symbol: ");
            inputString = in.nextLine();
            isSymbolAccepted = (inputString.length() == 1);
            if (!isSymbolAccepted) {
                System.out.println("Needed only one symbol. Try another one.");
            } else {
                stringUtils.setSearchSymbol(inputString.toCharArray()[0]);
            }
        }
        while (!isSymbolAccepted);

        System.out.print("Input string: ");
        inputString = in.nextLine();

        char[] charArray = inputString.toCharArray();

        System.out.printf("String before symbol: %s%n", stringUtils.returnStringBeforeSymbol(inputString));
        System.out.printf("Chars before symbol: %s%n", stringUtils.returnStringBeforeSymbol(charArray));

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(fileDestination))) {
            int c;
            System.out.printf("String from file: %s%n", fileDestination);
            while ((c = bufferReader.read()) != -1) {
                System.out.print((char) c);
                if (stringUtils.checkSymbol((char) c)) {
                    break;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
