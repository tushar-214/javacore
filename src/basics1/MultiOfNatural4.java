package basics1;

public class MultiOfNatural4
{
    public static void main(String[] args) {
        int num=123;
        int rem,sum=1;
        while (num!=0) {
            rem=num%10;
            sum=sum*rem;
            num=num/10;
        }
        System.out.println("total number of multiplication = "+ sum);

    }
}
