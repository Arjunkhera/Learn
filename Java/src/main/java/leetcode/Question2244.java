package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Question2244 {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Long> store = new HashMap<>();
        for(int task : tasks) {
            store.put(task, store.getOrDefault(task, 0l) + 1);
        }

        long total = 0;
        for(Long value : store.values()) {
            if(value % 3 == 0) {
                total += value/3;
            } else if(value % 3 == 2) {
                total += value/3 + 1;
            } else if(value > 1) {
                total += value/3 + 1;
            } else {
                return -1;
            }
        }

        return (int) total;
    }
}
