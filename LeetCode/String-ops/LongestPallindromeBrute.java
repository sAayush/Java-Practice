public class LongestPallindromeBrute {
    public boolean isPallindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return String.valueOf(s.charAt(0));
        }

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1)
                break;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    String temp = s.substring(i, j + 1);
                    if (isPallindrome(temp) && temp.length() > res.length()) {
                        res = temp;
                    }
                }
            }
        }

        if (res.length() == 0) {
            res = String.valueOf(s.charAt(0));
        }

        return res;
    }

    public static void main(String[] args) {
        LongestPallindromeBrute lp = new LongestPallindromeBrute();
        String s = "babad";
        System.out.println(lp.longestPalindrome(s));
    }
}
