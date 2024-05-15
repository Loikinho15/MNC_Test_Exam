import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.crypto.NodeSetData;
import javax.xml.stream.events.StartDocument;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
        //new StringMatcher().matchPattern();
        //new AskInput().askInput();

        ArrayList<Integer> dividers = new ArrayList<>();
        dividers.add(3);
        dividers.add(5);
        dividers.add(7);
        dividers.add(9);
        int startPoint = 100000000;
        boolean isMultipleFound = false;

        for (int i = 0; i < startPoint; i++){
            for (int j = 0; j < dividers.size(); j++){
                if (startPoint % dividers.get(j) == 0){
                    isMultipleFound = true;
                } else {
                    isMultipleFound = false;
                    startPoint++;
                    break;
                }
            }
            if (isMultipleFound){
                break;
            }
        }
        System.out.print("N = " + startPoint);
        System.out.print("\n");

        String formatedNumber = String.valueOf(startPoint);
        ArrayList<String> formatedNumberArrayList = new ArrayList<>();
        String[] formatedNumberArray = formatedNumber.split("(?<=.)");
        System.out.print("L = ");

        for (int i = 0; i < formatedNumberArray.length; i++){
            formatedNumberArrayList.add(formatedNumberArray[i]);
            if (i + 1 != formatedNumberArray.length) {
                System.out.print(formatedNumberArray[i] + ",");
            }
            else {
                System.out.print(formatedNumberArray[i]);
            }
        }
        System.out.print("\n");

        ArrayList<String> listOfNumToCheck = new ArrayList<>();
        System.out.print("L' = ");
        for (int i = 0; i < formatedNumberArray.length; i++) {
            if (listOfNumToCheck.contains(formatedNumberArray[i])){
                if (i + 1 == formatedNumberArray.length){
                    System.out.print("R" + formatedNumberArray[i]);
                } else {
                    System.out.print("R" + formatedNumberArray[i] + ",");
                }
            } else {
                if (i + 1 == formatedNumberArray.length){
                    System.out.print("E" + formatedNumberArray[i]);
                    listOfNumToCheck.add(formatedNumberArray[i]);
                } else {
                    System.out.print("R" + formatedNumberArray[i] + ",");
                    listOfNumToCheck.add(formatedNumberArray[i]);
                }

            }
        }
    }
}
