package oops;
abstract class AC
{
  abstract void m1();
  void m2()
  {
      System.out.println("this is normal method ");

  }
  static void m3()

  {
      System.out.println("this is static method from m3");
  }
  int a=10;
  static  int b=100;
  AC()
  {
      System.out.println("this is constructor");
  }
}
public class AbstractClass6 extends AC
{
    public void m1()
    {
        System.out.println("override the abstract method in child class ");
    }
    public static void main(String[] args) {
        System.out.println("abstract class demo ");
        AbstractClass6 ref=new AbstractClass6();

        ref.m2();// call the instance method
        ref.m1();//call the abstarct method
        AC.m3();//call the static method

        System.out.println(ref.a);//instance variable from abstract class
        System.out.println(b);// static varible from abstract class

    }
}
