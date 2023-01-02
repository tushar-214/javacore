package collection;

import java.util.HashMap;

public class map13
{
    public static void main(String[] args) {
        HashMap hm=new HashMap<>();

        hm.put(1,"tushar");
        hm.put(2,"tushar");
        hm.put(4,"rushi");
        hm.put(3,"ganesh");
        hm.put(5,"yogita");
        hm.put(6,"vaishnavi");
        hm.put(1,"abc");

        System.out.println(hm);
        System.out.println(hm.get(2));
        System.out.println(hm.entrySet());
        System.out.println(hm.remove(1));
        System.out.println(hm);
        System.out.println(hm.put(10,null));
        System.out.println(hm);
    }
}
