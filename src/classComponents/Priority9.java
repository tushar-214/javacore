package classComponents;

public class Priority9
{
    Priority9()
    {
        System.out.println("constructor");
    }
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    public static void main(String[] args) {

        Priority9 obj=new Priority9();

    }
}
