
package checkedunchecked;

class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Balance Should not be less than 5000";
    }
}

public class CheckedUnchecked 
{
    static void fun1()
    {
        try
        {
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
    }
    
    static void fun2()
    {
        fun1();
    }
    
    static void fun3()
    {
        fun2();
    }
    
    public static void main(String[] args) 
    {
       fun3();
    }   
}
