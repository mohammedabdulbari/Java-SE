package adapterdemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
    MyFrame()
    {
        super("Adapter Demo");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }    
}

public class AdapterDemo 
{  
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}
