package algorithms.linkedlist;

import leetcode.util.ListNode;
import leetcode.util.Util;

public class KthNode {
    public static void main(String[] args) {

        ListNode head = Util.makeListFromArray(new int[]{1,2,3,4,5, 6});
        ListNode fourthNodeFromStart = getKthNodeFromStart(head, 4);
        System.out.printf("Fourth Node from start is %d \n", fourthNodeFromStart.val);
        ListNode sixthNodeFromEnd = getKthNodeFromEnd(head, 6);
        System.out.printf("Sixth Node from end is %d \n", sixthNodeFromEnd.val);
    }

    public static ListNode getKthNodeFromStart(ListNode head, int k) {
        int index = 0;
        while(head != null && index < k - 1) {
            head = head.next;
            index++;
        }

        return head;
    }

    public static ListNode getKthNodeFromEnd(ListNode head, int k) {
        ListNode front = getKthNodeFromStart(head, k);
        ListNode back = new ListNode(0, head);

        while(front != null) {
            front = front.next;
            back = back.next;
        }

        return back;
    }
}
