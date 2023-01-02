package basics;

import java.util.Scanner;

public class NumbercheckPositive5
{
    public static void main(String[] args) {
        System.out.println("java program check even or odd");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("given number is positive ");

        }
        else if (num==0)
        {
            System.out.println("given number is neutral");
        }
        else
        {
            System.out.println("given number is negative");
        }
    }

}
