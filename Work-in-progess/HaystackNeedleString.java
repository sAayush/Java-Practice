public class HaystackNeedleString {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        int hlen = haystack.length();
        if (len == 0) return 0;
        for (int i = 0; i < hlen; i++) {
            if (i + len > hlen) break;
            if (haystack.substring(i, i + len).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        HaystackNeedleString hns = new HaystackNeedleString();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(hns.strStr(haystack, needle));
    }
}
