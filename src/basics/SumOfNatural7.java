package basics;

public class SumOfNatural7
{
    public static void main(String[] args) {
        System.out.println("sum of natural number till");
        int num=5;
        int sum=0;
        for (int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum =" + sum);
    }
}
