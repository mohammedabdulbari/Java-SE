package firstapp;

import java.awt.*;

public class FirstApp extends Frame
{
    Label l;
    TextField tf;
    Button b;
    
    public FirstApp()
    {
        super("My App");
        
        setLayout(new FlowLayout());
        
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");
        
        add(l);
        add(tf);
        add(b);   
        
    }  
    public static void main(String[] args) 
    {
        FirstApp f=new FirstApp();
        f.setSize(400,400);
        f.setVisible(true);
    } 
}

