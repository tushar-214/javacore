package ArrayPrograms;

public class Fibonacci15
{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        System.out.print(a+ "  "+ b+ "  ");
        for (int i=2;i<=5;i++)
        {
            c=a+b;
            System.out.print(c+"  ");
            a=b;
            b=c;
        }
    }
}
