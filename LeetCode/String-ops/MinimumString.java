import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinimumString {
    public int minDeletionsToMakeGoodString(String s) {
        int[] charCount = new int[26]; // Array to count character frequencies

        // Step 1: Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Step 2: Create a set to track unique frequencies
        Set<Integer> uniqueFrequencies = new HashSet<>();

        // Step 3: Initialize deletedCount
        int deletedCount = 0;

        // Step 4 to 7: Iterate through character frequencies
        for (int freq : charCount) {
            while (freq > 0 && uniqueFrequencies.contains(freq)) {
                freq--;
                deletedCount++;
            }
            if (freq > 0) {
                uniqueFrequencies.add(freq);
            }
        }

        // Step 8: Return the minimum number of deletions
        return deletedCount;
    }

    public static void main(String[] args) {
        MinimumString solution = new MinimumString();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        System.out.println(solution.minDeletionsToMakeGoodString(s1)); // Output: 0

    }
}
