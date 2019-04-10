package com.first.collection;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriortyQueue {

    public static void main(String[] args) {
        Queue<ComparablePersion> pq = new PriorityQueue<>();
        pq.add(new ComparablePersion(1, "Oracle"));
        pq.add(new ComparablePersion(2, "Oracle"));
        pq.add(new ComparablePersion(3, "Oracle"));
        pq.add(new ComparablePersion(4, "Oracle"));
        pq.add(new ComparablePersion(5, "Oracle"));
        pq.add(new ComparablePersion(6, "CSS"));
        pq.offer(new ComparablePersion(7, "Java"));

        System.out.println("pq = " + pq);

//        while (pq.peek() != null) {
//            System.out.println("Haad Element: " + pq.peek()); // 获取但不移除此队列的头；如果此队列为空，则返回 null。
//            pq.remove();
//            System.out.println("pq = " + pq);
//        }
        System.out.println("=====================================");

        System.out.println("toArray" + Arrays.toString(pq.toArray()));

        System.out.println("=====================================");
        while(pq.peek() != null) {
            System.out.println("Haad Element: " + pq.poll()); // 获取并移除此队列的头，如果此队列为空，则返回 null。
            System.out.println("pq = " + pq);
        }
    }
}
