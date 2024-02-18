public class LongCommonSub {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256];
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < s.length()) {
            if (map[s.charAt(right)] == 0) {
                map[s.charAt(right)]++;
                right++;
            } else {
                map[s.charAt(left)]--;
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }   
    public static void main(String[] args) {
        LongCommonSub lcs = new LongCommonSub();
        String s = "abcabcbb";
        System.out.println(lcs.lengthOfLongestSubstring(s));
    }
}
