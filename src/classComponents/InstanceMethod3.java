package classComponents;

public class InstanceMethod3
{
    void m1()
    {
        System.out.println("hello");
    }
    // instance method
    public static void main(String[] args)
    {
      //instance variable is class level method and it is block of code inside the curly barcket
      // might some input or return some output
      //  when call the method then get the memory
      // instanvce method called with thw help of reference varible
      // we want create objvcet of  this class
        System.out.println("instance method demo");
        InstanceMethod3 ref=new InstanceMethod3();

        ref.m1();//called the method


    }
}
