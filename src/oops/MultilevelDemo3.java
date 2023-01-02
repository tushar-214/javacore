package oops;
class A
{
    int a=10;
    void m1()
    {
        System.out.println("A class method");
    }
    void m2()
    {
        System.out.println("M2 from A");
    }

}
class B extends A
{
    int a=100;
    void m1()
    {
        System.out.println("B class method");
    }

}
class C extends B
{
    int a=1000;
    int b=2000;
    void m1()
    {
        super.m1();
        System.out.println("C class method");
    }
}
public class MultilevelDemo3 extends C
{
    public static void main(String[] args) {
        {
            System.out.println("multilevel Inheritance : ");
            A ref=new C();
            System.out.println(ref.a);
            ref.m1();
            ref.m2();
           // System.out.println(ref.b);
        }
    }
}
