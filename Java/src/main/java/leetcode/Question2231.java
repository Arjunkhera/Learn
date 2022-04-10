package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question2231 {
    public int largestInteger(int num) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Boolean> pos = new ArrayList<>();

        int original = num, val;
        while (num > 0) {
            val = num % 10;
            num /= 10;

            if (val % 2 == 0) {
                even.add(val);
                pos.add(true);
            } else {
                odd.add(val);
                pos.add(false);
            }
        }

        Collections.sort(odd);
        Collections.reverse(odd);
        Collections.sort(even);
        Collections.reverse(even);

        int oddIndex = 0, evenIndex = 0, res = 0;
        for (int i = pos.size() - 1; i >= 0; i--) {
            if (pos.get(i)) {
                res = 10 * res + even.get(evenIndex++);
            } else {
                res = 10 * res + odd.get(oddIndex++);
            }
        }

        return res;
    }
}
