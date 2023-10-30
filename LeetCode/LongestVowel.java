public class LongestVowel {
    public int countVowelPermutation(int n) {
        int MAX = 1000000007;
        long a = 1, e = 1, i = 1, o = 1, u = 1;

        for (int j = 1; j < n; j++) {
            long a1 = (e) % MAX;
            long e1 = (a + i) % MAX;
            long i1 = (a + e + o + u) % MAX;
            long o1 = (i + u) % MAX;
            long u1 = (a) % MAX;

            a = a1;
            e = e1;
            i = i1;
            o = o1;
            u = u1;
        }
        return (int) ((a + e + i + o + u) % MAX);
    }

    public static void main(String[] args) {
        LongestVowel lv = new LongestVowel();
        System.out.println(lv.countVowelPermutation(5));
    }
}
