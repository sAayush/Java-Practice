public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] result = new int[len + 1];
        if (digits[len - 1] < 9) {
            digits[len - 1] += 1;
            return digits;
        } else {
            int carry = 1;
            for (int i = len - 1; i >= 0; i--) {
                int sum = digits[i] + carry;
                if (sum == 10) {
                    digits[i] = 0;
                    carry = 1;
                } else {
                    digits[i] = sum;
                    carry = 0;
                    break;
                }
            }
            if (carry == 1) {
                result[0] = 1;
                for (int i = 0; i < len; i++) {
                    result[i + 1] = digits[i];
                }
                return result;
            } else {
                return digits;
            }

        }
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] digits = { 9, 9, 9 };
        int[] result = po.plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
