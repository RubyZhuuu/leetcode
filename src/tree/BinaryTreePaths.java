package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ruby on 2015/9/28.
 * Given a binary tree, return all root-to-leaf paths.
 */
public class BinaryTreePaths {

    private List<String> paths = new LinkedList<String>();

    private void binaryTreePathsHelper(TreeNode node, StringBuffer str) {

        if(str.length() == 0) {
            str.append(node.val);
        } else {
            str.append("->");
            str.append(node.val);
        }
        StringBuffer prev = new StringBuffer();
        prev.append(str.toString());

        if(node.right == null && node.left == null)
            paths.add(str.toString());

        if(node.left != null)
            binaryTreePathsHelper(node.left, str);

        if(node.right != null)
            binaryTreePathsHelper(node.right, prev);

    }

    public List<String> binaryTreePaths(TreeNode root) {

        if(root == null)
            return paths;
        StringBuffer str = new StringBuffer();
        binaryTreePathsHelper(root, str);

        return paths;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        BinaryTreePaths p = new BinaryTreePaths();
        p.binaryTreePaths(root);
        for(int i = 0; i < p.paths.size(); i ++) {
            System.out.println(p.paths.get(i));
        }
    }
}
