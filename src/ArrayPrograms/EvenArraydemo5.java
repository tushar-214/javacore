package ArrayPrograms;

public class EvenArraydemo5
{
    public static void main(String[] args) {
        int []a={1,9,46,60,50,40,12,7};
        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
