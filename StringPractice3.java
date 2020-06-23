package stringpractice3;

public class StringPractice3 {

    public static void main(String[] args) {
        
        /*
        String str1="Pyramid";
        String str2="pyramid";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        //System.out.println(str1==str2);
        */
        
        /*
        //String str1="pyramid";
        
        String str1="china wall";
        String str2=new String("china tall");
        
        //System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        */
        
        
        String str1="the great wall ";
        String str2="of china";
        System.out.println(str1.contains("wall"));
        System.out.println(str1.concat(str2));//System.out.println(str1 + str2);
        
    }
    
}
