package collection;

import java.util.HashSet;

public class HashSetDemo7
{
    public static void main(String[] args) {


        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("tushar");
        hs.add("tushar");
        hs.add(null);
        hs.add(12);
        hs.add(12);
        hs.add(null);

        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        System.out.println(hs.remove(12));
        System.out.println(hs.contains(null));

    }
}
