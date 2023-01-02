package basics;

public class Reverseno14
{
    public static void main(String[] args) {
        int num=1234;
        int rem,sum=0;
        int temp=num;
        while (num!=0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }


            System.out.println(sum);
    }
}
