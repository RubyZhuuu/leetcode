package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Ruby on 2015/10/9 15:07.
 * Given a binary tree, return the postorder traversal of its nodes' values.
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversal = new LinkedList<Integer>();
        if(root == null)
            return traversal;

        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode node = root;
        TreeNode traveled = root;
        stack.add(node);

        while(!stack.isEmpty()) {
            node = stack.peek();
            while(node.left != null && node.left != traveled && node.right != traveled) {
                stack.add(node.left);
                node = node.left;
            }
            if(node.right != null && node.right != traveled) {
                stack.add(node.right);
            } else {
                traveled = stack.pop();
                traversal.add(traveled.val);
            }
        }

        return traversal;
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return ans;

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            ans.addFirst(cur.val);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        return ans;
    }
}
