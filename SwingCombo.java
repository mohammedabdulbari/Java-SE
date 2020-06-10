package swingcombo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

 
class MyFrame extends JFrame implements ActionListener 
{
                          
    JLabel l;
    
    public MyFrame() 
    {
 
        String[] cities = { "New York", "Delhi", "Paris", "Berlin" };
        
        
        JComboBox cb = new JComboBox(cities);
        cb.setSelectedIndex(0);
        cb.setEditable(true);
        cb.addActionListener(this);
 
        l = new JLabel();
        
        l.setIcon(new ImageIcon("/Users/abdulbari/NetBeansProjects/SwingCombo/src/swingcombo/images/Berlin.jpg"));
       setLayout(new FlowLayout());
        add(cb);
        add(l);
       
    }
 
    
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String name = (String)cb.getSelectedItem();
ImageIcon icon = new ImageIcon("/Users/abdulbari/NetBeansProjects/SwingCombo/src/swingcombo/images/"+ name + ".jpg");
        
        l.setIcon(icon);
        String s=(String)cb.getSelectedItem();
        for(int i=0;i<cb.getItemCount();i++)
        {
            if(s.equals(cb.getItemAt(i)))
                return;
        }
        cb.addItem(s);
    }
 
}
 
    
 
    
        
   


public class SwingCombo 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
