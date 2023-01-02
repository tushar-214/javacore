package basics;

import java.util.Scanner;

public class CheckAlphabet6
{
    public static void main(String[] args) {
        System.out.println("check character alphabet or not");

      char ch='A';
        if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z') )
        {
            System.out.println("it is alphabet");
        }
        else
        {
            System.out.println("it is not alphabet");
        }
    }
}
