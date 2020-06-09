package buffereddemo;
import java.io.*;

public class BufferedDemo 
{
    public static void main(String[] args)throws Exception 
    {
        FileReader fis=new FileReader("C:/MyJava/Test.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("String "+bis.readLine());
        
        
    }    
}
