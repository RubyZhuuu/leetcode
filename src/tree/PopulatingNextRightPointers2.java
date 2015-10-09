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

        while(layer != null) {
            node = layer;

            while (node != null) {
                if (node.left != null) {
                    if (node.right != null)
                        node.left.next = node.right;
                    else {
                        TreeLinkNode temp = node.next;
                        while (temp != null) {
                            node.left.next = temp.left != null ? temp.left : temp.right;
                            if(node.left.next != null)
                                break;
                            temp = temp.next;
                        }
                    }
                }

                if (node.right != null) {
                    if(node.next == null)
                        node.right.next = null;
                    else {
                        TreeLinkNode temp = node.next;
                        while (temp != null) {
                            node.right.next = temp.left != null ? temp.left : temp.right;
                            if(node.right.next != null)
                                break;
                            temp = temp.next;
                        }
                    }
                }
                node = node.next;
            }
            layer = layer.left == null ? layer.right : layer.left;
        }
    }

}
