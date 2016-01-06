package linkedList;

/**
 * no 21 Merge Two Sorted Lists
 * Created by Ruby on 2016/1/5 15:58.
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * Subscribe to see which companies asked this question
 */
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return l1 == null ? l2 : l1;

        ListNode p1 = l1;
        ListNode p2 = l2;

        if(l1.val > l2.val)
            p1 = l2;
        else
            p2 = l2;

        while(p1 != null && p2 != null) {
            if(p1.next != null && p1.next.val <= p2.val) {
                p1 = p1.next;
                continue;
            }

            ListNode t1 = p1.next;
            ListNode t2 = p2.next;
            p1.next = p2;
            p2.next = t1;
            p2 = t2;
            p1 = p1.next;
        }

        return l1.val <= l2.val ? l1 : l2;
    }


    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 != null)
            cur.next = l1;
        if(l2 != null)
            cur.next = l2;
        return dummy.next;

    }
}
