package ObjectClass;

public class A1
{
    public static void main(String[] args) throws CloneNotSupportedException {
        A1 ref=new A1();
        A1 ref1=new A1();

       A1 a=ref;//store the address in a varable return type is A1

        System.out.println(ref.getClass().getName());

        System.out.println(ref.hashCode());

        System.out.println(ref1.hashCode());

        System.out.println(ref.equals(a));// equal is true address chaeck

        System.out.println(ref.toString());


        System.out.println(ref.clone());
    }
}
