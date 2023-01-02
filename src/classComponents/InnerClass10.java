package classComponents;

public class InnerClass10
{
    class C1 {
        int num=10;
        static int n=20;

}

    public static void main(String[] args)
    {
        InnerClass10 ref= new InnerClass10();

        InnerClass10.C1 c1=ref.new C1();

        System.out.println(c1.num);
        System.out.println(C1.n);
    }
}
