package tree;

/**
 * Created by Ruby on 2015/9/28 14:22.
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia:
 * ¡°The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants
 * (where we allow a node to be a descendant of itself).¡±
 */
public class LowestCommonAncesterofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return root;

        if(p.val == root.val || q.val == root.val)
            return root;

        if(p.val > root.val ^ q.val > root.val)
            return root;

        if(p.val > root.val && p.val > root.val)
            return lowestCommonAncestor(root.right, p, q);

        return lowestCommonAncestor(root.left, p, q);
    }
}
