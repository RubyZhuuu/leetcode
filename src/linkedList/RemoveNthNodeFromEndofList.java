package linkedList;

/**
 * Created by ruby on 2015/9/2.
 * Given a linked list, remove the nth node from the end of list and return its head.
 */
public class RemoveNthNodeFromEndofList {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode pNode,nNode;
        pNode = nNode = head;

        while (n > 1 && nNode != null) {
            nNode = nNode.next;
            n --;
        }

        if(nNode == null)
            return head;

        if(nNode.next == null)
            return  head.next;

        while(nNode.next.next != null) {
            pNode = pNode.next;
            nNode = nNode.next;
        }

        pNode.next = pNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode node = head;

        for(int i = 3; i < 4; i ++) {
            ListNode temp = new ListNode(i);
            node.next = temp;
            node = temp;
        }

        RemoveNthNodeFromEndofList r = new RemoveNthNodeFromEndofList();

        node = r.removeNthFromEnd(head, 10);

        while(node != null) {
            System.out.print(node.val);
            node = node.next;
        }
    }
}
