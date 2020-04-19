package scconditions;

import java.util.Scanner;

public class SCConditions 
{
    
    public static void main(String[] args) 
    {
           
           int m1,m2,m3;
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println("Enter marks of 3 Subjects ");
           m1=sc.nextInt();
           m2=sc.nextInt();
           m3=sc.nextInt();
           
           float avg=(float)(m1+m2+m3)/3;
           
           if(avg>=70)
           {
               System.out.println("Grade A");
           }
           else if(avg>=60 && avg<70)
           {
               System.out.println("Grade B");
           }
           else if(avg>=50 && avg<60)
           {
               System.out.println("Grade C");
           }
           else if(avg>=40 && avg<50)
           {
               System.out.println("Grade D");
           }
           else 
           {
               System.out.println("Grade E");
           }
    }
    
    //Check if a person is young
    /*
    public static void main(String[] args) 
    {
           
           int age;
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println("Enter your Age ");
           age=sc.nextInt();
           
           if(age>=14 && age<=55)
           {
               System.out.println("You are Young");
           }
           else
           {
               System.out.println("you are Not Young");
           }
        
        
    }*/
    
    /*
    Eben or Odd
    public static void main(String[] args) 
    {
           int n;
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println("Enter a number ");
           n=sc.nextInt();
           
           if(n%2==0)
           {
               System.out.println("It is a Even Number");
           }
           else
           {
               System.out.println("It is a Odd Number");
           }
           
    }   */
}
