package linkedList;

/**
 * no 203
 * Created by Ruby on 2016/1/6 17:24.
 * Remove all elements from a linked list of integers that have value val.
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode l1 = dummy, l2 = head;

        while(l2 != null) {
            if(l2.val == val) {
                l1.next = l2.next;
                l2 = l2.next;
                continue;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        return dummy.next;

    }
}
