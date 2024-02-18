import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        // 2 variable method

        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;

        // Brute force

        // int max = 0;
        // int maxIndex = 0;
        // for (int i = 0; i < nums.length; i++) {
        // int count = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // count++;
        // }
        // }
        // if (count > max) {
        // max = count;
        // maxIndex = i;
        // }
        // }
        // return nums[maxIndex];

        // Sorting

        // Arrays.sort(nums);
        // return nums[nums.length / 2];

        // HashMap

        // Map<Integer, Integer> map = new HashMap<>();
        // for (int num : nums) {
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for (int num : nums) {
        // if (map.get(num) > nums.length / 2) {
        // return num;
        // }
        // }
        // return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }
}
