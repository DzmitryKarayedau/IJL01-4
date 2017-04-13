import java.util.logging.Logger;

/**
 * Created by dzmitry.karayedau on 12-Apr-17.
 */
public class StringUtils {

    private static final Logger logger = Logger.getLogger(StringUtils.class.toString());

    public static String returnStringBeforeSymbol(String inputString , char searchSymbol){
        if (inputString == null){
            logger.info("String is null");
            return null;
        }
        else{
            int index = inputString.indexOf(searchSymbol);
            if (index >= 0) {
                return inputString.substring(0, index);
            } else {
                logger.info("There is no needed symbol in the string");
                return inputString;
            }
        }
    }


    public static String returnStringBeforeSymbol(char[] inputChars , char searchSymbol){
        return returnStringBeforeSymbol(new String(inputChars),searchSymbol);
    }


}
