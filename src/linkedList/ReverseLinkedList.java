package linkedList;

/**
 * Created by ruby on 2015/9/2.
 */

public class ReverseLinkedList {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;

        ListNode pNode, nNode;
        pNode = head;
        nNode = head.next;

        while(nNode != null) {
            ListNode temp = nNode.next;
            nNode.next = pNode;
            pNode = nNode;
            nNode = temp;
        }
        head.next = null;

        return pNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode node = head;

        for(int i = 3; i < 10; i ++) {
            ListNode temp = new ListNode(i);
            node.next = temp;
            node = temp;
        }

        ReverseLinkedList r = new ReverseLinkedList();

        node = r.reverseList(head);

        while(node != null) {
            System.out.print(node.val);
            node = node.next;
        }
    }

}
