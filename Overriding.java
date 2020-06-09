
package overriding;


class TV
{
    public void switchON(){ System.out.println("TV is Switched ON"); }
    
    public void changeChannel() { System.out.println("TV Channel is Changed "); }
    
}

class SmartTV extends TV
{
    @Override
    public void switchON(){ System.out.println("Smart TV is Switched ON"); }
    
    @Override
    public void changeChannel() { System.out.println("SmartTV Channel is Changed "); }
    
    public void browse(){ System.out.println("Smart Tv Browsing"); }
    
}

public class Overriding 
{

    public static void main(String[] args) 
    {
        TV t=new SmartTV();
        
        t.switchON();
        t.changeChannel();
        
    }
    
}
