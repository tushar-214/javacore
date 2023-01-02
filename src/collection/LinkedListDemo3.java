package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo3
{
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.add(10);
        ls.add(null);
        ls.add("tushar");
        ls.add(30);
        ls.add(90);
        System.out.println(ls);
        System.out.println(ls.set(2,100));
        System.out.println(ls);
        System.out.println("size of the list = "+ls.size());
        System.out.println("get object = "+ls.get(3));
        System.out.println("check object is present or not = "+ ls.contains(10));
        System.out.println("which is next elements ="+ls.peek());
        System.out.println("remove object fromlist = "+ ls.remove());
        System.out.println(ls);

    }
}
