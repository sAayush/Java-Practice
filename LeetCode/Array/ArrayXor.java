public class ArrayXor {
    public int[] findArray(int[] pref) {
        int[] res = new int[pref.length];
        res[0] = pref[0];

        for (int i = 1; i < res.length; i++) {
            res[i] = pref[i] ^ pref[i - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayXor ax = new ArrayXor();
        int[] pref = { 5, 2, 0, 3, 1 };
        int[] res = ax.findArray(pref);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
