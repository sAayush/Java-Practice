import java.util.Arrays;

public class MaxConti {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) break;
            if (nums[i] + 1 != nums[i + 1]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int val = Integer.MAX_VALUE;
        System.out.println(val);
        MaxConti mc = new MaxConti();
        int[] nums = {4,2,5,3};
        System.out.println(mc.minOperations(nums));
    }
}
