import java.util.ArrayList;
import java.util.Arrays;

// Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
// GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

// example:
// input: ["ghhandle1", "ghhandle2"]
// output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]

public class UrlFromHandles {
    public static void main(String[] args){

        ArrayList<String> userName = new ArrayList<String>(Arrays.asList("StudentOne", "StudentTwo"));
        ArrayList<String> eredmeny = (urlsFromHandles(userName));
        for (int i = 0; i < eredmeny.size(); i++) {
            System.out.println(eredmeny.get(i));
        }
    }
    private static ArrayList<String> urlsFromHandles(ArrayList<String> strings) {
        ArrayList<String> output = new ArrayList<String>();
        String greenForxUrl = ("https://github.com/greenfox-academy/");
        for (int i = 1; i < strings.size(); i++) {
            output.add(greenForxUrl + strings.get(i));
        }
        return output;
    }
}



