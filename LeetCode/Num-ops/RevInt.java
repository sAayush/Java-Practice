public class RevInt {
    public int reverse(int x) {
        int newx = Math.abs(x);

        int rev = 0;
        while (newx != 0) {
            int pop = newx % 10;

            if (rev > (Integer.MAX_VALUE - pop) / 10)
                return 0;

            rev = rev * 10 + pop;

            newx /= 10;
        }
        return (x < 0) ? (-rev) : rev;
    }

    public static void main(String[] args) {
        RevInt ri = new RevInt();
        int x = 123;
        System.out.println(ri.reverse(x));
    }
}
