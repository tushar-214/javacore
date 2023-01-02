package filehandlling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile3
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("tushar.txt");
        System.out.println(file.isFile());
        FileInputStream fileInputStream=new FileInputStream(file);
         int i;
        while((i=fileInputStream.read()) > 0)
        {
            System.out.print((char)i);
        }

    }
}
