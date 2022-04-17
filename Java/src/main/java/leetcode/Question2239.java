package leetcode;

public class Question2239 {
    public int findClosestNumber(int[] nums) {
        int res = Integer.MAX_VALUE;

        for(int val : nums) {
            if(Math.abs(val) < Math.abs(res)) {
                res = val;
            } else if (Math.abs(val) == Math.abs(res)) {
                res = Math.max(res, val);
            }
        }

        return res;
    }
}
