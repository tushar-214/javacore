package basics;

public class Pallindrome12
{
    public static void main(String[] args) {
        int num=1221;
        int rem,sum=0;
        int temp=num;
        while (num!=0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("given number is Pallindrome");
        }
        else {
            System.out.println("given number is not  Pallindrome");
        }
    }
}
