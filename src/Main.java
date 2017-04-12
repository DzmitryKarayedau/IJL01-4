import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SymbolInStringSearcher ss = null;
        Scanner in = new Scanner(System.in);
        char symbol;// = ' ';
        String inputString;
        boolean searchingSymbolIsGood;

        do{
            System.out.print("Input searching symbol: ");
            inputString = in.nextLine();
            searchingSymbolIsGood = (inputString.length() == 1);
            if(!searchingSymbolIsGood){
                System.out.println("Needed only one symbol. Try another one.");
            }
            else{
                symbol = inputString.toCharArray()[0];
                ss = new SymbolInStringSearcher(symbol);
            }
        }
        while (!searchingSymbolIsGood);

        System.out.print("Input string: ");
        String s = in.nextLine();

        char[] c = s.toCharArray();

        System.out.println("String before symbol: " + ss.returnStringBeforeSearchSymbol(s));
        System.out.println("Chars before symbol: " + ss.returnStringBeforeSearchSymbol(c));


    }
}
