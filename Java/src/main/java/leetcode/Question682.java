package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question682 {
    public int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String str : ops) {
            if(str.equals("C")) {
                stack.poll();
            } else if(str.equals("D")) {
                int score = stack.peek();
                stack.push(score * 2);
            } else if(str.equals("+")) {
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);
            } else {
                Integer num = Integer.parseInt(str);
                stack.push(num);
            }
        }

        int res = 0;
        while(!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
