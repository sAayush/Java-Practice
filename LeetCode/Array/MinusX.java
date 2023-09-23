package LeetCode.Array;
public class MinusX{
    public int minOperations(int[] nums, int x) {
        int sum = 0;

        // sum of all elements in nums
        for (int i : nums) {
            sum += i;
            // if sum is equal to x, return length of nums
            if (sum == x) return nums.length;
        }
        // variable declaration
        int target = sum - x;
        int left = 0;
        int right = 0;
        int max = -1;
        int curr = 0;

        // loop to find the longest subarray with sum = target
        while (right < nums.length) {
            // add nums[right] to current sum
            curr += nums[right];
            // if current sum is greater than target, subtract nums[left] from current sum
            // which is equivalent to removing nums[left] from subarray
            while (curr > target && left <= right) {
                curr -= nums[left];
                left++;
            }
            // if current sum is equal to target, update max
            if (curr == target) {
                // max is the length of the subarray
                max = Math.max(max, right - left + 1);
            }
            // increment right if current sum is less than target
            right++;
        }

        // return length of nums - max
        return max == -1 ? -1 : nums.length - max;


    }
    public static void main(String[] args) {
        MinusX ar1 = new MinusX();
        int[] nums = { 1, 3, 4, 2, 2 };
        int x = 4;
        
        System.out.println(ar1.minOperations(nums, x));
    }
}