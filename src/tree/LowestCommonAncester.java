package tree;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Ruby on 2015/10/13 15:28.
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia:
 * “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants
 * (where we allow a node to be a descendant of itself).”
 */
public class LowestCommonAncester {
    private TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        containsNode(root, p, q);
        return result;
    }

    //比较好的解法
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;

        if(root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor2(root.left, p, q);
        TreeNode right = lowestCommonAncestor2(root.right, p, q);

        if(left != null && right != null)
            return  left;

        return  left == null ? right : left;
    }


    private boolean containsNode(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null)
            return false;

        boolean selfFlag = false;
        boolean leftFlag = false;
        boolean rightFlag = false;

        if(node == p || node == q) {
            selfFlag = true;
        }

        leftFlag = containsNode( node.left, p, q);
        rightFlag = containsNode( node.right, p, q);

        if(!selfFlag && !leftFlag && !rightFlag)
            return false;

        if(leftFlag && rightFlag || selfFlag && leftFlag || selfFlag && rightFlag) {
            if(result == null)
                result = node;
        }
        return true;
    }

    public static void main(String[] args) {
        LowestCommonAncester test = new LowestCommonAncester();

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;

        System.out.print(test.lowestCommonAncestor(root, root, left));
    }
}
