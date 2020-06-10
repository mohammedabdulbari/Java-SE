package swingmenutool;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


class MyFrame extends JFrame implements ActionListener
{ 
    JToolBar tb;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextArea ta;
    
    MyFrame()
    {
       super("Toolbar Demo");
       tb=new JToolBar();
       
       b1=new JButton(new ImageIcon("resource/images/save.png"));
       b2=new JButton(new ImageIcon("resource/images/open.png"));
       b3=new JButton(new ImageIcon("resource/images/new.png"));
       b4=new JButton(new ImageIcon("resource/images/cut.png"));
       b5=new JButton(new ImageIcon("resource/images/copy.png"));
       b6=new JButton(new ImageIcon("resource/images/split.jpg"));
       b7=new JButton(new ImageIcon("resource/images/close.png"));
       tb.add(b1);tb.add(b2);tb.add(b3);
       tb.add(new JToolBar.Separator());
       tb.add(b4);tb.add(b5);tb.add(b6);tb.add(b7);
       
       ta=new JTextArea();
       JScrollPane sp=new JScrollPane(ta);
       
       add(tb,BorderLayout.NORTH);
       add(sp,BorderLayout.CENTER);
       
       JMenuBar mb=new JMenuBar();
       JMenu file=new JMenu("File");
       JMenuItem m1=new JMenuItem("save");
       JMenuItem m2=new JMenuItem("open");
       m2.setMnemonic(KeyEvent.VK_O);
       
       file.add(m1);
       file.addSeparator();
       file.add(m2);
       mb.add(file);
       setJMenuBar(mb);
       
       b2.setActionCommand("open");
       
       b2.addActionListener(this);
       m2.addActionListener(this);
       b1.addActionListener(this);
       m1.addActionListener(this);
       
       
       
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getActionCommand().equals("open"))
        {    
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);
        File f=fc.getSelectedFile();
        
        try{
            FileInputStream fi=new FileInputStream(f);
            byte b[]=new byte[fi.available()];
            fi.read(b);
            String str=new String(b);
            ta.setText(str);
            fi.close();
            
        }
        catch(Exception e){}
        }
        else
        {
            Color col=JColorChooser.showDialog(this, "Font Color", Color.red);
            ta.setForeground(col);
        }
    }
    
}
public class SwingMenuTool 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }   
}






























/*
         tb=new JToolBar();
        b1=new JButton(new ImageIcon("resource/images/save.png"));
        tb.add(b1);
        b2=new JButton(new ImageIcon("resource/images/open.png"));
        tb.add(b2);
        b3=new JButton(new ImageIcon("resource/images/new.png"));
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        b4=new JButton(new ImageIcon("resource/images/cut.png"));
        tb.add(b4);
        b5=new JButton(new ImageIcon("resource/images/copy.png"));
        tb.add(b5);
        b6=new JButton(new ImageIcon("resource/images/split.jpg"));
        tb.add(b6);
        b7=new JButton(new ImageIcon("resource/images/close.png"));
        tb.add(b7);

        b1.setActionCommand("save");
        b2.setActionCommand("open");
        
        b2.addActionListener(this);
        b1.addActionListener(this);
        
        ta=new JTextArea();
        JScrollPane p=new JScrollPane(ta);
        add(tb,BorderLayout.NORTH);
        add(p,BorderLayout.CENTER);
        
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem m1=new JMenuItem("open");
        JMenuItem m2=new JMenuItem("save");
        file.add(m1);
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);
        m1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("open"))
        {
            
            JFileChooser fc=new JFileChooser();
            
            int retval=fc.showOpenDialog(this);
            File f=fc.getSelectedFile();
            try{
                FileInputStream fi=new FileInputStream(f);
                byte b[]=new byte[fi.available()];
                fi.read(b);
                String data=new String(b);
                ta.setText(data);
                fi.close();
            }catch(Exception e){}
            
                
            
        }
*/
