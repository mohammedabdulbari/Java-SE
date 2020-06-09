package enumdemo;

enum Dept
{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");
    
    String head;
    String location;
    
    private Dept(String head,String loc)
    {
        this.head=head;
        this.location=loc;
    }
    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }
}

public class EnumDemo 
{
    public static void main(String[] args) 
    {
        Dept d=Dept.CS;
                
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
        
        
        
    }   
}
