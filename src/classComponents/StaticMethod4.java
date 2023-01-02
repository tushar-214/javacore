package classComponents;

public class StaticMethod4
{
    static void m3()
    {
        System.out.println("this static method");
    }
    public static void main(String[] args)
    {
        System.out.println("static methiod demo");

        // we can craete static method with the help of static keyword
        // class loading time get memory only once
        // called with help of class name
        // this method comman for all object

        m3();//called the methos bydefault main method is static so not need to write class name

    }
}
