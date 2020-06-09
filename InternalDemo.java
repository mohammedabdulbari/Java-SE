
package internaldemo;

import javax.swing.*;
import java.awt.event.*;

class MyInternalFrame extends JInternalFrame
{
    static int count=0;
    JTextArea ta;
    JScrollPane sp;
    
    MyInternalFrame()
    {
        super("DOcuments"+(++count),true,true,true,true);
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
    JDesktopPane dp;
    MyFrame()
    {
        super("Internal Frame Demo");
        dp=new JDesktopPane();
        setContentPane(dp);
        JMenuBar mb=new JMenuBar();
        JMenu d=new JMenu("Document");
        JMenuItem m1=new JMenuItem("new");
        
        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);
        
        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame mi=new MyInternalFrame();
        dp.add(mi);
    }
}
public class InternalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
