class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class NodeAvg {
    public int averageOfSubtree(TreeNode root) {
        int[] res = new int[1];
        traverse(root, res);
        return res[0];
    }

    public int[] traverse(TreeNode root, int[] res) {

        if (root == null) { 
            return new int[] { 0, 0 };
        }

        int[] left = traverse(root.left, res);
        int[] right = traverse(root.right, res);

        int sum = left[0] + right[0] + root.val;
        int count = left[1] + right[1] + 1;

        if (sum / count == root.val) {
            res[0]++;
        }
        return new int[] { sum, count };
    }

    public static void main(String[] args) {
        NodeAvg nodeAvg = new NodeAvg();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(7);

        System.out.println(nodeAvg.averageOfSubtree(root));
    }
}
