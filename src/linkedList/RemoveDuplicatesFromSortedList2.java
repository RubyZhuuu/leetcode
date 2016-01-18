package linkedList;

/**
 * 82. Remove Duplicates from Sorted List II
 * Created by Ruby on 2016/1/18 14:25.
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 */
public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null)
//            return head;

        ListNode dummy = new ListNode(0), checked, cur;
        dummy.next = head;
        checked = dummy;
        cur = head;

        while(cur != null) {
            while(cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            //key step
            if(checked.next == cur) {
                checked = checked.next;
            } else {
                checked.next = cur.next;
            }

            cur = cur.next;
        }

        return dummy.next;
    }
}
