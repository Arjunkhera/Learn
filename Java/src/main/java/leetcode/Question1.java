package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        int[] answer1 = twoSum(new int[]{1,2,3,14,5}, 7);
        System.out.println(Arrays.toString(answer1));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();


        for(int i = 0; i < nums.length; i++) {
            if(store.containsKey(target - nums[i])) {
                return new int[]{store.get(target - nums[i]), i};
            }

            store.put(nums[i], i);
        }

        return new int[]{0, 0};
    }
}
