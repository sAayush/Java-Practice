public class LeetcodeBank {
    public int totalMoney(int n) {
        int res = 0;
        int week = n / 7;
        int day = n % 7;
        for (int i = 0; i < week; i++) {
            res += 28 + 7 * i;
        }
        for (int i = 0; i < day; i++) {
            res += week + i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        LeetcodeBank lb = new LeetcodeBank();
        System.out.println(lb.totalMoney(10));
    }
}
