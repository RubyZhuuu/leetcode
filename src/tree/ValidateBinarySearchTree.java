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
    private boolean checkValid(TreeNode node, int small, int bigger) {
        if(node == null)
            return true;
        if(small == bigger)
            return node.val < small;
        return small < node.val && node.val < bigger;
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        boolean left =  checkValid(root.left, root.val, root.val);
        boolean right = checkValid(root.right, root.val, root.val);

        return left && right;
    }
}
