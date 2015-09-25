package tree;

/**
 * Created by ruby on 2015/9/25.
 * Given a binary tree, find its maximum depth.
   The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximunDepthofBinaryTree {
    private int countDepth(TreeNode node, int d) {
        if(node == null)
            return d - 1;

        return Math.max(countDepth(node.left, d + 1), countDepth(node.right, d + 1));
    }

    public int maxDepth(TreeNode root) {
        return countDepth(root, 1);
    }
}
