package LeetCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeastMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] sums = new int[mat.length];
        
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    sums[i]++;
                } else {
                    break;
                }
            }
        }
        // Create a list of row indices and sort it based on strength
        List<Integer> rowIndices = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            rowIndices.add(i);
        }
        Collections.sort(rowIndices, (a, b) -> {
            if (sums[a] == sums[b]) {
                return a - b;
            }
            return sums[a] - sums[b];
        });
        
        // Get the first k elements from the sorted list
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowIndices.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        LeastMatrix test = new LeastMatrix();
        int[][] mat = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };
        int k = 3;
        int[] res = test.kWeakestRows(mat, k);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
