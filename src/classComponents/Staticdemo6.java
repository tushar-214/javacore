package classComponents;

public class Staticdemo6
{
    static String m4(String name)
    {
        return name;
    }
    public static void main(String[] args)
    {
        System.out.println("static method demo");
        //call the method
        System.out.println("value =  "+m4("tushar"));
    }
}
