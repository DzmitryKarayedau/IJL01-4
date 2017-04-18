package com.emerline.ijl01_4;

import com.emerline.ijl01_4.utils.ConsoleHelperUtil;
import com.emerline.ijl01_4.utils.StringToCharCutter;

public class Main {

    public static void main(String[] args) {

        String fileDestination = "C:\\TestStrings.txt";

        char searchSymbol = ConsoleHelperUtil.returnSearchSymbol();
        StringToCharCutter stringToCharCutter = new StringToCharCutter(searchSymbol);

        String inputString = ConsoleHelperUtil.returnInputString();
        char[] charArray = inputString.toCharArray();

        System.out.printf("String before symbol: %s%n", stringToCharCutter.returnStringBeforeSymbol(inputString));
        System.out.printf("Chars before symbol: %s%n", stringToCharCutter.returnStringBeforeSymbol(charArray));

        inputString = ConsoleHelperUtil.returnStringFromFile(fileDestination);

        System.out.printf("String before symbol: %s%n", stringToCharCutter.returnStringBeforeSymbol(inputString));

    }


}
