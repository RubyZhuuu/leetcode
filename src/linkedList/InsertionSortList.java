package linkedList;

/**
 * Created by Ruby on 2015/10/14 17:08.
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode cur = head;
        ListNode sortedStart = head;
        ListNode sortedEnd = head;

        while(cur != null) {
            if(cur.val >= sortedEnd.val) {
                sortedEnd = cur;
                cur = cur.next;
                continue;
            }

            ListNode posToInsert = sortedStart;
            while(posToInsert != sortedEnd && cur.val >= posToInsert.val) {
                posToInsert = posToInsert.next;
            }

            sortedEnd.next = cur.next;
            cur.next = sortedStart;
            sortedStart = cur;

            cur = sortedEnd.next;
        }

        return sortedStart;
    }
}
