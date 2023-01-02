package basics;

public class TypeCasting9
{
    public static void main(String[] args) {
        int num=10;
        System.out.println("convert into byte Explicite typecasting ");
        byte num1=(byte)num;
        System.out.println("int to byte value num1 = "+num1);

        System.out.println("-------------------------");
        System.out.println("impicite typecasting");
        short a=10;
        long b=a;
        System.out.println("short in to long smaller to  bigger = "+b);

    }
}
