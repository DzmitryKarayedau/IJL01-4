import java.util.logging.Logger;

/**
 * Created by dzmitry.karayedau on 12-Apr-17.
 */
public class StringUtils {
    private char charToSearch;
    private String outputString;
    private char[] inputChars;

    private Logger logger = Logger.getLogger(this.getClass().getName());

    public StringUtils(char charToSearch) {
        this.charToSearch = charToSearch;

    }

    public String returnStringBeforeSearchSymbol(String s) {
        if (s == null) {
            logger.warning("String is null");
            return null;
        }
        int index = s.indexOf(charToSearch);
        if (index >= 0) {
            return s.substring(0, index);
        } else {
            logger.info("There is no needed symbol in the string");
            return s;
        }
    }

    public String returnStringBeforeSearchSymbol(char... c) {
        String returnedString;
        if (c == null){
            logger.warning("String is null");
            return null;
        }
        else{
            String s = new String(c);
            return this.returnStringBeforeSearchSymbol(s);
        }
    }

    public char getCharToSearch() {
        return charToSearch;
    }

}
