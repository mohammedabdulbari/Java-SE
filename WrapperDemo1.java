package wrapperdemo1;

public class WrapperDemo1 {

    public static void main(String[] args) {
        
        float a=12.5f;
        //Float b=12.5f;
        //Float b=-12.5f/0;
        Float b=(float)Math.sqrt(9);
        
        //System.out.println(b.equals(a));
        //System.out.println(b.isInfinite());
        //System.out.println(Float.POSITIVE_INFINITY==b);
        //System.out.println(b==Float.NEGATIVE_INFINITY);
        //System.out.println(b.isNaN());
        System.out.println(b!=Float.NaN);
    }
    
}
