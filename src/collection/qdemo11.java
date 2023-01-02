package collection;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class qdemo11
{
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();

        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(60);
        pq.add(80);
        pq.add(80);


        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.contains(10));
        System.out.println(pq.poll());
        System.out.println(pq.size());


    }
}
