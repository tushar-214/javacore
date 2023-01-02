package oops;

interface i22
{
    void m2();
}
interface i12 extends i22
{
    void m1();

}
public class Interface10
{
    public static void main(String[] args)
    {
        i12 ref=new i12() {
            @Override
            public void m1() {
                System.out.println("m1 overriden method");
            }
            public void m2()
            {
                System.out.println("m2 overriden method ");
            }
        };
        ref.m1();
        ref.m2();

    }
}
