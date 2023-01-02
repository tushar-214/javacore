package classComponents;

public class Static11
{
    static class s1
    {
        int a=100;
        static int b=10;
    }

    public static void main(String[] args) {
        System.out.println(s1.b);
        Static11 ref=new Static11();
        s1 ref1=new s1();

        System.out.println(ref1.a);

        System.out.println();
    }
}
