package basics;

public class Armstrong15
{
    public static void main(String[] args) {
        int num=153;
        int rem,sum=0;
        int temp=num;
        while (num!=0)
        {
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("given number is Armstrong");
        }
        else {
            System.out.println("given number is not  Armsrong");
        }
    }
}
