package ArrayPrograms;

public class ArrayMinDemo4
{
    public static void main(String[] args) {
        int []a ={10,20,30,40,50,60,6};
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("minimum value of array is =  "+min );

    }
}
