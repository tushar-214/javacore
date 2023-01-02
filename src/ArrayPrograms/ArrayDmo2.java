package ArrayPrograms;

import java.util.Scanner;

public class ArrayDmo2
{
    public static void main(String[] args)
    {
        System.out.println("Eneter the size ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int []a=new int[size];
        System.out.println("Enter the array :");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();

        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
