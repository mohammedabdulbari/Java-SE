package stringpractice1;

public class StringPractice1 {

    public static void main(String[] args) {
        
        String str=new String("netbeans");
        
        /*
        //System.out.println(str.length());
        int len=str.length();
        System.out.println(len);*/
        
        
        /*String str2=str.toUpperCase();
        System.out.println(str2);*/
        
        
        /*str=str.trim();
        System.out.println(str);*/
        
        /*String str2=str.substring(3);
        System.out.println(str2);*/
        
        String str2=str.replace('e', 'M');
        //System.out.println(str2);
        
        System.out.println(str2+ " " +str);
        
    }
    
}
