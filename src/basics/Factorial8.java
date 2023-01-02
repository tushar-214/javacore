package basics;

public class Factorial8
{
    public static void main(String[] args) {
        System.out.println("factorial num");
        int num=5;
        int fact=1;

        while (num>0)
        {
           fact=fact*num;
           num--;
        }
        System.out.println("factorial sum = "+fact);
    }
}
