package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Ruby on 2015/9/29 9:47.
 * Invert a binary tree.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;

        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(root);

        while(!q.isEmpty()) {
            TreeNode curr = q.poll();

            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null)
                q.add(curr.right);
        }

        return root;
    }
}
