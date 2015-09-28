package tree;

/**
 * Created by Lenovo on 2015/9/28.
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 */
public class PathSum {
    private boolean flag = false;

    private void sumHelper(TreeNode node, int target) {
        if(node.left != null)
            sumHelper(node.left, target - node.val);
        if(node.right != null)
            sumHelper(node.right, target - node.val);

        if(node.left == null && node.right == null && node.val == target)
            flag = true;
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        sumHelper(root, sum);
        return flag;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;

        PathSum p = new PathSum();
        System.out.print(p.hasPathSum(root, 1));
    }
}
