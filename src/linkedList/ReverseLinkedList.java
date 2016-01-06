package linkedList;

/**
 * no 206
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

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

}
