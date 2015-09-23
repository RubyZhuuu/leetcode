package tree;

//import sun.reflect.generics.tree.Tree;


/**
 * Created by ruby on 2015/9/23.
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null)
            return (p == null && p == null);
        if(q.val != p.val)
            return false;

        boolean left = isSameTree(p.left, q.left);

        if(left) {
            boolean right = isSameTree(p.right, q.right);
            return left && right;
        } else {
            return false;
        }
    }
}
