package scmethod1;

public class SCMethod1 
{
    
     int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
            
    public static void main(String[] args) 
    {
        SCMethod1 x=new SCMethod1();
        System.out.println(x.gcd(35,56));
        
        
        
        
    } 
        
        
    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
        
    }

}
