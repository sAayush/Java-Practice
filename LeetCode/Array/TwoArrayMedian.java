package LeetCode.Array;
public class TwoArrayMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] nums = new int[size];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length && k < size) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            nums[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            nums[k++] = nums2[j++];
        }

        // for (int k2 = 0; k2 < nums.length; k2++) {
        //     System.out.println(nums[k2]);
        // }
        
        if (size % 2 == 0) {
            return (nums[size / 2] + nums[size / 2 - 1]) / 2.0;
        } else {
            return nums[size / 2];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        
        TwoArrayMedian sol = new TwoArrayMedian();
        System.out.println(sol.findMedianSortedArrays(nums1, nums2));
    }
}
