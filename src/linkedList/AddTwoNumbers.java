package linkedList;

/**
 * no 2
 * Created by Ruby on 2016/3/25 17:15.
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode dummy = prev;
        int sum = 0;

        while(l1 != null || l2 != null) {
            prev.next = l1 != null ? l1 : l2;
            sum /= 10;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            prev.next.val = sum % 10;
            prev = prev.next;
        }

        if(sum / 10 > 0) {
            prev.next = new ListNode(1);
        }

        return dummy.next;
    }
}
