import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringChecker sc = new StringChecker();
        Scanner in = new Scanner(System.in);
        char symbol = ' ';
        String inputString;

        do{
            System.out.print("Input searching symbol: ");
            inputString = in.nextLine();
            if(inputString.length() != 1){
                System.out.println("Needed only one symbol. Try another one.");
            }
            else{
                symbol = inputString.toCharArray()[0];
                sc.setCharToSearch(symbol);
            }
        }
        while (inputString.length() != 1);

        System.out.print("Input string: ");
        String s = in.nextLine();

        char[] c = s.toCharArray();

        System.out.println("String before symbol: " + sc.readStringBeforeSymbol(s));
        System.out.println("Chars before symbol: " + sc.readStringBeforeSymbol(c));




    }
}
