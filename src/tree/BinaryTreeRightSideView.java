package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Ruby on 2015/10/19 9:25.
 * no. 230
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideView = new ArrayList<Integer>();

        if(root == null)
            return rightSideView;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int layerCount = 1;

        while(!queue.isEmpty()) {
            int temp = 0;
            for(int i = 0; i < layerCount; i ++) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.add(node.left);
                    temp ++;
                }
                if(node.right != null) {
                    queue.add(node.right);
                    temp ++;
                }
                if(i == layerCount - 1)
                    rightSideView.add(node.val);
            }
            layerCount = temp;
        }
        return rightSideView;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        BinaryTreeRightSideView p = new BinaryTreeRightSideView();
        List<Integer> rightSideView = p.rightSideView(root);
        for(int i = 0; i < rightSideView.size(); i++) {
            System.out.println(rightSideView.get(i));
        }
    }
}
