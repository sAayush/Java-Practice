public class Pattern123p {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1, k = 2;
        while (k < n){
            if (nums[i] < nums[j] && nums[j] > nums[k] && nums[i] < nums[k]){
                return true;
            }
            i++;
            j++;
            k++;
        }
        return false;
    }
    public static void main(String[] args) {
        Pattern123p p123 = new Pattern123p();
        // int[] nums = {1,2,3,4};
        int[] nums = {3,1,4,2};
        System.out.println(p123.find132pattern(nums));
    }
}
