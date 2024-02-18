import java.util.Arrays;

public class PolygonPerameterMaximum {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = nums.length - 1; i >= 2; i--) {
            if (sum - nums[i] > nums[i]) {
                return sum;
            } else {
                sum -= nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PolygonPerameterMaximum ppm = new PolygonPerameterMaximum();
        int[] nums = { 5, 5, 5 };
        System.out.println(ppm.largestPerimeter(nums));
    }
}
