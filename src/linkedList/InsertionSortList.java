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

            if(sortedStart.val >= cur.val) {
                sortedEnd.next = cur.next;
                cur.next = sortedStart;
                sortedStart = cur;
                cur = sortedEnd.next;

                continue;
            }

            ListNode posToInsert = sortedStart;

            while(cur.val >= posToInsert.next.val && posToInsert != cur) {
                posToInsert = posToInsert.next;
            }

            if(posToInsert == cur){
                sortedEnd = cur;
            } else{
                sortedEnd.next = cur.next;
                cur.next = posToInsert.next;
                posToInsert.next = cur;
            }
            cur = sortedEnd.next;
        }

        return sortedStart;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);

        InsertionSortList test = new InsertionSortList();

        ListNode sorted = test.insertionSortList(head);

        while(sorted != null) {
            System.out.print(sorted.val);
            sorted = sorted.next;
        }
    }

}
