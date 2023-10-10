public class BItsMaxArray {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                max1++;
            } else {
                max2 = Math.max(max1, max2);
                max1 = 0;
            }
        }
        return Math.max(max1, max2);
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        BItsMaxArray sol = new BItsMaxArray();
        System.out.println(sol.findMaxConsecutiveOnes(nums));
    }
}
