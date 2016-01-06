package linkedList;

/**
 * Created by Ruby on 2016/1/5 17:22.
 */
public class SwapParis {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        dummy.next = head;
        ListNode temp;

        while(head != null && head.next != null) {
            temp = head.next.next;
            cur.next = head.next;
            cur.next.next = head;
            head.next = temp;
            cur = head;
            head = cur.next;
        }

        return dummy.next;
    }

    public ListNode swapPairs2(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode temp = head.next;

        head.next = swapPairs(head.next.next);
        temp.next = head;

        return temp;
    }
}
