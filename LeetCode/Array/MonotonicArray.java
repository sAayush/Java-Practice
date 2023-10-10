public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                break;
            }
            if (nums[i] < nums[i+1]) {
                isIncreasing = true;
                if (isDecreasing) {
                    return false;
                }
            }
            if (nums[i] > nums[i+1]) {
                isDecreasing = true;
                if (isIncreasing) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MonotonicArray ma = new MonotonicArray();
        int[] nums = {1,2,2,3};
        System.out.println(ma.isMonotonic(nums));
    }
}
