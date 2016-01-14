package linkedList;

/**
 * no 92
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * return 1->4->3->2->5->NULL.
 * Created by Ruby on 2016/1/6 13:58.
 */
public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0), tail, start;
        dummy.next = head;
        start = dummy;

        int num = n - m + 1;
        while(head != null && --m > 0) {
            head = head.next;
            start = start.next;
        }
        tail = head;

        while(head != null && num -- > 0) {
            ListNode temp = start.next;
            start.next = head;
            head = head.next;
            start.next.next = temp;
        }
        if(tail != head)
            tail.next = head;

        return dummy.next;

    }
}
