package tree;


/**
 * Created by ruby on 2015/9/23.
 * Given a binary tree, determine if it is a valid binary search tree (BST).
   Assume a BST is defined as follows:
   The left subtree of a node contains only nodes with keys less than the node's key.
   The right subtree of a node contains only nodes with keys greater than the node's key.
   Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
    private boolean compareLeft(TreeNode left, int val) {
        if(left == null || left.val < val)
            return true;
        return false;
    }

    private boolean compareRight(TreeNode right, int val) {
        if(right == null || right.val > val)
            return true;
        return false;
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        boolean left =  compareLeft(root.left, root.val);
        boolean right = compareRight(root.right, root.val);

        if(!left || !right)
            return false;

        if(!isValidBST(root.left))
            return false;

        return isValidBST(root.right);
    }
}
