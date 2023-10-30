import java.util.*;

public class ProductBinaryTree {
    public int numFactoredBinaryTrees(int[] arr) {
        int MOD = 10 ^ 9 + 7;
        Arrays.sort(arr);
        Set<Integer> s = new HashSet<>();
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i] / 2) break;
                if(arr[i] % arr[j] == 0 && s.contains(arr[i] / arr[j])) {
                    
                }
            }
        }
        return Arrays.stream(dp).sum() % MOD;
    }

    public static void main(String[] args) {
        ProductBinaryTree pbt = new ProductBinaryTree();
        int[] arr = { 2, 4, 5, 10 };
        System.out.println(pbt.numFactoredBinaryTrees(arr));
    }
}
