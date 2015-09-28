package tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Ruby on 2015/9/28.
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null)  return true;
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(root.left);
        q.add(root.right);

        while(!q.isEmpty()) {
            TreeNode left = q.poll();
            TreeNode right = q.poll();

            if(left == null && right == null)
                 continue;
            if(left == null ^ right == null || left.val != right.val)
                return false;
            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }
        return true;
    }
}
