package LeetCode;
import java.util.*;

public class GenerateBrackets {

    public List<String> Generate(int n) {
        List<String> result = new ArrayList<>();
        GenerateHelper(result, "", 0, 0, n);
        return result;
    }

    public static void GenerateHelper(List<String> result, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            GenerateHelper(result, current + "(", open + 1, close, n);
        }

        if (close < open) {
            GenerateHelper(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        GenerateBrackets gb = new GenerateBrackets();
        System.out.println(gb.Generate(3));
    }
}
