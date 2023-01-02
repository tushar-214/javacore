package filehandlling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BreaderDemo5
{
    public static void main(String[] args) throws IOException {
        File file=new File("tushar.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bf=new BufferedReader(fileReader);
        int i;
        while ((i=bf.read()) > 0)
        {
            System.out.print((char)i);
        }
    }
}
