package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ruby on 2015/9/30 10:12.
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new LinkedList<Integer>();
        inorderTraversalHelper(root, traversal);

        return traversal;
    }

    private void inorderTraversalHelper(TreeNode node, List<Integer> list) {
        if(node == null)
            return;
        inorderTraversalHelper(node.left, list);
        list.add(node.val);
        inorderTraversalHelper(node.right, list);
    }
}
