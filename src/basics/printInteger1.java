package basics;

import java.util.Scanner;

public class printInteger1
{
    public static void main(String[] args) {
        System.out.println("Enter the number  and name from user ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A=  ");
        int a=sc.nextInt();

        System.out.println("Enter the B  = ") ;
       int b =sc.nextInt();
        System.out.println("----------------------");
        System.out.println(a);
        System.out.println(b);

    }
}
