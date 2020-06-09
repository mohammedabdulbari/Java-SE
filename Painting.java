package painting;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
    int x=0,y=0;
    
    MyFrame()
    {
        super("Painting");
     
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me)
            {
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.setFont(new Font("Luminari",Font.BOLD,30));
        g.drawString("Hello", x, y);
    }
    
}

public class Painting 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}
