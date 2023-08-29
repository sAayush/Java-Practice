import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE; // Track the minimum length of input strings
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        StringBuilder commonPrefix = new StringBuilder(); // Use StringBuilder for efficient string concatenation
        for (int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i); // Take the i-th character of the first string as the reference character
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) { // If any subsequent string has a different character at the same
                                              // position, return the common prefix
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(c); // If all strings have the same character at the i-th position, append it to the
                                    // common prefix
        }
        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputList = new ArrayList<>(); // Use a list to store the input strings
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equals("")) {
                break;
            } else {
                inputList.add(input);
            }
        }
        sc.close();
        String[] actualInputArray = inputList.toArray(new String[inputList.size()]); // Convert the list to an array
        String commonPrefix = longestCommonPrefix(actualInputArray);
        System.out.println(commonPrefix);
    }
}