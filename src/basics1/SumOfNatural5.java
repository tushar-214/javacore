package basics1;

public class SumOfNatural5
{
    public static void main(String[] args) {
        int num=123;
        int rem,sum=0;
        while (num!=0) {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("total number of sum= "+ sum);

    }
}
