package linkedList;

/**
 * Created by ruby on 2015/11/25.
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fast, slow;
        slow = head;
        fast = head;

        while(fast != null) {
            while(fast != null && fast.val == slow.val)
                fast = fast.next;
            slow.next = fast;
            slow = slow.next;
        }

        return head;
    }
}
