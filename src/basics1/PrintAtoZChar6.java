package basics1;

public class PrintAtoZChar6
{
    public static void main(String[] args) {
        System.out.println("AtoZ");
        char ch='A';
        for (int i=1;i<=26;i++) {
            System.out.println(ch + " ");
            ch++;
        }
    }
}
