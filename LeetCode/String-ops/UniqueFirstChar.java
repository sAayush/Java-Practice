import java.util.HashMap;
import java.util.Map;

public class UniqueFirstChar {
    public int firstUniqChar(String s) {
        // using array to store the frequency of each character

        // int[] freq = new int[26];
        // for (char c : s.toCharArray()) {
        // freq[c - 'a']++;
        // }
        // for (int i = 0; i < s.length(); i++) {
        // if (freq[s.charAt(i) - 'a'] == 1) {
        // return i;
        // }
        // }
        // return -1;

        // using hashmap to store the frequency of each character

        // Map<Character, Integer> map = new HashMap<>();

        // for (char c : s.toCharArray()) {
        // map.put(c, map.getOrDefault(c, 0) + 1);
        // }
        // for (int i = 0; i < s.length(); i++) {
        // if (map.get(s.charAt(i)) == 1) {
        // return i;
        // }
        // }
        // return -1;

        // Brute force

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        UniqueFirstChar ufc = new UniqueFirstChar();
        String s = "leetcode";
        System.out.println(ufc.firstUniqChar(s));
    }
}
