package collection;

import java.util.Collections;
import java.util.Stack;

public class StackDemo5
{
    public static void main(String[] args) {
        System.out.println("stack demo ");
        Stack<Integer> ref=new Stack<>();

        ref.add(10);
        ref.add(90);
        ref.add(1);
        ref.add(15);
        ref.add(6);
        ref.add(3);
        ref.add(100);

        System.out.println(ref);
        System.out.println("size = "+ ref.size());
        System.out.println("next element= "+ref.peek());
        System.out.println("check empty or not ="+ref.isEmpty());
        System.out.println("remove = "+ ref.pop());
        System.out.println("search = "+ref.contains(10));
        System.out.println("find first elemnts= "+ ref.firstElement());
        Collections.sort(ref);
        System.out.println("sort array = "+ref );




    }
}
