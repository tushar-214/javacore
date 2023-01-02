package exception;

public class Exception4
{
    public static void main(String[] args) {
        try
        {
            int []a={10,20,30,40};
            System.out.println(a[6]);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("close connection");
        }
        System.out.println("rest of the code ");
    }
}
