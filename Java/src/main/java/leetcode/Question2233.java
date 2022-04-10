package leetcode;

import java.util.PriorityQueue;

public class Question2233 {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int val : nums) {
            heap.offer(val);
        }

        for(int i = 0; i < k; i++) {
            heap.offer(heap.poll() + 1);
        }

        long res = 1, mod = 1000000007;
        for(int val : heap) {
            res *= val;
            res %= mod;
        }

        return (int) res;
    }
}
