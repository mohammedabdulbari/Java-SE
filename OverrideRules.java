package overriderules;



class Super
{
    private void display()//or even protected may not give any error.
    {
        System.out.println("Super display.");
        
    }
}

class Sub extends Super    
{
    //@Override if public
    public void display()
    {
        System.out.println("Sub diaplay.");
        
    }
}

public class OverrideRules {

    public static void main(String[] args) {
        
        Sub s=new Sub();
        
    }
    
}
