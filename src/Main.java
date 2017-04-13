import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char symbol = ' ';
        String inputString;
        boolean isSymbolAccepted;

        do{
            System.out.print("Input searching symbol: ");
            inputString = in.nextLine();
            isSymbolAccepted = (inputString.length() == 1);
            if(!isSymbolAccepted){
                System.out.println("Needed only one symbol. Try another one.");
            }
            else{
                symbol = inputString.toCharArray()[0];
            }
        }
        while (!isSymbolAccepted);

        System.out.print("Input string: ");
        inputString = in.nextLine();

        char[] charArray = inputString.toCharArray();

        System.out.println("String before symbol: " + StringUtils.returnStringBeforeSymbol(inputString,symbol));
        System.out.println("Chars before symbol: " + StringUtils.returnStringBeforeSymbol(charArray,symbol));

    }
}
