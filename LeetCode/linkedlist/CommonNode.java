import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class CommonNode {
    Map<Integer, Integer> freq = new HashMap<>();

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        freq.put(root.val, freq.getOrDefault(root.val, 0) + 1);
        dfs(root.left);
        dfs(root.right);
    }

    public int[] findMode(TreeNode root) {
        dfs(root);

        int maxf = 0;
        for (int key : freq.keySet()) {
            maxf = Math.max(maxf, freq.get(key));
        }

        List<Integer> list = new ArrayList<>();
        for (int key : freq.keySet()) {
            if (freq.get(key) == maxf) {
                list.add(key);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        CommonNode cn = new CommonNode();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        int[] res = cn.findMode(root);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}