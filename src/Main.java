import javax.xml.stream.events.StartDocument;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*int[] dividers = new int[]{3,5,7,9};
        int startPoint = 100000000;
        boolean numberFound = true;

        while (true){
            for (int element : dividers){
                if (startPoint % element != 0){
                    numberFound = false;
                    break;
                }
                else {
                    numberFound = true;
                }
            }
            if (numberFound){
                break;
            }
            startPoint++;
        }
        System.out.print(startPoint + "\n");

        String intToParse = Integer.toString(startPoint);
        int intLenght = intToParse.length();
        ArrayList<Character> intArray= new ArrayList<>();

        for (int i = 0; i < intLenght; i++){
            intArray.add(intToParse.charAt(i));
            if (i + 1 == intLenght){
                System.out.print(intToParse.charAt(i));
            } else{
                System.out.print(intToParse.charAt(i) + ", ");
            }
        }

        char charFound;
        ArrayList<Character> charTemp = new ArrayList<>();

        for (Character character : intArray) {
            charFound = character;
            if (charTemp.contains(charFound)) {
                System.out.print("\nR" + charFound);
            } else {
                System.out.print("\nE" + charFound);
                charTemp.add(character);
            }
        }*/

        //new StringMatcher().matcher();
        new StringMatcher().matchPattern();
        //new AskInput().askInput();
    }
}