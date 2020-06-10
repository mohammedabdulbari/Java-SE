package swingcombolist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



class MyFrame extends JFrame implements ActionListener
{
    JComboBox c;
    JList l;
    DefaultListModel dm;
    MyFrame()
    {
        super("Combo List");
        
        String combo[]={"Cities","Places","Country"};
        c=new JComboBox(combo);
         dm=new DefaultListModel();
        ArrayList<String> cities=new ArrayList<>(java.util.List.of("Delhi","Mumbai","New York","Paris","Berlin","Tokyo"));
        dm.addAll(cities);
        l=new JList(new String[]{"Delhi","Mumbai","New York","Paris","Berlin","Tokyo"});
        l.setVisibleRowCount(3);
        JScrollPane sp=new JScrollPane();
        
        sp.add(l);
        sp.setBounds(10,10,100,200);
        //setLayout(new FlowLayout());
        //add(c);
        add(sp);
        c.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        dm.removeAllElements();
        DefaultListModel dm=new DefaultListModel();
        ArrayList<String> cities=new ArrayList<>(java.util.List.of("Taj Mahal","Niagra Fall","Tower of Pisa","China Wall","Pyramids"));
        dm.addAll(cities);
        
        
    }
}

public class SwingComboList 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
