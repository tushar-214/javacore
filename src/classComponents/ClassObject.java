package classComponents;

public class ClassObject
{
    int num=10;

    // this is class object specific data
    public static void main(String[] args) {
        System.out.println("Example of Class object ");
        // create object but we want first class creating object
        ClassObject obj=new ClassObject();
        System.out.println("value of num =   " + obj.num);
    }
}
