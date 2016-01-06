package linkedList;

/**
 * no 86
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * For example,
 Given 1->4->3->2->5->2 and x = 3,
 return 1->2->2->4->3->5.
 * Created by Ruby on 2016/1/6 11:29.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode l1 = dummy;
        ListNode l2 = dummy;

        while(l2.next != null) {
            if(l2.next.val < x) {
                if(l1 == l2) {
                    l1 = l1.next;
                    l2 = l2.next;
                } else {
                    ListNode cur = l2.next;
                    ListNode t1 = cur.next;
                    ListNode t2 = l1.next;
                    l1.next = cur;
                    cur.next = t2;
                    l2.next = t1;
                    l1 = l1.next;
                }
            } else {
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
    //用两个队列a b，a存小于x的节点，b存大于等于x的节点
    //最后把a的尾部节点指向b的头部节点
    public ListNode partition2(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0); //存储小于x
        ListNode dummy2 = new ListNode(0); //存储大于等于x
        ListNode tail1 = dummy1;
        ListNode tail2 = dummy2;

        while(head != null) {
            if(head.val < x) {
                tail1.next = head;
                tail1 = head;
            } else {
                tail2.next = head;
                tail2 = head;
            }
            head = head.next;
        }
        tail2.next = null;
        tail1.next = dummy2.next;

        return dummy1.next;
    }
}
