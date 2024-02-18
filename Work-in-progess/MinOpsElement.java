import java.util.List;
import java.util.Arrays;

public class MinOpsElement {
    public int minOperations(List<int[]> numList, int k) {
        int count = 1;
        int n = numList.size();

        for (int i = n - 1; i > 0; i++) {
        }
        return count;
    }

    public static void main(String[] args) {
        MinOpsElement moe = new MinOpsElement();
        int[] nums = { 1, 2, 3, 4 };
        List<int[]> numList = Arrays.asList(nums);
        int k = 5;
        System.out.println(moe.minOperations(numList, k));
    }
}
