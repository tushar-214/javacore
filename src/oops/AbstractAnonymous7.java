package oops;
abstract class AC1
{
    abstract  void m1();
    void m2()
    {
        System.out.println("m2 normal method");
    }
    AC1()
    {
        System.out.println("this is constructor");

    }
}

public class AbstractAnonymous7
{
    public static void main(String[] args)
    {
        AC1 ref=new AC1()
        {
            @Override
            void m1() {
                System.out.println("Abstract method ovveriiden using anonymous class way");

            }
        };
        ref.m1();
        ref.m2();
    }
}
