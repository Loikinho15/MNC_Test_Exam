import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
    public void matcher (){
        // ***** Exercice de parcours de String et regex *****
        String text = "The Dev Community is Amazing";

        int nbUpperCase = 0;
        int nbLowerCase = 0;

        for (int i = 0; i < text.length(); i++){
            if (String.valueOf(text.charAt(i)).matches("[A-Z]")){
                nbUpperCase++;
            } else if (String.valueOf(text.charAt(i)).matches("[a-z]")){
                nbLowerCase++;
            }
        }
        System.out.print("upper : " + nbUpperCase  );
        System.out.print("lower : " + nbLowerCase);
    }

    public void matchPattern (){
        String stringToParse = "ASjhbSDN";

        //Pour chaque char du string on l'enlève si il ne match pas avec le regex
        for (int i = 0; i < stringToParse.length(); i++){
            if (!String.valueOf(stringToParse.charAt(i)).matches("[A-Z]")){
                stringToParse = stringToParse.replace(String.valueOf(stringToParse.charAt(i)),"");
                i--;
            }
        }
        System.out.print(stringToParse + "\n");
    }
}
