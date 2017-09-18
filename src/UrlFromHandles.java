import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
// GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

// example:
// input: ["ghhandle1", "ghhandle2"]
// output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]

public class UrlFromHandles {
    public static void main(String[] args){

        ArrayList<String> userName = new ArrayList<String>(Arrays.asList("StudentOne", "StudentTwo"));

        ArrayList<String> greenForxUrl = new ArrayList<String>(Arrays.asList("https://github.com/greenfox-academy/teststudent"));


        ArrayList<String> eredmeny = (urlsFromHandles(greenForxUrl);

        for (int i = 0; i < eredmeny.size(); i++) {
            System.out.println(eredmeny.get(i));
        }

    }

    private static ArrayList<String> urlsFromHandles(ArrayList<String> strings) {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 1; i < strings.size(); i++) {
            output.set(i, strings.get(i));
        }

        return output;

    }


}



