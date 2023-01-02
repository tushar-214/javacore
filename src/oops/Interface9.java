package oops;
interface I11
{
    void m1();
}
interface I2 extends I11{
    void m2();
}
public class Interface9 implements I11,I2
{
    public void m1()
    {
        System.out.println("m1 overriden from i1");
    }
    public void m2()
    {
        System.out.println("m2 overriden from i2");
    }
    public static void main(String[] args)
    {
        Interface9 ref=new Interface9();
        ref.m1();
        ref.m2();

    }
}
