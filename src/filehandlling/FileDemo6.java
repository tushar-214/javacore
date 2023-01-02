package filehandlling;

import java.io.File;
import java.io.IOException;

public class FileDemo6
{
    public static void main(String[] args) throws IOException {
        File file=new File("abc.txt");
      boolean result=file.createNewFile();
      if(result==true) {
          System.out.println("file is created");
      }
      else {
          System.out.println("is allready present");
      }
        System.out.println("file is deleted   "+file.delete());
    }
}
