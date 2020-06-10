package swinginternalframe;

import javax.swing.*;
import java.awt.event.*;

class MyInternalFrame extends JInternalFrame
{
    static int count =0;
    JTextArea ta;
    JScrollPane sp;
    MyInternalFrame()
    {
        super("Document "+(++count),true,true,true,true);
        
        ta=new JTextArea();
        sp=new JScrollPane(ta);
        add(sp);
        
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem m1=new JMenuItem("Save");
        
        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);
        
        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
    
}

class MyFrame extends JFrame implements ActionListener
{
    JDesktopPane jp;
    MyFrame()
    {
        super("Internal Frame Demo");
        
        jp=new JDesktopPane();
        setContentPane(jp);
        
        JMenuBar mb=new JMenuBar();
        JMenu d=new JMenu("Document");
        JMenuItem m1=new JMenuItem("New");
        
        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);
        
        m1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        MyInternalFrame mi=new MyInternalFrame();
        jp.add(mi);
        
    }
}
public class SwingInternalFrame 
{
    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}


























/* class MyInternalFrame extends JInternalFrame 
{
    JTextArea ta;
    static int count=1;
    MyInternalFrame()
    {
        super("Document "+count++,true,true,true,true);
        ta=new JTextArea();
        JScrollPane jp=new JScrollPane(ta);
        add(jp);
        JMenuBar mb=new JMenuBar();
        JMenu f=new JMenu("File");
        JMenuItem mi=new JMenuItem("Save");
        f.add(mi);
        mb.add(f);
        setJMenuBar(mb);
    }
}

class MyFrame extends JFrame implements ActionListener
{
    JDesktopPane dp;
    MyFrame()
    {
        dp=new JDesktopPane();
        setContentPane(dp);
        MyInternalFrame mi=new MyInternalFrame();
        mi.setVisible(true);
        mi.setSize(300,300);
        mi.setLocation(50,50);

        dp.add(mi);
         
        JMenuBar mb=new JMenuBar();
        JMenu f=new JMenu("Document");
        JMenuItem m1=new JMenuItem("New");
        f.add(m1);
        mb.add(f);
        setJMenuBar(mb);
        m1.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        MyInternalFrame mi=new MyInternalFrame();
        mi.setVisible(true);
        mi.setSize(300,300);
        mi.setLocation(50,50);
       try {mi.setSelected(true);}catch(Exception e){}
        dp.add(mi);
        
    }
*/