package tree;

import java.util.Stack;

/**
 * no. 230
 * Created by Ruby on 2015/10/22 16:34.
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * Note:
 * You may assume k is always valid, 1 ¡Ü k ¡Ü BST's total elements.
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently?
 * How would you optimize the kthSmallest routine?
 */
public class KthSmallestElementinBST {
    public int kthSmallest(TreeNode root, int k) {
        int val = 0;
        int traveled = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode node = root;

        while((!stack.isEmpty() || node != null)) {
            //stack.add(node);
            while(node != null) {
                stack.add(node);
                node = node.left;
            }

            node = stack.pop();
            traveled ++;
            val = node.val;
            System.out.println(val);

            if(node.right != null) {
                stack.add(node.right);
                node = node.right;
                continue;
            } else
                node = null;
        }
        return val;
    }

    public static void main(String[] args) {
        KthSmallestElementinBST t = new KthSmallestElementinBST();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);

        System.out.print(t.kthSmallest(root, 1));
    }
}
