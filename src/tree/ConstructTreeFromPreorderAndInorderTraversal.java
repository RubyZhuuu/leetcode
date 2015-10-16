package tree;

import java.util.List;

/**
 * Created by Ruby on 2015/10/16 10:18.
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 */
public class ConstructTreeFromPreorderAndInorderTraversal {
    private int traveled = 0;

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int start, int end) {
        TreeNode root = new TreeNode(preorder[traveled]);
        int inorderIndex = findPos(inorder, preorder[traveled ++], start, end);
        if(inorderIndex > start) {
            root.left = buildTreeHelper(preorder, inorder ,start, inorderIndex - 1);
        }
        if(end - inorderIndex > 0) {
            root.right = buildTreeHelper(preorder, inorder, inorderIndex + 1, end);
        }

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = null;
        if(preorder.length == 0)
            return root;

        root = buildTreeHelper(preorder, inorder, 0, inorder.length - 1);
        return  root;
    }

    private int findPos(int[] arr, int val, int start, int end) {
        for(int index = start; index <= end; index ++) {
            if(arr[index] == val)
                return index;
        }
        return 0;
    }

}
