package bytedemo;

import java.io.*;

public class ByteDemo 
{
    public static void main(String[] args) throws Exception
    {
        
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        
        CharArrayReader cr=new CharArrayReader(c);
        
        int x;
        
        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);
            
        }
        
        cr.close();
        
    }
}