package ArrayPrograms;

public class ArrayDemo3
{
    public static void main(String[] args) {
        int []a ={10,20,30,40,50,60};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("maximum value of array is =  "+max );

    }
}
