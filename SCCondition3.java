
package sccondition3;

import java.util.*;

public class SCCondition3 
{
    
     public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a URL");
        String url=scan.nextLine();
     
        String protocol=url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        
        
        String ext=url.substring(url.lastIndexOf(".")+1);
        
        if(ext.equals("com"))
            System.out.println("Commercial");
        else if(ext.equals("org"))
            System.out.println("Organisation");
        else if(ext.equals("net"))
            System.out.println("Network");
            
        
        
    }
     
    
    /* Display Day name, by taking Day number
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Day number");
        int day=scan.nextInt();
        
        if(day==1)
        {
            System.out.println("Mon");
        }
        else if(day==2)
        {
              System.out.println("Tue");
        }
        else if(day==3)
        {
              System.out.println("Wed");
        }
        else if(day==4)
        {
              System.out.println("Thur");
        }
        else if(day==5)
        {
              System.out.println("Fri");
        }
        else if(day==6)
        {
              System.out.println("Sat");
        }
        else if(day==7)
        {
              System.out.println("Sun");
        }
        else
        {
            System.out.println("Invalid Day Number");
        }
        
    }*/
    
}
