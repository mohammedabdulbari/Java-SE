
package swingtwo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame 
{
    
    MyFrame() 
    {
        super("SwingDemo");
        
       // jf =new JFrame("Layered Pane Example");

         
         JPanel p1=new JPanel();
         JPanel p2=new JPanel();
         JPanel p3=new JPanel();
         JButton first= new JButton("First");

         first.setBackground(Color.red);

         first.setBounds(50,30,100,100);

         JButton second= new JButton("Second");

         second.setBackground(Color.yellow);

         second.setBounds(140,60,100,100);

         JButton third= new JButton("Third");

         third.setBackground(Color.green);

         third.setBounds(230,90,100,100);
         p1.add(first);
         p2.add(second);
         p3.add(third);
         
         JSplitPane LPane =new JSplitPane(SwingConstants.VERTICAL,p1,p2);

         getContentPane() .add(LPane);
         
        // LPane.add(p3, "Teesra");

         setDefaultCloseOperation(this.EXIT_ON_CLOSE);

         setSize (400,300) ;

         setVisible(true);
      
               
    }
            
}

public class SwingTwo {

        public static void main(String[] args) {
         MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
