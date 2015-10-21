package tree;

import java.util.List;

/**
 * no. 222
 * Created by Ruby on 2015/10/19 15:59.
 * Given a complete binary tree, count the number of nodes.
 */
public class CountComplateTreeNodes {
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;

        int rightLength = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;

        while(right != null) {
            rightLength ++;
            right = right.right;
            left = left.left;
        }

        if(left == null)
            return (2 << rightLength) - 1;
        return  countNodes(root.left) + countNodes(root.right) + 1;
    }

}
