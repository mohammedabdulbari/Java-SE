package text;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
    Label l1,l2,l3;
    TextField tf1,tf2;
    public MyFrame()
    {
        super("Text Field");
        
        l1=new Label("No text is entered yet");
        l2=new Label("No text is entered yet");
        l3=new Label("enter key is not yet hit");
        tf1=new TextField(20);
        tf2=new TextField(20);
        tf1.setEchoChar('*');
        tf2.setEchoChar('*');
        Handler h=new Handler();
        
        tf1.addTextListener(h);
        tf2.addTextListener(h);
        tf1.addActionListener(h);
        tf2.addActionListener(h);
        
        
        setLayout(new FlowLayout());
        
        add(l1);
        add(l2);
        add(tf1);
        add(tf2);
        add(l3);
        
    }
    class Handler implements TextListener,ActionListener{

    public void textValueChanged(TextEvent e) {
        if(e.getSource()==tf1)
        l1.setText(tf1.getText());
        else
        l2.setText(tf2.getText());
        
    }
         public void TextValueChanged(TextEvent e) {
        l2.setText(tf2.getText());
        
    }
   
    public void actionPerformed(ActionEvent e) {
        l3.setText(tf1.getText()+" "+tf2.getText());
        
    }
}
}
public class Text {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
