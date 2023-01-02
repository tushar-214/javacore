package collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQ12
{
    public static void main(String[] args) {
        Queue q=new LinkedList();

        q.add(10);
        q.add("tushar");
        q.add("rushi");
        q.add(100);
        q.add(1);
        q.add(1);
        q.add(null);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.contains(1));
    }
}
