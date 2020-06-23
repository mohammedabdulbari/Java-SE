package staticpractice1;

class Test
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
    System.out.println("Block 2");
    }
}

public class StaticPractice1 {

    
    
    /*static
    {
        System.out.println("Block 1");
    }*/
    
    
    public static void main(String[] args) 
    {
        //Test t=new Test();
        System.out.println("Main");
        Test t=new Test();
    }
    
    /*static
    {
    System.out.println("Block 2");
    }*/
    
}
