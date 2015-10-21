package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * no. 103
 * Created by Ruby on 2015/10/21 15:40.
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
     3
    / \
   9  20
  /     \
 15      7
 return its zigzag level order traversal as:
 [
 [3],
 [20,9],
 [15,7]
 ]
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null)
            return res;

        List<TreeNode> levelNodes = new ArrayList<TreeNode>();
        levelNodes.add(root);

        boolean leftToRight = true;

        while(levelNodes.size() != 0) {
            ArrayList<TreeNode> nextLevel = new ArrayList<TreeNode>();
            ArrayList<Integer> temp = new ArrayList<Integer>();

            if(leftToRight) {
                for(TreeNode node : levelNodes) {
                    if(node.left != null)
                        nextLevel.add(node.left);
                    if(node.right != null)
                        nextLevel.add(node.right);

                    temp.add(node.val);
                }
            } else {
                for(int index = levelNodes.size() - 1; index >= 0; index --) {
                    TreeNode node = levelNodes.get(index);
                    if(node.right != null)
                        nextLevel.add(0, node.right);
                    if(node.left != null)
                        nextLevel.add(0, node.left);

                    temp.add(node.val);
                }
            }

            leftToRight = !leftToRight;
            levelNodes = nextLevel;
            res.add(temp);
        }

        return res;
    }
}
