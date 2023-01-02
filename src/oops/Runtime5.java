package oops;
class Run
{
    void m1()
    {
        System.out.println("method Run class overriden ");
    }
    //same name method,return type consider ,same parameter  is called method overrideing
    // we cant override satic ,final ,private method
    //done in parent child class
}
public class Runtime5 extends Run
{
    void m1()
    {
        System.out.println("m1 method ovverride child class ");
        super.m1();
    }

    public static void main(String[] args) {
        System.out.println("method overriding ");
        Runtime5 ref=new Runtime5();
        ref.m1();

    }
}
