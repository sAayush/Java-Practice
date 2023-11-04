import java.util.ArrayList;
import java.util.List;

public class PhoneNumPad {
    public List<String> letterCombinations(String digits) {
        String[] numPad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }

        res.add("");
        for (int i = 0; i < digits.length(); i++) {
            res = combine(numPad[digits.charAt(i) - '0'], res);
        }
        return res;
    }

    private List<String> combine(String digits, List<String> res) {
        List<String> newRes = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            for (String str : res) {
                newRes.add(str + digits.charAt(i));
            }
        }
        return newRes;
    }

    public static void main(String[] args) {
        PhoneNumPad pnp = new PhoneNumPad();
        String digits = "23";
        System.out.println(pnp.letterCombinations(digits));
    }
}
