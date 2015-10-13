package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ruby on 2015/10/13 9:58.
 */
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        pathSumHelper(root, sum, new LinkedList<Integer>(), paths);
        return paths;
    }

    private void pathSumHelper(TreeNode node, int sum, List<Integer> currentPath, List<List<Integer>> paths) {
        if(node == null)
            return;

        currentPath.add(node.val);

        if(node.left == null && node.right == null && sum == node.val)
            paths.add(new ArrayList<Integer>(currentPath));

        pathSumHelper(node.left, sum - node.val, currentPath, paths);
        pathSumHelper(node.right, sum - node.val, currentPath, paths);
        currentPath.remove(currentPath.size() - 1);
    }
}
