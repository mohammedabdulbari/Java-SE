package scloop2;

import java.util.*;

public class SCLoop2 
{
    
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=scan.nextInt();
        int m=n;
        int rev=0,r;
        
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(rev==m)
            System.out.println("Its is a Palindrome");
        else
            System.out.println("Its is not a Palindrome");
            
        
        
    }
    
    
    
    /* Reverse of a number
    
    
     public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=scan.nextInt();
  
        int rev=0,r;
        
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        
        System.out.println("Reverse Number "+rev);
        
        
    }
    

    */
    
    /* Check if a Numbewr is Armstrong or Not
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=scan.nextInt();
        
        int m=n;
        int sum=0;
        int r;
        
        while(n>0)
        {
            r=n%10;
            n=n/10;
            
            sum=sum+r*r*r;
        }
        if(sum==m)
            System.out.println("Its a Armstrong Number");
        else
            System.out.println("Its Not a Armstrong Number");
    }   */
    
    /* Count the Number of Digits in a Number
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=scan.nextInt();
        
        int count=0;
        
        while(n>0)
        {
            n=n/10;
            
            count++;
        }
        
        System.out.println(count);
        
    }   
    */
    
    /* Display digits of a Number
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=scan.nextInt();
        
        int r;
        
        while(n>0)
        {
            r=n%10;
            n=n/10;
            
            System.out.println(r);
        }
        
            
    }   
    */
}
