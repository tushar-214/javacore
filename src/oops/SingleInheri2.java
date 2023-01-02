package oops;
class Si
{
    int a=10;
    int b=0;
    void m2()
    {
        System.out.println("m2 from parrent");
    }
    void m1()
    {
        System.out.println("m1 from parrent");
    }
}
public class SingleInheri2 extends Si
{
    int a=100;
    void m1()
    {
        super.m1();
        System.out.println("m1 child method");
    }
    public static void main(String[] args)
    {
        System.out.println("Sigle inheritance Demo ");
        // one class extendes to another class using extends keyword
        SingleInheri2 ref=new SingleInheri2();
        System.out.println(ref.a);
        System.out.println(ref.b);
        ref.m1();
        ref.m2();

    }
}
