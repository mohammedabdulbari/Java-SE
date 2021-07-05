package scmethod1;

public class SCMethod1 
{         
     int gcd(int a, int b)
	{
	    if (a == 0)
	        return b;
	    return gcd(b % a, a);
	}

    public static void main(String[] args) 
    {
        SCMethod1 x=new SCMethod1();
        System.out.println(x.gcd(35,56));
        
        
        
        
    } 
        
        
    static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)     // changed by equating to n/2
        {
            if(n%i==0)
                return false;
        }
        return true;
        
    }

}
