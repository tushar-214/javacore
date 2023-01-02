package ArrayPrograms;

public class AlternatePrintArray13
{
    public static void main(String[] args) {
        int [] a={10,20,30,50,60,70,90};
        System.out.println("print alternate elements");
     for (int i=0;i<a.length;i=i+2)
     {
         System.out.print(a[i]+ "  ");

     }
    }
}
