package linkedList;

/**
 * Created by ruby on 2015/10/12.
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
