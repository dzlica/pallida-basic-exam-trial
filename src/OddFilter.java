import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class OddFilter {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> oddFilter = oddFilter(inputList);
        for (int i = 0; i < oddFilter.size(); i++) {
            System.out.println(oddFilter.get(i));
        }
        // Create a function that takes a list as a parameter,
        // and returns a new list with every odd element from the orignal list
        // should print [1, 3, 5]
    }

    private static ArrayList<Integer> oddFilter(ArrayList<Integer> incomingList) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= incomingList.size(); i++) {
            int odd = incomingList.get(i) % 2;
            if (odd != 0) {
                result.set(i, incomingList.get(i));
            }

        }
        return result;
    }
}
