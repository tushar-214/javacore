package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayListDemo2
{
    public static void main(String[] args)
    {
        ArrayList<String> ref=new ArrayList<>();
        System.out.println("Enter the how many : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Add the values : ");
        for (int i=0;i<size;i++)
        {
            String name=sc.nextLine();
            ref.add(name);
        }
        Collections.sort(ref);
        System.out.println(ref);
    }
}
