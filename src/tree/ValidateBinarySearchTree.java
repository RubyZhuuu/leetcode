package tree;


import java.util.Stack;

/**
 * Created by ruby on 2015/9/23.
 * Given a binary tree, determine if it is a valid binary search tree (BST).
   Assume a BST is defined as follows:
   The left subtree of a node contains only nodes with keys less than the node's key.
   The right subtree of a node contains only nodes with keys greater than the node's key.
   Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        int prev = 0;
        boolean flag = true;

        while(!stack.isEmpty() || node != null) {
            while(node != null) {
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            if(flag) {
                prev = node.val;
                flag = false;
            } else {
                if(prev >= node.val)
                    return false;
                prev = node.val;
            }
            node = node.right;
        }
        return true;
    }
}
