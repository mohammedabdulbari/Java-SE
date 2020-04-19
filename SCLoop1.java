package scloop1;

import java.util.*;

public class SCLoop1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=sc.nextInt();
     
        long fact=1;
        
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        
        System.out.println("Factorial is "+fact);
        
    }
    
    
    
    /* Sum of n Natural Numbers
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=sc.nextInt();
     
           int sum=0;
           
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        
        System.out.println("Sum of "+n+" Number is "+sum);
        
        
    }*/
    
    /* Display Multiplication Table
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
        
        
    }  */ 
}
