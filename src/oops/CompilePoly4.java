package oops;
class Compile
{
    void m1()
    {
        System.out.println("method overloading");
    }
    void m1(int a)
    {
        System.out.println("method overloading a = "+ a);
    }
    // same name having differnt signature not considerd return type is called method overloading
    //same class as well as child parent
    // compile time know which method will be called

}
public class CompilePoly4 extends Compile
{
    void m1(int a ,int b)
    {
        System.out.println("method overloading a= "+a+ " b= "+b);
    }
    public static void main(String[] args)
    {
        CompilePoly4 ref=new CompilePoly4();

        ref.m1();
        ref.m1(10,30);
        ref.m1(90);

    }
}
