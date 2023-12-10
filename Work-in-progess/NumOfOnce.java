public class NumOfOnce {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        NumOfOnce noo = new NumOfOnce();
        int num = 00000000000000000000000000001011;
        System.out.println(noo.hammingWeight(num));
    }
}
