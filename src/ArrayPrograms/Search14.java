package ArrayPrograms;

public class Search14
{
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60,70,80};
        int key =7;
        boolean flag=false;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                flag=true;
            }
        }
        System.out.println(flag);
    }
}
