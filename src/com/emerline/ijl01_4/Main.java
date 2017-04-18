package com.emerline.ijl01_4;

import com.emerline.ijl01_4.utils.ConsoleHelperUtil;
import com.emerline.ijl01_4.utils.StringToCharCutter;

public class Main {

    public static void main(String[] args) {

        String fileDestination = "C:\\TestStrings.txt";

        char searchSymbol = ConsoleHelperUtil.searchSymbol();
        StringToCharCutter stringToCharCutter = new StringToCharCutter(searchSymbol);

        String inputString = ConsoleHelperUtil.inputString();
        char[] charArray = inputString.toCharArray();

        System.out.printf("String before symbol: %s%n", stringToCharCutter.stringBeforeSymbol(inputString));
        System.out.printf("Chars before symbol: %s%n", stringToCharCutter.stringBeforeSymbol(charArray));

        inputString = ConsoleHelperUtil.stringFromFile(fileDestination);

        System.out.printf("String before symbol: %s%n", stringToCharCutter.stringBeforeSymbol(inputString));

    }


}
