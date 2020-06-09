package sccollection1;

import java.io.*;
import java.util.*;

class Account implements Serializable
{
    String accno;
    String name;
    double balance;
    
    Account(){}
    
    Account(String a,String n,double b)
    {
        accno=a;
        name=n;
        balance=b;
    }
    
    public String toString()
    {
        return "Account No:"+accno+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}

public class SCCollection1 
{
   public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        
        Account acc=null;
        HashMap<String,Account> hm=new HashMap<>();
        

        try
        {
        FileInputStream fis=new FileInputStream("Accounts.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        
        int count=ois.readInt();
        for(int i=0;i<count;i++)
        {
            acc=(Account)ois.readObject();
            System.out.println(acc);
            hm.put(acc.accno,acc);
        }
        fis.close();
        ois.close();
        
        }
        catch(Exception e)
        {
            
        }
        
        
        
        FileOutputStream fos=new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        System.out.println("Menu");
        
        int choice;
        String accno,name;
        double balance;
        
        do
        {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");            
            System.out.println("Enter your choice ");
            choice=sc.nextInt();
            
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            switch(choice)
            {
                case 1: System.out.println("Enter Details Accno, Name ,balance ");
                        accno=sc.nextLine();
                        name=sc.nextLine();
                        balance=sc.nextDouble();
                        acc=new Account(accno,name,balance);
                        hm.put(accno, acc);
                        System.out.println("Account Created for "+name);

                        break;
                case 2: System.out.println("Enter Accno");
                       
                        accno=sc.nextLine();
                        hm.remove(accno);
                        break;
                case 3: System.out.println("Enter Accno");
                        accno=sc.nextLine();
                        acc=hm.get(accno);
                        System.out.println(acc);
                        break;
                case 4:
                        for(Account a:hm.values())
                            System.out.println(a);
                        break;
                        
                case 5:
                case 6: oos.writeInt(hm.size());
                
                        for(Account a:hm.values()) 
                            oos.writeObject(a);
                        
            }
            
        }while(choice!=6);
        oos.flush();
        oos.close();

        fos.close();
    }   
}


    

