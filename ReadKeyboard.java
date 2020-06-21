package readkeyboard;

import java.util.*;

public class ReadKeyboard {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //int  x=sc.nextInt();
        //float x=sc.nextFloat();
        //String x=sc.nextLine();
        
        int x,y;
        System.out.println("Eneter 2 numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        
        int z=x+y;
        System.out.println("Sum is "+z);
        
        
        /*sc.useRadix(2);
        int x=sc.nextInt();
        System.out.println(x);*/
    }
    
}
