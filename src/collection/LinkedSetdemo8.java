package collection;

import java.util.LinkedHashSet;

public class LinkedSetdemo8
{
    public static void main(String[] args) {
        LinkedHashSet ls=new LinkedHashSet();

        ls.add(10);
        ls.add(90);
        ls.add(20);
        ls.add(20);
        ls.add(45);
        ls.add(5);
        ls.add(9);

        System.out.println(ls);
        System.out.println(ls.contains(9));
        System.out.println(ls.size());
        System.out.println(ls.isEmpty());
        System.out.println(ls.remove(10));
    }
}
