package exception;

public class Exception1
{
    public static void main(String[] args) {
        System.out.println(10/0);// default exception handler print the exception details and terminate the program abnormally
        System.out.println("hello rest of the code");
    }
}
