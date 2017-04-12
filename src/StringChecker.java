import java.util.ArrayList;

/**
 * Created by dzmitry.karayedau on 12-Apr-17.
 */
public class StringChecker {
    private char charToSearch;
    private String outputString;
    private char[] inputChars;


    public char getCharToSearch() {
        return charToSearch;
    }

    public void setCharToSearch(char charToSearch) {
        this.charToSearch = charToSearch;
    }


    public String readStringBeforeSymbol(String s){
        int index = s.indexOf(charToSearch);
        String returnedString = s;
        try {
            returnedString = s.substring(0, index);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("There is no needed symbol in the string");
        }
        return returnedString;
    }

    public String readStringBeforeSymbol(char[] c){
        StringBuffer returnedString = new StringBuffer();
        for (char checkedChar : c) {
            if (checkedChar != charToSearch){
                returnedString.append(checkedChar);
            }
            else{
                break;
            }
        }
        if(returnedString.length() == c.length){
            System.out.println("There is no needed symbol in the string");
        }
        return returnedString.toString();
    }


}
