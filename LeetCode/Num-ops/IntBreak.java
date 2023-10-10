public class IntBreak {
    public int integerBreak(int n) {
        // for example if n = 9
        // 9 is greater in 3 so the condition is true then its 9/3 = 3
        // now 3 ** 3 = 27
        // the the right side of the code has 4 / (4 - 9 % 3) = 4 / 4 - 0 = 1
        // 27 * 1 = 27

        // if n = 10
        // 10 is greater in 3 so the condition is true then its 10/3 = 3
        // now 3 ** 3 = 27
        // the the right side of the code has 4 / (4 - 10 % 3) = 4 / 3
        // 27 * 4 / 3 = 36

        // if n = 11
        // 11 is greater in 3 so the condition is true then its 11/3 = 3
        // now 3 ** 3 = 27
        // the the right side of the code has 4 / (4 - 11 % 3) = 4 / 2
        // 27 * 4 / 2 = 54

        // how did it come ot life this formula that is
        // Simple if else can do the trick saying if remainder is 0 then return 3 ** n/3
        // else if remainder is 1 then return 3 ** n/3 - 1 * 4
        // else if remainder is 2 then return 3 ** n/3 * 2

        // but the formula is this because
        // if remainder = 0 then its basically num * 4 / 4 beacuse 4 - 4 = 0
        // if remainder = 1 then its basically num * 4 / 3 beacuse 4 - 3 = 1
        // if remainder = 2 then its basically num * 4 / 2 beacuse 4 - 2 = 2
        return n <=3 ? n - 1 : (int)Math.pow(3, n / 3) * 4 / (4 - n % 3);
    }

    // public int integerBreak(int n) {
    //     if (n == 2) return 1;
    //     if (n == 3) return 2;

    //     int count_of_3s = n / 3;
    //     int remainder = n % 3;

    //     if (remainder == 0) {
    //         return (int) Math.pow(3, count_of_3s);
    //     } else if (remainder == 1) {
    //         return (int) Math.pow(3, count_of_3s - 1) * 4;
    //     } else {
    //         return (int) Math.pow(3, count_of_3s) * 2;
    //     }
    // }


    public static void main(String[] args) {
        intBreak test = new intBreak();
        int n = 7;
        System.out.println(test.integerBreak(n));
        n = 8;
        System.out.println(test.integerBreak(n));
    }
}
