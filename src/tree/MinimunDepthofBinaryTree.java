package tree;

/**
 * Created by Ruby on 2015/9/28 15:17.
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimunDepthofBinaryTree {

    private int depthHelper(TreeNode node, int depth) {
        if(node.left != null && node.right !=null)
            return Math.min(depthHelper(node.left, depth + 1), depthHelper(node.right, depth + 1));
        if(node.left !=null && node.right == null)
            return depthHelper(node.left, depth + 1);
        if(node.right !=null && node.left == null)
            return depthHelper(node.right, depth + 1);
        return depth;
    }

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        return depthHelper(root, 1);
    }
}
