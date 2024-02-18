class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 2, 3 };
        int val = 3;
        Solution s = new Solution();
        int k = s.removeElement(nums, val);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
