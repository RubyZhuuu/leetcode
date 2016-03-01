package linkedList;

/**
 * 328. Odd Even Linked List
 * Created by ruby on 2016/3/1.
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

 You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

 Example:
 Given 1->2->3->4->5->NULL,
 return 1->3->5->2->4->NULL.
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead = new ListNode(0);
        ListNode ep = evenHead;
        ListNode cur = head;

        while(cur != null && cur.next != null) {
            ep.next = cur.next;
            cur.next = cur.next.next;
            if(cur.next != null)
                cur = cur.next;

            ep = ep.next;
        }

        ep.next = null;

        if(evenHead.next != null)
            cur.next = evenHead.next;

        return head;

    }
}
