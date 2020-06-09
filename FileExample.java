package fileexample;

import java.io.*;

public class FileExample 
{
    public static void main(String[] args) throws Exception
    {
        
       //create a file Test.txt using notepad and write something in the file
     try (FileReader fr = new FileReader("Test.txt")) 
     {
         int x;
         
         
         while((x=fr.read())!=-1)
         {
              System.out.print((char)x);
         }
      
     }   
    }
}
