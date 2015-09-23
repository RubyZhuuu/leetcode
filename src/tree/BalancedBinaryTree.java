package tree;

/**
 * Created by ruby on 2015/9/2.
 */
public class BalancedBinaryTree {
    private boolean balanced = true;

    private int findDepth(TreeNode node, int depth) {
        if(!balanced || node == null) {
            return depth - 1;
        }

        int lDepth = findDepth(node.left, depth + 1);
        int rDepth = findDepth(node.right, depth + 1);

        int sub = Math.abs(lDepth - rDepth);
        if(sub > 1)
            balanced = false;

        return Math.max(lDepth, rDepth);
    }

    public boolean isBalanced(TreeNode root) {
        findDepth(root, 1);
        return balanced;
    }
}
