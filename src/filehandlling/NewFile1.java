package filehandlling;

import java.io.File;
import java.io.IOException;

public class NewFile1
{
    public static void main(String[] args) throws IOException {

        File file=new File("tushar.txt");
        boolean result=file.createNewFile();

           if(result==true)
           {
               System.out.println("file is created now");
           }
           else
           {
               System.out.println("file is created already ");
           }



    }
}
