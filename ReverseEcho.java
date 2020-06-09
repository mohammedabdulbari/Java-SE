package reverseecho;

import java.net.*;
import java.io.*;

public class ReverseEcho extends Thread
{
    Socket stk;
    
    public ReverseEcho(Socket st)
    {
        stk=st;
    }
    public void run()
    {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        do
        {
            msg=br.readLine();
            
            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
            
            ps.println(msg);
            
        }while(!msg.equals("dne"));
        
        stk.close();
        }catch(Exception e){}
        
    }
            
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(2000);
        int count=1;
        Socket stk;
        ReverseEcho re;
        do
        {
        stk=ss.accept();
        System.out.println("Client Connected :"+count++);
        re=new ReverseEcho(stk);
        re.start();
        
        }while(true);
        
    }    
}


class Client 
{
    public static void main(String[] args) throws Exception
    {
        Socket stk=new Socket("192.168.0.103",2000);
        
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        
        do
        {
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server"+msg);
            
        }while(!msg.equals("dne"));
        stk.close();
    }    
}

