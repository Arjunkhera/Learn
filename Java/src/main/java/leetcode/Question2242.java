package leetcode;

import java.util.PriorityQueue;

public class Question2242 {
    public int maximumScore(int[] scores, int[][] edges) {
        int n = scores.length, res = -1;
        PriorityQueue<Integer>[] graph = new PriorityQueue[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new PriorityQueue<>((x, y) -> scores[x] - scores[y]);
        }

        // Store maximum three neighbors
        for(int[] edge : edges) {
            graph[edge[0]].offer(edge[1]);
            if(graph[edge[0]].size() > 3) {
                graph[edge[0]].poll();
            }

            graph[edge[1]].offer(edge[0]);
            if(graph[edge[1]].size() > 3) {
                graph[edge[1]].poll();
            }
        }

        for(int[] edge : edges) {
            for(int a : graph[edge[0]]) {
                for(int b : graph[edge[1]]) {
                    if(a != edge[1] && a != b && b != edge[0]) {
                        res = Math.max(res, scores[a] + scores[b] + scores[edge[0]] + scores[edge[1]]);
                    }
                }
            }

        }

        return res;
    }
}
