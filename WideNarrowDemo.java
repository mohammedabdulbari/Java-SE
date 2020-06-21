package widenarrowdemo;

public class WideNarrowDemo {

    public static void main(String[] args) {
        byte b=5;
        short s=120;
        int i=10;
        long l=10;
        //float f=10;
        float f=10.5f;
        double d=10;
        char c=10;
        boolean bl=true;
        
        /*b=(byte)s;
        System.out.println(b);
        i=s;
        l=s;
        f=s;
        d=s;*/
        
        i=(int)f;
        System.out.println(i);
    }
    
}
