package incdec;

public class IncDec {

    public static void main(String[] args) {
        
        //float x=3.5f
        //char x='A'
        //byte x=5
        
        /*int x=5;
        x++;  //++x
        System.out.println(x);*/
        
        /*int x=5,y;
        y=x++; //++x
        System.out.println(x+" "+y);*/
        
        int x=5,y=4,z;
        z=2 * x++ + 3 * ++y;
        System.out.println(z);
    }
    
}
