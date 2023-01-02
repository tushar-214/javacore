package exception;

public class Exception3
{
    public static void main(String[] args) {
        try
        {
            String name=null;
            System.out.println(name.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("always execute db close");
        }
        System.out.println("rest of the code");
    }
}
