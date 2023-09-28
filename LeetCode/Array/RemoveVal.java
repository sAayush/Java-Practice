public class RemoveVal {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveVal rv = new RemoveVal();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(rv.removeElement(nums, val));
    }
}
