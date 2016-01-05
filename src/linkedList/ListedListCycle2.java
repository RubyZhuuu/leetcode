package linkedList;

/**
 * Created by Ruby on 2015/11/2 16:21.
 *
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * Note: Do not modify the linked list.
 */
public class ListedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        //use two pointer fp, sp.fp move 2 steps each time, while sp move 1 step each time.
        ListNode fp = head, sp = head;

        while(fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp) break;
        }

        if(fp == null || fp.next == null)
            return null;

        /*
         move one pointer to head,
         anther pointer stay at the position they first meet, and both of them move 1 step each time,
         the next position they meet is where the cycle start.
         */
        fp = head;
        while(fp != sp) {
            fp = fp.next;
            sp = sp.next;
        }

        return sp;
    }
}
