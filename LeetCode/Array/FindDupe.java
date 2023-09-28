import java.util.Arrays;

public class FindDupe {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        FindDupe ar1 = new FindDupe();
        int[] nums = { 1, 3, 4, 2, 2 };
        
        
        System.out.println(ar1.findDuplicate(nums));
    }
}
