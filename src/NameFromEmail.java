import java.util.ArrayList;
import java.util.Scanner;

// Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
//and returns a string that represents the user name in the following format: lastName firstName
//example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
//accents does not matter

public class NameFromEmail {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me your email in this format (firstName.lastName@exam.com)");
        String email = myScanner.nextLine();


        System.out.println(nameFromEmail("elek.viz@exam.com"));
    }

    private static String nameFromEmail(String cutString) {
        String result = ();
        int firstName = result.indexOf(".");
        int lastName = result.indexOf(".com");
        


        return result;
    }
}






