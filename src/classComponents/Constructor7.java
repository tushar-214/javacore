package classComponents;

public class Constructor7
{
    // constructor is same name having class name it is special type of method
    // it class level components
    //automaticaally called when objet is create
    // it has no return type as well as no modifer
    // when developer not  pass any constructor that time java compiler pass default ci=onstructor
    // it is used intilize the instace variables only
    int num;
    Constructor7()
    {
        System.out.println("this is zero param constructor ");
    }
    Constructor7(int num)
    {
        this();
        this.num=num;

        System.out.println("value of num "+ num);

        System.out.println("this is parametrised constructor");
    }
    public static void main(String[] args)
    {
        Constructor7 ref=new Constructor7(10);

    }
}
