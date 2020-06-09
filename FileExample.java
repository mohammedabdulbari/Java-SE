package fileexample;

import java.io.*;

public class FileExample 
{
    public static void main(String[] args) throws Exception
    {
        
     try (FileReader fr = new FileReader("C:/MyJava/Test.txt")) 
     {
         int x;
         
         
         while((x=fr.read())!=-1)
         {
              System.out.print((char)x);
         }
      
     }   
    }
}
