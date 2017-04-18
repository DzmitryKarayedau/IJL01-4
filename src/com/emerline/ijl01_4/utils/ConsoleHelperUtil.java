package com.emerline.ijl01_4.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dzmitry.karayedau on 18-Apr-17.
 */
public class ConsoleHelperUtil {

    public static char searchSymbol() {
        Scanner in = new Scanner(System.in);
        String inputString;
        boolean isSymbolAccepted;
        do {
            System.out.print("Input searching symbol: ");
            inputString = in.nextLine();
            isSymbolAccepted = (inputString.length() == 1);
            if (!isSymbolAccepted) {
                System.out.println("Needed only one symbol. Try another one.");
            }
        }
        while (!isSymbolAccepted);

        return inputString.toCharArray()[0];
    }

    public static String inputString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        return in.nextLine();
    }

    public static String stringFromFile(String filePath) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(filePath))) {
            int c;
            System.out.printf("String from file: %s%n", filePath);

            while ((c = bufferReader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return stringBuilder.toString();
    }

}
