package stringpractice4;

public class StringPractice4 {

    public static void main(String[] args) {
        
        /*String str1="f";
        System.out.println(str1.matches("."));*/
        
        /*String str1="a";//b,c
        System.out.println(str1.matches("[abc]"));*/
        
        /*String str1="p";//true for alphabets other than abc
        System.out.println(str1.matches("[^abc]"));*/
        
        /*String str1="7";//A,a7
        System.out.println(str1.matches("[a-zA-Z0-9]"));//[a-z][0-9]*/
        
        /*String str1="b";
        System.out.println(str1.matches("a|b"));*/
        
        /*String str1="b";
        System.out.println(str1.matches("\\w"));*/
        
        /*String str1="5";
        System.out.println(str1.matches("\\d"));*/
        
        String str1="$";
        System.out.println(str1.matches("\\D"));
    }
    
}
