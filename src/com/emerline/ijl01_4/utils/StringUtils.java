package com.emerline.ijl01_4.utils;

import java.util.logging.Logger;

/**
 * Created by dzmitry.karayedau on 12-Apr-17.
 */
public class StringUtils {

    private static final Logger logger = Logger.getLogger(StringUtils.class.toString());

    private char searchSymbol;

    public boolean checkSymbol(char checkedSymbol) {
        if (checkedSymbol == searchSymbol) {
            return true;
        } else {
            return false;
        }
    }


    public String returnStringBeforeSymbol(String inputString) {
        if (inputString == null) {
            logger.info("String is null");
            return null;
        } else {
            int index = inputString.indexOf(searchSymbol);
            if (index >= 0) {
                return inputString.substring(0, index);
            } else {
                logger.info("There is no needed symbol in the string");
                return inputString;
            }
        }
    }


    public String returnStringBeforeSymbol(char[] inputChars) {
        return returnStringBeforeSymbol(new String(inputChars));
    }


    public char getSearchSymbol() {
        return searchSymbol;
    }

    public void setSearchSymbol(char searchSymbol) {
        this.searchSymbol = searchSymbol;
    }


}
