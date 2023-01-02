package collection;

import java.util.TreeMap;

public class TreeMap14
{
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put(1,"tushar");
        tm.put(4,"vishal");
        tm.put(5,"rushi");
        tm.put(5,null);
        tm.put(1,"tushar");
        System.out.println(tm);
    }
}
