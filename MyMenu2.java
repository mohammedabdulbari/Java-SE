package mymenu;

import java.awt.*;
import java.awt.event.*;


public class MyMenu extends Frame implements ActionListener
{
    Label l;
    Menu file;
    MenuItem n,o,s,c,e;
    MenuBar mb;
    
    MyMenu()
    {
        l=new Label("Menu Option");
        l.setAlignment(Label.CENTER);
        file=new Menu("File");
        n=new MenuItem("New");
        o=new MenuItem("Open");
        s=new MenuItem("Save");
        c=new MenuItem("Close");
        e=new MenuItem("Exit");
        
        file.add(n);file.add(o);file.add(c);file.add(s);file.add(e);
        mb=new MenuBar();
        mb.add(file);
        
        setMenuBar(mb);
        add(l);
        n.addActionListener(this);
        o.addActionListener(this);
        c.addActionListener(this);
        s.addActionListener(this);
        e.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String option=ae.getActionCommand();
        
        switch(option)
        {
            case "New": l.setText("New File Created");
                        break;
            case "Open":l.setText("File Open");
                        break;
            case "Close":l.setText("File Closed");
                        break;    
            case "Save":l.setText("File Saved");
                        break; 
            case "Exit":System.exit(0);
                        break;           
        }
        
    }
    public static void main(String[] args) 
    {
        MyMenu m=new MyMenu();
        m.setSize(300,300);
        m.setVisible(true);
    }
    
}
