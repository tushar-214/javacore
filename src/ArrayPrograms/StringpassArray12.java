package ArrayPrograms;

import java.util.Scanner;

public class StringpassArray12
{
    public static void main(String[] args) {
        int[] ch=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the name 5");

            for (int i=0;i< ch.length;i++)
            {
                ch[i]=sc.nextInt();
            }
        System.out.println("--------------------");
            for (int i=0;i<ch.length;i++)
            {
                System.out.print((char)ch[i]+" ");
            }

    }
}
