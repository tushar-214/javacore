package filehandlling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferreaderDemo4
{
    public static void main(String[] args) throws IOException {
        System.out.println("read file ");
        File file =new File("tushar.txt");
        FileReader fileReader=new FileReader(file);
        int i;
        while ((i=fileReader.read()) > 0)
        {
            System.out.print((char)i);
        }
    }
}
