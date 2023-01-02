package StringHan;

public class StringCompare2
{
    public static void main(String[] args) {
        String s="tushar";
        String s2="TUSHAR";

        String str1=s.toLowerCase();
        String str2=s2.toLowerCase();
        if (str1==str2)
        {
            System.out.println("both string are Equal");
        }
        else {
            System.out.println("both string are not Equal");
        }

    }
}
