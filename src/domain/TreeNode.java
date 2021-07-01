package domain;

/**
 *                  1
 *                /   \
 *               2     5
 *              / \   / \
 *             3   4 6   7
 *
 *             前：1 2 3 4 5 6 7
 *             中：3 2 4 1 6 5 7
 *             后：3 4 2 6 7 5 1
 *             层：1 2 5 3 4 6 7
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode create() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode5;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        treeNode5.left = treeNode6;
        treeNode5.right = treeNode7;

        return treeNode1;
    }
}
