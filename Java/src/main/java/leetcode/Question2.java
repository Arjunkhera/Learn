package leetcode;

import leetcode.util.ListNode;
import leetcode.util.Util;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        ListNode first = Util.makeListFromArray(new int[]{9,9,9,9,9,9,9});
        ListNode second = Util.makeListFromArray(new int[]{9,9,9,9});
        ListNode result = addTwoNumbers(first, second);
        int[] output = Util.makeArrayFromList(result);
        System.out.println(Arrays.toString(output));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1, second = l2, dummy = new ListNode(), current = dummy;
        int carry = 0, sum = 0;

        while(first != null || second != null) {
            int valueFirst = first == null ? 0 : first.val;
            int valueSecond = second == null ? 0 : second.val;

            sum = carry + valueFirst + valueSecond;
            carry = sum / 10;
            sum = sum % 10;

            ListNode node = new ListNode(sum);
            current.next = node;
            current = node;

            if(first != null) {
                first = first.next;
            }

            if(second != null) {
                second = second.next;
            }
        }

        if(carry != 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
