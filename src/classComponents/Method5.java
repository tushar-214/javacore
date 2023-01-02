package classComponents;

public class Method5
{
    int m1(int num1,int num2)
    {
        return (num1+num1); // use reture transfer statement
        // control direvt transfer from one method two another method
    }
    public static void main(String[] args) {
        System.out.println("demo instance methods ");
        Method5 obj=new Method5();
        System.out.println("sum = "+obj.m1(100,200));

    }
}
