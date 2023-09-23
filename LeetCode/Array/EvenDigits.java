public class EvenDigits {
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int num = nums[i];
            while (num > 0) {
                num /= 10;
                count++;
            }
            if (count % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        EvenDigits sol = new EvenDigits();
        System.out.println(sol.findNumbers(nums));
    }
}
