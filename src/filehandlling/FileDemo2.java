package filehandlling;

import java.io.File;
import java.io.IOException;

public class FileDemo2
{
    public static void main(String[] args) throws IOException {
        File file=new File("tushar.txt");

        System.out.println("is file or not = " + file.isFile());
        System.out.println("can read  = "+file.canRead());
        System.out.println("name of file = "+ file.getName());
        System.out.println("path = "+file.getAbsoluteFile());
        System.out.println("length of file = "+file.length());



    }
}
