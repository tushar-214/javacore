package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1
{
    public static void main(String[] args) {
        System.out.println("ArrayList Demo");
        ArrayList ar =new ArrayList();

        ar.add(10);
        ar.add(10);
        ar.add(20);
        ar.add(2);
        ar.add(90);

        System.out.println(ar);
        Collections.sort(ar);
        System.out.println("sorted Array");
        System.out.println(ar);
    }
}
