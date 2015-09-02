package tree;

/**
 * Created by ruby on 2015/9/2.
 */
public class BalancedBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isBalanced(TreeNode root) {
        if(!isBalanced(root.left) || !isBalanced(root.right))
            return false;

        return false;
    }
}
