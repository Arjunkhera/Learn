package leetcode.util;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static ListNode makeListFromArray(int[] input) {
        ListNode dummy = new ListNode(), current = dummy;
        for(int val : input) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static int[] makeArrayFromList(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] result = new int[list.size()];
        int index = 0;
        for(int val : list) {
            result[index++] = val;
        }

        return result;
    }
}
