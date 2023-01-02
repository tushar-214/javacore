package ArrayPrograms;

import java.util.Scanner;

public class InsertArray10
{
    public static void main(String[] args) {
        System.out.println("enter the size ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("-------------------------");
        int []a=new int[size];
        System.out.println("Enter the elements ");
        for (int i=0;i<a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println("\n insert the elements");
        for (int i=a.length-1;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
