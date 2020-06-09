
package multithreadserver;

import java.net.*;
import java.io.*;

public class MultiThreadServer implements Runnable
{
    Socket client;
    public MultiThreadServer(Socket stk)
    {
        client=stk;
    }
            

    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(2000);
        
        Socket stk;
        do
        {
        stk=ss.accept();
        System.out.println("Client Connected");
        MultiThreadServer mt=new MultiThreadServer(stk);
        Thread t=new Thread(mt);
        t.start();
        }while(true);
        
    }
    public void run()
    {
        try{
            
        StringBuffer buff;
        BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintStream ps=new PrintStream(client.getOutputStream());
        String str;
        do
        {
            str=br.readLine();
            buff=new StringBuffer(str);
            ps.println(buff.reverse());
        }while(!str.equals("bye"));
        
        }catch(Exception e){}
    }
}
