
package swingslider;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class MyFrame extends JFrame implements ChangeListener
{
    JSlider sl;
    JPanel p1,p2;
    JProgressBar pb;
    
    int w=50;

    MyFrame()
    {
        sl=new JSlider(0,100,50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);
        
        pb=new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(true);
       // pb.setIndeterminate(true);
        
        p1=new JPanel(){
            public void paintComponent(Graphics g)
            {
                g.drawOval(200, 200, w, w);
            }
        };
        
        p2=new JPanel();
        p2.add(pb);
        
        add(sl,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        
        sl.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) 
    {
        w=sl.getValue();
        p1.repaint();
        pb.setString(w+"%");
        pb.setStringPainted(true);
        pb.setValue(w);
       
    }
    
}

public class SwingSlider 
{
    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(500,500);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}





























/*
super("Demo");
        sl=new JSlider(0,100);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);
        sl.setPaintTrack(true);
        
        sl.addChangeListener(this);
        //setLayout(new FlowLayout());
        p1=new JPanel();
        p1.add(sl);
        add(sl,BorderLayout.NORTH);
         p2=new JPanel(){@Override
    public void paintComponent(Graphics g)
    {
        g.drawOval(100,10,w,w);
    }};
        p2.setSize(400,400);
        p2.setOpaque(true);
        add(p2,BorderLayout.CENTER);
        pb=new JProgressBar();
        pb.setIndeterminate(true);
        pb.setStringPainted(true);
        pb.setString(w+"%");
        pb.setValue(50);
        p3=new JPanel();
        p3.add(pb);
        add(p3,BorderLayout.SOUTH);
        
    }

    
    public void stateChanged(ChangeEvent e) 
    {
        pb.setIndeterminate(false);

        w=sl.getValue();
        p2.repaint();
        pb.setValue(w);
        pb.setString(w+"%");
    }
    
*/