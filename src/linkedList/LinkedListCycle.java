package linkedList;

/**
 * no.141
 * Created by Ruby on 2015/11/12 12:14.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fp = head, lp = head;

        while(fp != null && fp.next != null) {
            lp = lp.next;
            fp = fp.next.next;
            if(lp == fp)
                return true;
        }
        return false;
    }
}
