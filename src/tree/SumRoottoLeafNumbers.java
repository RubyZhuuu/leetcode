package tree;

/**
 * Created by ruby on 2015/10/12.
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * Find the total sum of all root-to-leaf numbers.
 */
public class SumRoottoLeafNumbers {
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        if(root == null)
            return sum;

        sumHelper(root.val, root);
        return sum;
    }

    public void sumHelper(int curr, TreeNode node) {
        if(node.right == null && node.left == null)
            sum += curr;

        if(node.left != null)
            sumHelper(curr * 10 + node.left.val, node.left);
        if(node.right != null)
            sumHelper(curr * 10 + node.right.val, node.right);
    }
}
