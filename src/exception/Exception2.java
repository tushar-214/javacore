package exception;

public class Exception2
{
    public static void main(String[] args) {
        try{
            int n=10;
            System.out.println(n/0);
            System.out.println("hello ");

        }
        catch (Exception e)
        {
            System.out.println("Exception occure ");
        }
        System.out.println("rest of the code ");
    }
}
