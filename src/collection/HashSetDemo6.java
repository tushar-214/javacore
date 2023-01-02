package collection;

import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo6
{
    public static void main(String[] args) {
        HashSet<Integer> ref=new HashSet<>();

        ref.add(10);
        ref.add(20);
        ref.add(8);
        ref.add(1);
        ref.add(100);
        ref.add(1);

        System.out.println(ref);
    }
}
