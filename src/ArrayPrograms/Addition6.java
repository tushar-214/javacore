package ArrayPrograms;

public class Addition6
{
    public static void main(String[] args) {
        int [] a={1,20,30,36,12,10};
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("total = "+ sum);
    }
}
