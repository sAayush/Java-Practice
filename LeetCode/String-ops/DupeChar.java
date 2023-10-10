import java.util.Stack;

public class DupeChar {

    // This program removes duplicate characters from a string
    // it works by using a stack and a boolean array

    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        // track the lastIndex of character presence

        // initialize lastIndex to -1
        // this loop iterates through each element in the array
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i; // track the lastIndex of character presence
        }

        // bool and stack is for tracking
        // boolean array to keep track of seen characters
        // stack to keep track of the characters in the string
        boolean[] seen = new boolean[26]; // keep track seen
        Stack<Integer> st = new Stack();

        // this loop iterates through each element in the array
        // what this loop does is it checks if the current character is a duplicate
        for (int i = 0; i < s.length(); i++) {
            // curr is the current character
            int curr = s.charAt(i) - 'a';

            // if the current character is a duplicate, continue
            if (seen[curr])
                continue; // if seen continue as we need to pick one char only

            // if the current character is not a duplicate
            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]) {
                seen[st.pop()] = false; // pop out and mark unseen
            }
            st.push(curr); // add into stack
            seen[curr] = true; // mark seen
        }

        // sb does the task of storing the characters in the string
        StringBuilder sb = new StringBuilder();

        // this loop iterates through each element in sb
        while (!st.isEmpty())
            sb.append((char) (st.pop() + 'a'));
        // reverse the string and return
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        DupeChar dc = new DupeChar();
        String s = "bcabc";
        System.out.println(dc.removeDuplicateLetters(s));
    }
}
