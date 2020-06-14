
package expression2;

import java.lang.*;
import java.util.*;


public class Expression2 {

    
    public static void main(String[] args) 
    {
        Scanner sc=new  Scanner(System.in);
        int length,breadth,height;
        int totalArea,volume;
        
        System.out.println("Enter length, breadth and height");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        
        totalArea=2*(length*breadth+length*height+breadth*height);
        
        volume=length*breadth*height;
        
        System.out.println("Total Area "+totalArea);
        System.out.prinlt("Volume "+volume);
        
        
    }
    
}
