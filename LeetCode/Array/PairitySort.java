public class PairitySort {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int in = 0;
        while (i < nums.length) {
            if (nums[i] % 2 == 0) {
                int temp = nums[in];
                nums[in] = nums[i];
                nums[i] = temp;
                in++;
            }
            i++;
        }
        return nums;
    }
    public static void main(String[] args) {
        PairitySort ps = new PairitySort();
        int[] nums = {3,1,2,4};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(ps.sortArrayByParity(nums)[i]);
        }
    }
}
