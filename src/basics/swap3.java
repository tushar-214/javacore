package basics;

import java.util.Scanner;

public class swap3
{
    public static void main(String[] args) {
        System.out.println("swap two number ");
        int a=10;
        int b=20;
        int temp;

        System.out.println("before swapping values is A = "+ a +" B =  "+ b );
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping values is A = "+ a +" B =  "+ b );



    }
}
