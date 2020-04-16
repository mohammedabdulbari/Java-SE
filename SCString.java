package scstring;

public class SCString 
{
    //Cheking if a string is Binary number
    public static void main(String[] args) 
    {
        int b=100110010;
        
        String str=String.valueOf(b);
        
        System.out.println(str.matches("[01]+"));
        
        
    }
    
    /* 
    public static void main(String[] args) 
    {
        
        String str="a!B@c#1$2%3";
        
        str=str.replaceAll("[^a-zA-Z0-9]", "");
                
        System.out.println(str);
        
        
    } */
   /* 
    Counting words in a String
    public static void main(String[] args) 
    {
        
        String str="      abc     def     gh   ijk    ";
        
        str=str.replaceAll("\\s+", " ").trim();
        
        String words[]=str.split("\\s");
        
        System.out.println(words.length);
        
        
    }*/   
}
