package tree;

/**
 * Created by ruby on 2015/10/9.
 */
public class PopulatingNextRightPointers2 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }
    public void connect(TreeLinkNode root) {
        TreeLinkNode layer = root;
        TreeLinkNode node;
        TreeLinkNode prev;

        while(layer != null) {
            node = layer;
            layer = null;
            prev = null;

            while (node != null) {
                if (node.left != null) {
                    if(prev == null) {
                        prev = node.left;
                        layer = node.left;
                    }
                    else {
                        prev.next = node.left;
                        prev = node.left;
                    }
                }

                if (node.right != null) {
                    if(prev == null) {
                        prev = node.right;
                        layer = node.right;
                    }
                    else {
                        prev.next = node.right;
                        prev = node.right;
                    }
                }
                node = node.next;
            }
        }
    }

}
