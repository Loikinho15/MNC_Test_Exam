import java.util.Scanner;

public class AskInput {
    public void askInput (){
        //***** Exercice avec des nombres premiers *****

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
        System.out.print("Number of even numbers are : " + even);
    }
}
