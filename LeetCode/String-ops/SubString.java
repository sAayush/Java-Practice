public class SubString {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        int tIdx = 0;

        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }
            tIdx++;
        }

        return sIdx == s.length();
    }

    public static void main(String[] args) {
        SubString check = new SubString();

        String s = "abc";
        String t = "aabdce";
        System.out.println(check.isSubsequence(s, t));
    }
}
