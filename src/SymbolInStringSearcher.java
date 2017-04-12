import java.util.logging.Logger;

/**
 * Created by dzmitry.karayedau on 12-Apr-17.
 */
public class SymbolInStringSearcher {
    private char charToSearch;
    private String outputString;
    private char[] inputChars;

    private Logger logger = Logger.getLogger(this.getClass().getName());

    public SymbolInStringSearcher(char charToSearch){
        this.charToSearch = charToSearch;
    }

    public char getCharToSearch() {
        return charToSearch;
    }

    public void setCharToSearch(char charToSearch) {
        this.charToSearch = charToSearch;
    }


    public String returnStringBeforeSearchSymbol(String s){
        String returnedString;
        if (s != null){
            int index = s.indexOf(charToSearch);
            if (index >= 0){
                returnedString = s.substring(0, index);
            }
            else{
                returnedString = s;
                logger.info("There is no needed symbol in the string");
            }
        }
        else{
            returnedString = null;
            logger.warning ("String is null");
        }

        return returnedString;
    }

    public String returnStringBeforeSearchSymbol(char... c){
        String returnedString;
        if (c != null){
            StringBuilder stringForCheck = new StringBuilder();
            for (char checkedChar : c) {
                stringForCheck.append(checkedChar);
            }
            returnedString = this.returnStringBeforeSearchSymbol(stringForCheck.toString());
        }
        else {
            returnedString = null;
            logger.warning ("String is null");
        }

        return returnedString;
    }


}
