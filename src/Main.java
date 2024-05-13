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


        /* ***** Exercice de parcours de String et regex *****


        String text = "The Dev Community is Amazing";

        int textLenght = text.length();
        ArrayList<String> textArray = new ArrayList<>();

        int nbUpperCase = 0;
        int nbLowerCase = 0;
        for (int i = 0; i < textLenght; i++){
            if (String.valueOf(text.charAt(i)).matches("[A-Z]")){
                nbUpperCase++;
            } else if (String.valueOf(text.charAt(i)).matches("[a-z]")){
                nbLowerCase++;
            }
        }
        System.out.print("upper : " + nbUpperCase  );
        System.out.print("lower : " + nbLowerCase);*/



        /*  ***** Exercice avec des nombres premiers *****

        int number1 = 0;
        int number2 = 0;
        int even = 0;

        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter a starting number");
        number1 = myScan.nextInt();

        System.out.print("Enter last number");
        number2 = myScan.nextInt();

        myScan.close();

        for (int i = 0; i < number2; i++){
            if ( i % 2 == 0){
                even += 1;
            }
        }
        System.out.print("Number of even numbers are : " + even);*/
    }
}