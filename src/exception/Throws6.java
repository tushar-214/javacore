package exception;

public class Throws6
{
    void m1() throws Exception
    {
        System.out.println("m1");
        m2();
    }
    void m2()throws Exception
    {
        System.out.println("m2 method");
    }

    public static void main(String[] args) throws Exception{

        System.out.println("hello tushar");
        Throws6 ref=new Throws6();
        ref.m1();
    }
}
