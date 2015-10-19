package tree;

import java.util.List;

/**
 * Created by Ruby on 2015/10/19 15:59.
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        CountComplateTreeNodes p = new CountComplateTreeNodes();

            System.out.println(p.countNodes(root));
    }
}
