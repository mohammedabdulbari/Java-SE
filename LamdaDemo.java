package lamdademo;


interface MyLambda
{
    public int display(String str1,String str2);
}


public class LamdaDemo 
{   
    public LamdaDemo(String s)
    {
        System.out.println(s.toUpperCase());
    }
    
    public static void main(String[] args) 
    {       
                
        MyLambda ml=String::compareTo;
        
        
        System.out.println(ml.display("zello","well"));
        
               
    }
}
