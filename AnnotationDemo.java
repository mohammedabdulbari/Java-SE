
package annotationdemo;

class A
{
    public void display()
    {
        
    }
}

class B extends A
{
    @Override
    public void display()
    {
        
    }
    @Deprecated
    public void show()
    {
        
    }
    
}

public class AnnotationDemo 
{
    
    public static void main(String[] args) 
    {
        int i;
        @SuppressWarnings("deprecation")

        B b=new B();
  
        b.show();
    }
    
}
