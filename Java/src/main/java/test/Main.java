package test;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        String test = "test+test2";
        String[] arr = test.split("\\+");
        for(String str : arr)
            System.out.println(str);

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.offer(1);
        heap.offer(2);
        heap.offer(3);
        heap.offer(4);

        for(int i : heap) {
            System.out.println(i);
        }
    }
}
