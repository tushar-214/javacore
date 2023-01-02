package exception;

public class NestedTry5
{
    public static void main(String[] args) {
        try
        {
            System.out.println(50/0);
            try{
                System.out.println(10/1);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception ocure");
        }
        finally {
            System.out.println("always excute");
        }
        System.out.println("rest of the code ");
    }
}
