package tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Ruby on 2015/10/8 14:33.
 */
public class PopulatingNextRightPointersInEachNode {
    private class TreeLinkNode {
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;
    }

    static void connect(TreeLinkNode root) {
        if(root == null)
            return;

        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);

        int count = 1;

        while(!queue.isEmpty()) {
            TreeLinkNode next = null;
            int temp = 0;
            while(count -- > 0) {
                TreeLinkNode current = queue.poll();
                current.next = next;
                next = current;
                if(current.right != null) {
                    queue.add(current.right);
                    temp ++;
                }
                if(current.left != null) {
                    queue.add(current.left);
                    temp ++;
                }
           }

            count = temp;
        }
    }

}
