package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ruby on 2015/9/25.
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 */
public class BinarayTreeLevelOrderTracersal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root == null) return l;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        int nodesCount = 1;

        while(!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            while (nodesCount -- > 0) {
                TreeNode ele = q.poll();
                list.add(ele.val);

                if (ele.left != null) q.add(ele.left);
                if (ele.right != null) q.add(ele.right);
            }
            l.add(list);
            nodesCount = q.size();
        }

        return l;
    }
}
