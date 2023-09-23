import java.util.*;

public class Test {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(result, "", 0, 0, n);
        return result;
    }

    private static void generateParenthesisHelper(List<String> result, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generateParenthesisHelper(result, current + "(", open + 1, close, n);
        }

        if (close < open) {
            generateParenthesisHelper(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        List<String> result7 = generateParenthesis(n);
        System.out.println("n = " + n);
        for (String s : result7) {
            System.out.println(s);
        }

        n = 8;
        List<String> result8 = generateParenthesis(n);
        System.out.println("n = " + n);
        for (String s : result8) {
            System.out.println(s);
        }
    }
}