public class ArrayXOR_SLOW {
    public int[] findArray(int[] pref) {
        if (pref.length == 0) {
            return pref;
        }

        int len = pref.length;
        int num = pref[0];
        int j = 0;
        for (int i = 1; i < len; i++) {
            while (true) {

                if ((num ^ j) == pref[i]) {
                    pref[i] = j;
                    num = num ^ j;
                    // System.err.println("num: " + num + " j: " + j);
                    j = 0;
                    break;
                }
                j++;
            }
        }
        return pref;
    }

    public static void main(String[] args) {
        ArrayXOR_SLOW ax = new ArrayXOR_SLOW();
        int[] pref = { 3, 1, 4, 2 };
        int[] res = ax.findArray(pref);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
