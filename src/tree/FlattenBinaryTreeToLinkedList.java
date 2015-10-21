package tree;

import java.util.Stack;

/**
 * no. 114
 * Created by Ruby on 2015/10/21 16:42.
 * Given a binary tree, flatten it to a linked list in-place.
 * For example,
 * Given
      1
     / \
    2   5
   / \   \
  3   4   6
 The flattened tree should look like:
 1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if(root != null)
            stack.add(root);

        TreeNode prev = null;

        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if(curr.right != null)
                stack.add(curr.right);
            if(curr.left != null)
                stack.add(curr.left);

            if(prev != null) {
                prev.right = curr;
                prev.left = null;
            }
            prev = curr;
        }
    }
}
