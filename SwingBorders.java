
package swingborders;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class MyFrame extends JFrame 
{
    JLabel l;
    JTextField tf;
    JButton b;
    
    JPanel p;
    
    MyFrame()
    {
        l=new JLabel("Name");
        tf=new JTextField(20);
        b=new JButton("OK");
        p=new JPanel();
        
        p.add(l);
        p.add(tf);
        p.add(b);
        
        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER,   TitledBorder.LEFT);
        p.setBorder(br);
        
        setLayout(new FlowLayout());
        add(p);
    }
   
}
public class SwingBorders 
{
    
    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
