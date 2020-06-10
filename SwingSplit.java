package swingsplit;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;


class MyFrame extends JFrame implements ListSelectionListener
{ 
    JSplitPane sp;
    JList list;
    JLabel lbl;
    
    MyFrame()
    {
        super("Split Demo");
        
        String cols[]={"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};
        
        list=new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1=new JScrollPane(list);
        
        
        lbl=new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);
        JScrollPane p2=new JScrollPane(lbl);
        
        //sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        //sp.setDividerLocation(200);
        
        JTabbedPane tp=new JTabbedPane();
        tp.addTab("Colors", p1);
        tp.addTab("Label",p2);
        add(tp);
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
        String str=(String)list.getSelectedValue();
        
        switch(str)
        {
            case "RED": lbl.setBackground(Color.red);
                        break;
            
            case "GREEN": lbl.setBackground(Color.green);
                        break;
            case "BLUE": lbl.setBackground(Color.blue);
                        break;
            case "YELLOW": lbl.setBackground(Color.yellow);
                        break;
            case "MAGENTA": lbl.setBackground(Color.magenta);
                        break;
            case "ORANGE": lbl.setBackground(Color.orange);
                        break;
             case "BLACK": lbl.setBackground(Color.black);
                        break;           
                        
        }
    }
    
}

public class SwingSplit 
{
    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}
































/*JSplitPane sp;
    JList list;
    JLabel l;
    MyFrame()
    {
        super("Split Demo");
        
        String cols[]={"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};
        list=new JList(cols);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);
        JScrollPane p1=new JScrollPane(list);
        
        l=new JLabel(" ");
        l.setBackground(Color.RED);
        l.setOpaque(true);
        JScrollPane p2=new JScrollPane(l);
        
        sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        sp.setDividerLocation(200);
       //JTabbedPane tp=new JTabbedPane();
       //tp.addTab("Color",p1);
       //tp.addTab("Label",p2);
       
        add(sp);
                
                
    }

    
    public void valueChanged(ListSelectionEvent e) 
    {
        String s=(String)list.getSelectedValue();
        switch(s)
        {
            
            case "RED":l.setBackground(Color.red);
            break;
            case "GREEN":l.setBackground(Color.green);
            break;
            case "BLUE":l.setBackground(Color.blue);
            break;
            case "MAGENTA":l.setBackground(Color.magenta);
            break;
            case "YELLOW":l.setBackground(Color.yellow);
            break;
            case "ORANGE":l.setBackground(Color.orange);
            break;
            case "BLACK":l.setBackground(Color.black);
            break;
        } 
    }*/