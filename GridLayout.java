package gridlayoutdemo;

import java.awt.*;

class MyFrame extends Frame 
{
    Button b1,b2,b3,b4,b5,b6;
    
    public MyFrame()
            {
                super("Grid Layout Demo");
                
                setLayout(new GridLayout(3,2));
                
                b1=new Button("one");
                b2=new Button("two");
                b3=new Button("three");
                b4=new Button("four");
                b5=new Button("five");
                b6=new Button("six");
                
                
                
                add(b1);
                add(b2);
                add(b3);
                add(b4);
                add(b5);
                add(b6);
}
}
public class GridLayoutDemo {

    public static void main(String[] args) {

        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
       
    }
    
}
