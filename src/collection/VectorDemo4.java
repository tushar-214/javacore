package collection;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo4
{
    public static void main(String[] args) {
        Vector<Integer> vc=new Vector<>();
        System.out.println("enter size");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the data : ");
        for (int i=0;i<a;i++)
        {
            int data=sc.nextInt();
            vc.add(data);
        }
        System.out.println("print data ");
        System.out.println(vc);
        Collections.sort(vc);

        System.out.println(vc);
    }
}
