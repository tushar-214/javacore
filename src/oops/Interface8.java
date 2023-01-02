package oops;
interface I1
{
    void m1();
    void m2();
}
public class Interface8 implements I1
{
    public void m1()
    {
        System.out.println("m1 method is overriden implementation is here in child class ");

    }
   public void m2()
    {

        System.out.println("m2 method is overriden implementation is here in child class ");
    }
    public static void main(String[] args)
    {
        Interface8 ref=new Interface8();
        ref.m1();
        ref.m2();

    }
}
