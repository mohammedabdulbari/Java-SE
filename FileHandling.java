package filehandling;
import java.io.*;

public class FileHandling 
{
    public static void main(String[] args) throws Exception
    {
        // select path of any directory on you computer
       File f=new File("C:\\MyJava");
       
       System.out.println(f.isDirectory());
       File list[]=f.listFiles();
        
       FileOutputStream fos =new FileOutputStream("C:\\MyJava\\Data.txt");
       for(File x:list)
       {
           System.out.println(x.getParent()+" "+x.getName());
       }
      
    }
}
