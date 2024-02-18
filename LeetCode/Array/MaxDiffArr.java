import java.util.Arrays;

public class MaxDiffArr {
    public int[][] divideArray(int[] nums, int k) {
        int size = nums.length;
        int[][] res = new int[size / 3][3];

        Arrays.sort(nums);

        for (int i = 0; i < size; i = i + 3) {
            if (i + 2 < size && nums[i + 2] - nums[i] <= k) {
                res[i / 3][0] = nums[i];
                res[i / 3][1] = nums[i + 1];
                res[i / 3][2] = nums[i + 2];
            } else {
                return new int[][] {};
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MaxDiffArr mda = new MaxDiffArr();
        int[] nums = { 1, 3, 4, 8, 7, 9, 3, 5, 1 };
        int k = 2;
        System.out.println(mda.divideArray(nums, k));
    }
}
