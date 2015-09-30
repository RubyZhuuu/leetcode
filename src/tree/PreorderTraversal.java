package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ruby on 2015/9/30 10:36.
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> travesal = new LinkedList<Integer>();
        if(root == null)
            return travesal;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            travesal.add(node.val);

            if(node.right != null)
                stack.add(node.right);

            if(node.left != null)
                stack.add(node.left);
        }
        return travesal;
    }
}
