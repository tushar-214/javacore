package ArrayPrograms;

public class reverse9
{
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60};
        for (int left=0,right=a.length-1;left<right;left++,right--)
        {
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ "  ");
        }
    }
}
