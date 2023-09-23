import java.util.Arrays;

public class SquareDigits {
    public int[] sortedSquares(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] *= nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                res[k--] = nums[i] * nums[i];
                i++;
            } else {
                res[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        SquareDigits sol = new SquareDigits();
        System.out.println(sol.sortedSquares(nums));
    }
}
