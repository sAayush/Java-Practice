package LeetCode.Array;
public class RemoveDupes {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            // if nums[j] is not equal to nums[i], increment i and set nums[i] to nums[j]
            // meaning that we are replacing the duplicate with a non-duplicate
            // if nums[j] is equal to nums[i], do nothing
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    
    public static void main(String[] args) {
        RemoveDupes ar1 = new RemoveDupes();
        int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4 };

        System.out.println(ar1.removeDuplicates(nums));
    }
}
