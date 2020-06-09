package checkboxdemo;

import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    
    public MyFrame()
    {
        super("Check Box Demo");
        
        l=new Label("Nothing is Selected");
        
        cbg=new CheckboxGroup();
        
        c1=new Checkbox("Java",false,cbg);
        c2=new Checkbox("Python",false,cbg);
        c3=new Checkbox("C#",false,cbg);
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(c1);
        add(c2);
        add(c3);
        
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
            String str="";
            
            if(c1.getState())
                str=str+" "+c1.getLabel();
            if(c2.getState())
                str=str+" "+c2.getLabel();
            if(c3.getState())
                str=str+" "+c3.getLabel();
            if(str.isEmpty())
                str="Nothing is Selected";
            
            l.setText(str);
    }
    
}

public class CheckboxDemo 
{
        
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
        
    }   
}
