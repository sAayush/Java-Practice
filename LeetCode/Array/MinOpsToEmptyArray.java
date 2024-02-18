import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinOpsToEmptyArray {
    public int minOperations(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i], list);
            max = Math.max(max, list.size());
        }
        return nums.length - max;
    }

    public static void main(String[] args) {
        MinOpsToEmptyArray moea = new MinOpsToEmptyArray();
        int[] nums = { 2, 3, 3, 2, 2, 4, 2, 3, 4 };
        System.out.println(moea.minOperations(nums));
    }
}
