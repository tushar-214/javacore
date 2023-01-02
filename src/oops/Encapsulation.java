package oops;
class  Ca
{
 private int a;
 private int b;

//set the value in private methods
    public void setA(int a)
    {
        this.a=a;
    }
    // getting value in main method
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b=b;
    }

}
public class Encapsulation
{

    public static void main(String[] args)
    {
        System.out.println("Exaample of Encapsulation");
        Ca ref=new Ca();
        //set the value using setter method to the private varible
        ref.setA(100);
        ref.setB(1000);
        // call the get value return get data
        System.out.println("Private value of A = "+ref.getA());
        System.out.println("Private value of B =  " + ref.getB());

    }
}
