package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question347 {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for(int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        Map<Integer, List<Integer>> inverted = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), key -> new ArrayList<>()).add(entry.getKey());
        }

        for(int i = n; i > 0 && res.size() < k; i--) {
            if(inverted.containsKey(i)) {
                res.addAll(inverted.get(i));
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
