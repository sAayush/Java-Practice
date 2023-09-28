public class DiffString {
    public char findTheDifference(String s, String t) {
        char result = 0;

        // Perform XOR operation on each character of string s
        for (char c : s.toCharArray()) {
            result ^= c;
        }

        // Perform XOR operation on each character of string t
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        // Return the extra character in string t
        return result;
    }

    public static void main(String[] args) {
        DiffString ds = new DiffString();
        String s = "abcd";
        String t = "bcead";
        System.out.println(ds.findTheDifference(s, t));
    }
}